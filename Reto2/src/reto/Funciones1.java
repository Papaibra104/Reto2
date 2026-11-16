package reto;

public class Funciones1 {
	
	public static double peso_kg_libras(double n1) {
		double peso1 = n1 * 2.2;
		return peso1;
		
	} 
	public static double peso_libras_kg(double n1) {
		double peso2 = n1 * 0.45;
		return peso2;
	}
	public static double longitud (int n1) {
		switch (n1) {
		case 1: {
			double formula = n1 * 1.6;
			return formula;
		}
		case 2: {
			double formula1 = n1 * 0.62;
			return formula1;
		
		}
		
		
		}
		return 0;
		
		
	}

}
