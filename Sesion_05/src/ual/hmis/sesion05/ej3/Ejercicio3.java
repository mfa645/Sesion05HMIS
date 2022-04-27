package ual.hmis.sesion05.ej3;

public class Ejercicio3 {

	public Ejercicio3() {
		
	}
	
	public String enmascarar(String password) {
		if(password.length()<5) 
			return "password demasiado corto";
		
		else if(5<= password.length() &&  password.length()<=8) return "********";

		else if(9<= password.length() &&  password.length()<=40) return "************";
        
        else
            return "password demasiado largo";
		
	}
}
