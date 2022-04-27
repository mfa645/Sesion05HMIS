package ual.hmis.sesion05.ej1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestEjercicio1 {
	@ParameterizedTest (name = "{index} => transformar ({0}) sale ({1})")
	@CsvSource({"210,7"})
	void test1(int numero, int resto) {
		//Arrange
		Ejercicio1 e1 = new Ejercicio1();
		//Act
		int resultado = e1.transformar(numero);
		//Assert
		assertEquals(7,resto);
	}

}
