package main;
import metodos.metodos;

import java.util.Scanner;

/**
 * Clase que contiene el menu
 * @author Antonio Jose Tirado Pancorbo
 * @version 1.0
 * @since 1.1.2
 */

public class principal {

	/**
	 * Menu con 4 opciones para escoger.
	 * @param args argumentos del main
	 * @exception Exception pasamos una letra en lugar de un numero al escoger el metodo del menu
	 */

	public static void main (String[] args) throws Exception{
		
		System.out.printf("1. Sacar si un numero introducido es par%n");
		System.out.printf("2. Pasar una cantidad de euros a dolares%n");
		System.out.printf("3. Pasar una cantidad de dolares a euros%n");
		System.out.printf("4. Test de los metodos");
		
		System.out.printf("Introduce un numero del 1 al 4, segun el programa que desea utilizar%n");
		Scanner sc = new Scanner (System.in);
		
		int iNumero = sc.nextInt();
		if (iNumero < 1 || iNumero > 5)
			do {
				System.out.printf("Introduce un numero del 1 al 4, segun el programa que desea utilizar%n");
				iNumero = sc.nextInt();
			} while (iNumero < 1 || iNumero > 5);
		
		switch(iNumero) {
		case 1:
			System.out.printf("Introduce un numero%n");
			int valor = sc.nextInt();

			System.out.printf("%d es par? %b%n", valor, metodos.esPar(valor));
			break;			
			
		case 2:
			System.out.printf("Introduce la cantidad de euros%n");
			double cantidadEuros = sc.nextDouble();
			
			System.out.printf("%.2f euros son %.2f dolares%n", cantidadEuros, metodos.convertirEuroaDolar(cantidadEuros));
			break;

		case 3:
			System.out.printf("Introduce la cantidad de dolares%n");
			double cantidadDolares = sc.nextDouble();
			
			System.out.printf("%.2f dolares son %.2f euros%n", cantidadDolares, metodos.convertirDolaraEuro(cantidadDolares));
			break;

		case 4:
			metodos.testDeMetodos();
			break;

	}
		sc.close();
}
}