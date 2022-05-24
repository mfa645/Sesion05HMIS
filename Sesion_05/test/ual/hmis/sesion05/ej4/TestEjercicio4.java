package ual.hmis.sesion05.ej4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestEjercicio4 {

        @ParameterizedTest (name = "{index} => Calificar el array {0} sale {1}")
        @MethodSource("datosTest")

        void testEjericio04(double[] notas, String[] calificaciones){
            // 1. Arrange 
            Ejercicio4 e4 = new Ejercicio4();

            // 2. Act
            e4.calculaCalificaciones(notas);

            // 3. Assert
            for(int i = 0; i < calificaciones.length; i++) {
                assertEquals(e4.getCalificaciones()[i], calificaciones[i]);
            }

        }

        private static Stream<Arguments> datosTest() {
            return Stream.of(
                    Arguments.of(new double[]{-3.0, 0.0, 2.0, 3.0, 5.0, 5.9, 8, 9.3, 10.0, 11}, 
                    new String[]{"Error en la nota","Suspenso", "Suspenso", "Suspenso","Aprobado", "Aprobado", "Notable", "Sobresaliente","Matrícula","Error en la nota"})
           );
        }
    }