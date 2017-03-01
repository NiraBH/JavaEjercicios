public class NumerosCadena {

	// HACED UN MeTODO QUE DADA UNA CADENA, MUESTRE CADA UNA DE LAS LETRAS CON
	// UN BUCLE FOR

	public static void mostrarPalabraLetraALetra(String palabra) {
		int longi = 0;
		int indice = 0;

		longi = palabra.length();

		/*
		 * for (int indice = 0; indice<longi;indice++) {
		 * System.out.println(palabra.charAt(indice)); }
		 */

		while (indice < longi) {
			System.out.println(palabra.charAt(indice));
			indice++;
		}
	}

	// public static void mostrarPrimerasLetras (String palabra, int numero)
	// {
	// int longi = 0;
	// int indice = 0;
	//
	// longi = palabra.length();
	//
	// /*for (int indice = 0; indice<longi;indice++)
	// {
	// System.out.println(palabra.charAt(indice));
	// }*/
	//
	// while ((indice < numero) && (indice < longi))
	// {
	// System.out.println(palabra.charAt(indice));
	// indice ++;
	// }
	// }
	//
	// public static void main(String[] args) {
	// //mostrarPalabraLetraALetra("TECLADO");
	// mostrarPrimerasLetras("BOTELLADEAGUA", 230);
	// }
	//
	//

	public static void mostrarUltimasLetras(String palabra, int numero) {
		int longi = 0;
		int limitesuperior = 0;
		int limiteinferior = 0;

		longi = palabra.length();
		limiteinferior = longi - numero;
		limitesuperior = (longi - 1);

		/*
		 * for (int indice = 0; indice<longi;indice++) {
		 * System.out.println(palabra.charAt(indice)); }
		 */

		while ((limitesuperior >= limiteinferior) && (limitesuperior >= 0)) {
			System.out.println(palabra.charAt(limitesuperior));
			limitesuperior--;
		}
	}

	public static void main(String[] args) {
		// mostrarPalabraLetraALetra("TECLADO");
		mostrarUltimasLetras("BOTELLADEAGUA", 18);
	}

}
