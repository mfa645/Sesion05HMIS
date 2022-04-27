package ual.hmis.sesion05.ej5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import ual.hmis.sesion05.ej4.Ejercicio4;

class TestEjercicio5 {

	
	//========================================================================================================
  	//												TESTS
  	//========================================================================================================

	    @ParameterizedTest (name = "{index} => Juntar las listas {0} y {1} sale {2}")
    @MethodSource("datosA1A2Basico")
    void testEjericio5Basico(ArrayList<String> A1, ArrayList<String> A2, String[] listaMezclada){
        // 1. Arrange 
        Ejercicio5 e5 = new Ejercicio5();

        // 2. Act
        String resultado= e5.listaOrdenadaEstudiantes(A1, A2);
        
        // 3.Assert
       assertEquals(Arrays.toString(listaMezclada), resultado );
    }
    
    @ParameterizedTest (name = "{index} => Juntar las listas {0} y {1} sale {2}")
    @MethodSource("datosVacioVacio")
    void testEjericio5VacioVacio(ArrayList<String> A1, ArrayList<String> A2, String[] listaMezclada){
        // 1. Arrange 
        Ejercicio5 e5 = new Ejercicio5();

        // 2. Act
        String resultado= e5.listaOrdenadaEstudiantes(A1, A2);
        
        // 3.Assert
       assertEquals(Arrays.toString(listaMezclada), resultado );
    }
    
    @ParameterizedTest (name = "{index} => Juntar las listas {0} y {1} sale {2}")
    @MethodSource("datosVacioNoVacio")
    void testEjericio5VacioNoVacio(ArrayList<String> A1, ArrayList<String> A2, String listaMezclada){
        // 1. Arrange 
        Ejercicio5 e5 = new Ejercicio5();

        // 2. Act
        String resultado= e5.listaOrdenadaEstudiantes(A1, A2);
        
        // 3.Assert
       assertEquals(listaMezclada, resultado );
    }
    
    @ParameterizedTest (name = "{index} => Juntar las listas {0} y {1} sale {2}")
    @MethodSource("datosNoVacioVacio")
    void testEjericio5NoVacioVacio(ArrayList<String> A1, ArrayList<String> A2, String listaMezclada){
        // 1. Arrange 
        Ejercicio5 e5 = new Ejercicio5();

        // 2. Act
        String resultado= e5.listaOrdenadaEstudiantes(A1, A2);
        
        // 3.Assert
       assertEquals(listaMezclada, resultado );
    }
    
    @ParameterizedTest (name = "{index} => Juntar las listas {0} y {1} sale {2}")
    @MethodSource("datosElementosDuplicados")
    void testEjericio5datosElementosDuplicados(ArrayList<String> A1, ArrayList<String> A2,String listaMezclada){
        // 1. Arrange 
        Ejercicio5 e5 = new Ejercicio5();

        // 2. Act
        String resultado= e5.listaOrdenadaEstudiantes(A1, A2);
        
        // 3.Assert
       assertEquals(listaMezclada, resultado );
    }
    
    
    
    
    
    
  //========================================================================================================
  	//												STREAM ARGUMENTS
  	//========================================================================================================

    private static Stream<Arguments> datosA1A2Basico() {
    	ArrayList<String> A1 = new ArrayList<String>();
    	A1.add("Maria Fernandez");
    	A1.add("Alejandro Alvarez");
    	A1.add("Bilbo Bolson");
    	A1.add("Carlos Tercero");
    	
    	ArrayList<String> A2 = new ArrayList<String>();
    	A2.add("Dario Fernandez");

    	
        return Stream.of(
                Arguments.of(A1, A2,
                new String[]{ "Alejandro Alvarez","Bilbo Bolson","Carlos Tercero",
                		"Dario Fernandez","Maria Fernandez"})
                	);
    }
    
    private static Stream<Arguments> datosVacioVacio() {
    	ArrayList A1 = new ArrayList();
    	
    	ArrayList A2 = new ArrayList();
    	
        return Stream.of(
                Arguments.of(A1, A2, new String[]{})
                	);
    }
    
    private static Stream<Arguments> datosVacioNoVacio() {
    	ArrayList<String> A1 = new ArrayList<String>();
      	ArrayList<String> A2 = new ArrayList<String>();
    	A2.add("Maria Fernandez");
    	A2.add("Alejandro Alvarez");
    	A2.add("Bilbo Bolson");
    	A2.add("Carlos Tercero");
    	
        return Stream.of(
                Arguments.of(A1, A2, "[Alejandro Alvarez, Bilbo Bolson, Carlos Tercero, Maria Fernandez]" )
                	);
    }
    
    private static Stream<Arguments> datosNoVacioVacio() {
    	ArrayList<String> A1 = new ArrayList<String>();
    	A1.add("Maria Fernandez");
    	A1.add("Alejandro Alvarez");
    	A1.add("Bilbo Bolson");
    	A1.add("Carlos Tercero");
    	
    	
    	ArrayList<String> A2 = new ArrayList<String>();
    	
        return Stream.of(
                Arguments.of(A1, A2, "[Alejandro Alvarez, Bilbo Bolson, Carlos Tercero, Maria Fernandez]")
                	);
    }
    
    private static Stream<Arguments> datosElementosDuplicados() {
    	ArrayList<String> A1 = new ArrayList<String>();
    	A1.add("Maria Fernandez");
    	A1.add("Alejandro Alvarez");
    	A1.add("Bilbo Bolson");
    	A1.add("Carlos Tercero");
    	
    	ArrayList<String> A2 = new ArrayList<String>();
    	A2.add("Maria Fernandez");
    	A2.add("Alejandro Alvarez");
    	A2.add("Bilbo Bolson");
    	A2.add("Carlos Tercero");
    	
        return Stream.of(
                Arguments.of(A1, A2, "[Alejandro Alvarez, Bilbo Bolson, Carlos Tercero, Maria Fernandez]" )
                	);
    }
}
