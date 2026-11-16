package reto;

public class Funciones3 {

	public static double euros_dolares(double n1) {
		double equivalente = 1.10;
		
		return n1 * equivalente;
	}
	
	
	public static double dolares_euros(double n2) {
		double equivalente = 1.10;
		
		return n2 / equivalente;
	}
	
	
	public static double grados_radianes(int n1) {
		double grados = n1 * Math.PI / 180.0; 
		
		return grados;
	}
		
	public static double radianes_grados(int n1) {
		double radianes = n1 * 180.0 / Math.PI;
		
		return radianes;
	}
	
	
	
}
