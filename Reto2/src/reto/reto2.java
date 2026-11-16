package reto;

import java.util.Scanner;

import reto.Funciones1;
import reto.Funciones2;
import reto.Funciones3;

public class reto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("Elige un numero: ");
			System.out.println("1. Longuitud");
			System.out.println("2. Peso");
			System.out.println("3. Temperatura");
			System.out.println("4. Volumen");
			System.out.println("0. Salir");
		
			 num = Integer.parseInt(sc.nextLine());
		
		switch (num) {
		case 1:
			System.out.println(Funciones1.longitud(num));
			break;
		case 2:
			System.out.println(Funciones1.peso_kg_libras(10));
			break;
		case 3:
			System.out.println(Funciones2.Celsiustemperatura(num));
			
		default:
			System.out.println("Se acabo");
			break;
		}

		} while (num != 0);

	}

}
