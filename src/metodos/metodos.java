package metodos;

/**
 * Clase que contiene los metodos del menu
 */

public class metodos {
	/**
	 * @param DOLAR_A_EURO valor de 1 dolar a euro
	 * @serial DOLAR_A_EURO 0.82
	 * @param EURO_A_DOLAR valor de 1 euro a dolar
	 * @serial EURO_A_DOLAR 1.21
	 */
	static final double DOLAR_A_EURO = 0.82;
	static final double EURO_A_DOLAR = 1.21;

	/**
	 * Metodo para saber si un numero es par o no
	 * @see metodos#esPar(int valor)
	 * @param valor numero que evaluamos si es par o no
	 * @return true si es par, false si es impar
	 */

	public static boolean esPar (int valor) {
		return valor % 2 == 0;
	}

	/**
	 * Metodo para pasar un valor de dolares a euros
	 * @see metodos#convertirDolaraEuro(double cantidadDolares)
	 * @param cantidadDolares numero de dolares que queremos pasar a euros
	 * @return el valor en euros
	 */

	public static double convertirDolaraEuro (double cantidadDolares) {
		return cantidadDolares * DOLAR_A_EURO;
	}

	/**
	 * Metodo para pasar un valor de euros a dolares
	 * @see metodos#convertirEuroaDolar(double cantidadEuros)
	 * @param cantidadEuros numero de euros que queremos pasar a dolares
	 * @return el valor en dolares
	 */

	public static double convertirEuroaDolar (double cantidadEuros) {
		return cantidadEuros * EURO_A_DOLAR;
	}

	/**
	 * Metodo donde probamos si los metodos anteriores funcionan
	 * @deprecated Este metodo sera borrado en proximas versiones por desuso
	 */

	public static void testDeMetodos () {
		System.out.println("Pasamos 1 a los 3 metodos y debera salir: false, 0.82 y 1.21");
		System.out.printf("PRIMER METODO: %b%nSEGUNDO METODO: %.2f%nTERCER METODO: %.2f%n",
				esPar(1), convertirDolaraEuro(1), convertirEuroaDolar(1));
	}

}