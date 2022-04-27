package ual.hmis.sesion05.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ej1.Ejercicio1;

class TestEjercicio2 {
@ParameterizedTest (name = "{index} => logearse con ({0},{1}) es ({2})")
@CsvSource({"User, Pass1, true",
    "usuario, Pass1, false",
    "usuario, PASS1, false",
    "user, pass, false",
    "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,aaa,false",
    "aaaa, aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,false",
    "user2, Pass, false",
    "User, Pass2, false",
    "User1, Pass1, false"})
	void testParam(String user, String password, boolean resultado) {
	//Arrange
	Ejercicio2 e2LoginVacio = new Ejercicio2();
	Ejercicio2 e2 = new Ejercicio2();
	
	
	//Act
	boolean loginResult = e2.login(user, password);
	boolean loginVacioResult = e2LoginVacio.login("", "");
	boolean loginVacioResult2 = e2LoginVacio.login("a", "");

	
	//Assert
	assertEquals(loginResult,resultado);
	
	assertEquals(false,loginVacioResult);
	
	assertEquals(false,loginVacioResult2);

	}

}
