package ual.hmis.sesion05.ej3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class TestEjercicio3 {

    @ParameterizedTest (name = "{index} => Enmascarar password {0} sale {1}")
    @CsvFileSource(resources="/Ejercicio3.csv")

    void testEjercicio3(String password, String resultado){
        // 1. Arrange 
        Ejercicio3 e3 = new Ejercicio3();

        // 2. Act
        String resultadoEnmascarar = e3.enmascarar(password);

        // 3. Assert
        assertEquals(resultadoEnmascarar, resultado);
    }
}
