package edu.femxa.val.file.registro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IniciarSesion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String usuario = accesoUsuario();
			String contrasenia = accesoContrasenia();
			String contrasenia_codificada = codifica(contrasenia);
			System.out.println(usuario + contrasenia_codificada);
			comprobarAcceso(usuario, contrasenia_codificada);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String accesoUsuario() {

		System.out.println("Introduce tu nombre de usuario: ");
		String usuario = null;
		Scanner scanner = new Scanner(System.in);
		usuario = scanner.nextLine();

		return usuario;

	}

	public static String accesoContrasenia() {

		System.out.println("Introduce tu contraseña: ");
		String contrasenia = null;
		Scanner scanner = new Scanner(System.in);
		contrasenia = scanner.nextLine();

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

	public static boolean comprobarAcceso(String usuario, String contrasenia) throws FileNotFoundException {

		boolean inicio_correcto = false;

		BufferedReader leer_usuarios = new BufferedReader(new FileReader("Usuarios.txt"));
		BufferedReader leer_contrasenia = new BufferedReader(new FileReader("Contraseñas.txt"));

		try

		{
			String linea_usuario = null;
			String linea_contra = null;

			linea_usuario = leer_usuarios.readLine();
			linea_contra = leer_contrasenia.readLine();

			if (linea_usuario != usuario && linea_contra != contrasenia) {
				System.out.println("usuario incorrecto");
				accesoUsuario();
				accesoContrasenia();
			}

			if (linea_usuario.equals(usuario) && linea_contra.equals(contrasenia)) {
				System.out.println("Su inicio de sesión se ha realizado correctamente");
			}

		}

		catch (Exception e) {
			System.out.println("Se ha generado un error!!");
			e.printStackTrace();
		}

		finally {
			try {
				leer_usuarios.close();
				leer_contrasenia.close();

			} catch (Exception e) {
				System.out.println("Ha ocurrido un error en los cierres");
				e.printStackTrace();
			}

		}

		return inicio_correcto;
	}
}
