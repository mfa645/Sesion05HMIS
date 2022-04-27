package ual.hmis.sesion05.ej2;

public class Ejercicio2 {

	public boolean login(String username, String password) {
		// comprobar que sean distintos de vacio
		if (username.trim().equals("") || password.trim().equals("")) {
			return false;
		}
		// comprobar que la longitud sea < 30
		if (username.length() >= 30 || password.length() >= 30) {
			return false;
		}

		//El password debe tener al menos una letra mayúscula, una minúscula y un dígito
		boolean mayus=false, minus=false, digito=false;
		for(char letra:password.toCharArray()){
			if(		Character.isUpperCase(letra)) {
				mayus=true;
			}
			if(		Character.isLowerCase(letra)) {
				minus=true;
			}
			if(Character.isDigit(letra)) {
				digito=true;
			}
				}
		if(mayus==false||minus==false||digito==false) {
			return false;
		}
		
		// llamar al método de la bbdd

		return compruebaLoginEnBD(username, password);
	}

	private boolean compruebaLoginEnBD(String username, String password) {
		if (username.equals("User") && password.equals("Pass1"))
			return true;
		else
			return false;
	}

}
