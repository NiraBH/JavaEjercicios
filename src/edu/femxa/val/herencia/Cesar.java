package edu.femxa.val.herencia;

//LO HICE SOLITA!!! yuju!

public class Cesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cesar cesar = null; // Clase variable = null;
		String cadena;

		cesar = new Cesar(); // variable = new Objeto/metodo () que se llamara
								// igual que la clase.

		cadena = cesar.cifrarCesar("HE COMIDO CARNE", 3);

		System.out.println(cadena);

		// int j =81; para llamarlo al reves de numero a letra.
		// char c= (char)j;
		// System.out.println(c);
	}
	//

	// public void mostrarCodChars (String cadena)
	// {
	// int longi = cadena.length();
	// int numero_carac = 0;
	// char caracter = 0;
	//
	// for (int pos = 0; pos < longi; pos++)
	// {
	// caracter = cadena.charAt(pos);
	// numero_carac = (int) caracter;
	// System.out.println(caracter + "=" + numero_carac);
	// }
	//
	// }

	public String cifrarCesar(String palabra, int clave) {
		String palabra_cifrada = null;
		int longi = palabra.length();
		// int numero_carac = 0;
		char caracter_actual = 0;
		int caracter_n = 0;
		char caracter_cifrado = 0;

		palabra_cifrada = new String();
		palabra_cifrada = palabra_cifrada + "";

		for (int pos = 0; pos < longi; pos++) {
			caracter_actual = palabra.charAt(pos);

			// palabra_cifrada = palabra_cifrada + ' ';
			// numero_carac = (int) caracter;

			if (caracter_actual != ' ') {

				caracter_n = (int) caracter_actual; // habria que hacer una
													// conversion primero a
													// numero int
				caracter_n = (caracter_n + clave); // para luego hacer una suma
													// de numeros y no sumar
													// letras y numeros
				caracter_cifrado = (char) caracter_n;
				palabra_cifrada = palabra_cifrada + caracter_cifrado;
			}

			else {
				palabra_cifrada = palabra_cifrada + caracter_actual;
			}
		}

		return palabra_cifrada;

	}
}

// Este texto
// GUVG VGZVQ
