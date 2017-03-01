package edu.femxa.val.ejercicioComando;

public class Comando {

	public static void main(String[] args) {

		int longi_palabra = 0;
		String palabra_mayor = null;
		int num_argumentos = 0;

		for (String palabra : args) {

			if (longi_palabra < palabra.length()) {

				longi_palabra = palabra.length();
				palabra_mayor = palabra;
			}
			num_argumentos++;
		}
		System.out.println("El total de las palabras introducidas es: " + num_argumentos);
		System.out.println("Su palabra mayor es: " + palabra_mayor);

	}

}
