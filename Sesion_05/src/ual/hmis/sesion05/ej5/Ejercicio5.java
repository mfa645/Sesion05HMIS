package ual.hmis.sesion05.ej5;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
public class Ejercicio5 {
	TreeSet<String> listaMezclada = new TreeSet<String>();


	public Ejercicio5() {	
		ArrayList A1 = new ArrayList ();		
	}
	
	public String listaOrdenadaEstudiantes (ArrayList A1 , ArrayList A2 ) {

		if(!A1.isEmpty())
			listaMezclada.addAll(A1);
		if(!A2.isEmpty())
			listaMezclada.addAll(A2);
			
		return listaMezclada.toString();
	}
}