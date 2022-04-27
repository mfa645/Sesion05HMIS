package ual.hmis.sesion05.ej4;

public class Ejercicio4 {
	private double[] notas;
	private String[] calificaciones;

	public void calculaCalificaciones(double[] notas) {
		String calificacion = "";
		this.notas = notas;
		this.calificaciones = new String[notas.length];
		for (int i=0; i<notas.length; i++) {
			calificacion = obtenerCalificacion(notas[i]);
			this.calificaciones[i] = calificacion;        
		}
	}

	public static String obtenerCalificacion(double nota) {
		if(nota<0)
			return "Error en la nota";
		
		if (nota >= 0 && nota < 5)
			return "Suspenso";
		
		else if (nota >= 5.0 && nota < 7.0)
			return "Aprobado";
		
		else if (nota >= 7.0 && nota < 9.0)
			return "Notable";
		
		else if (nota >= 9.0 && nota < 10.0)
			return "Sobresaliente";
		
		else if (nota == 10.0)
			return "Matrícula";
		
		else
			return "Error en la nota";

	}

	public String[] getCalificaciones() {
		return calificaciones;
	}

}