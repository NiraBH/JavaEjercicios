package edu.femxa.val.file.registro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroUsuario {

	public static void main(String[] args) {
		String usuario = pedirUsuario();
		guardarUsuario(usuario);
		String contrasenia = pedirContrasenia();
		String contrasenia_codificada = codifica(contrasenia);
		guardarContrasenia(contrasenia_codificada);
		System.out.println(contrasenia_codificada);

	}

	public static String pedirUsuario() {
		System.out.println("Introduce tu usuario: ");
		String usuario = null;
		Scanner scanner = new Scanner(System.in);

		usuario = scanner.nextLine();

		return usuario;

	}

	public static String pedirContrasenia() {
		System.out.println("Introduce tu contrasenia: ");
		String contrasenia = null;
		Scanner scanner = new Scanner(System.in);
		contrasenia = scanner.nextLine();

		System.out.println("Introduce tu contrasenia para confirmar: ");
		String contrasenia_confirmar = null;
		Scanner scanner2 = new Scanner(System.in);
		contrasenia_confirmar = scanner.nextLine();

		if (contrasenia.equals(contrasenia_confirmar))

		{
			System.out.println("Las contraseñas coinciden");

		} else {
			System.out.println("Las contraseñas no coinciden");
			pedirContrasenia();
		}

		return contrasenia;
	}

	public static final int CLAVE = 5;
	public static final char LETRA = '{';

	public static String codifica(String cadena)

	{
		String palabra_cifrada = null;
		int longitud = cadena.length();
		char caracter_inicial = 0;
		int n_caracter = 0;
		char caracter_cifrado = 0;
		palabra_cifrada = new String();

		for (int pos = 0; pos < longitud; pos++) {
			caracter_inicial = cadena.charAt(pos);
			if (caracter_inicial != ' ') {
				n_caracter = (int) caracter_inicial;
				n_caracter = n_caracter + CLAVE;
				caracter_cifrado = (char) n_caracter;
				palabra_cifrada = palabra_cifrada + caracter_cifrado;

			} else

			{
				// palabra_cifrada = palabra_cifrada + caracter_inicial;

				palabra_cifrada = palabra_cifrada + LETRA;
			}
		}

		return palabra_cifrada;
	}

	public static boolean guardarUsuario(String nombre_usuario) {
		boolean ok = true;
		BufferedWriter buff_escribir = null;

		try {

			buff_escribir = new BufferedWriter(new FileWriter("Usuarios.txt"));
			buff_escribir.write(nombre_usuario);
			buff_escribir.newLine();

		} catch (IOException e) {
			ok = false;
			e.printStackTrace();
		} finally {
			try {
				buff_escribir.close();

			} catch (IOException e) {
				System.out.println("Error creando ficheros");
				e.printStackTrace();
			}

		}

		return ok;
	}

	public static boolean guardarContrasenia(String contrasenia) {
		boolean ok = true;
		BufferedWriter buff_escribir_contrasenia = null;

		try {

			buff_escribir_contrasenia = new BufferedWriter(new FileWriter("Contraseñas.txt"));
			buff_escribir_contrasenia.write(contrasenia);
			buff_escribir_contrasenia.newLine();

		} catch (IOException e) {
			ok = false;
			e.printStackTrace();
		} finally {
			try {
				buff_escribir_contrasenia.close();

			} catch (IOException e) {
				System.out.println("Error creando ficheros");
				e.printStackTrace();
			}

		}

		return ok;
	}

}
