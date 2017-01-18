package edu.femxa.val.file.registro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroUsuario {

	public static void main(String[] args) {
		String usuario = pedirUsuario();
		boolean guardada = guardarUsuario(usuario);
		String contraseña = pedirContraseña();
		String contraseña_confirmada = pedirConfirmarContraseña(contraseña);
		confirmarContraseña(contraseña, contraseña_confirmada);
		String contraseña_codificada = codifica(contraseña_confirmada);
		
		System.out.println(contraseña_codificada);


	}

	public static String pedirUsuario()
	{
		System.out.println("Introduce tu usuario: ");
		String usuario = null;
		Scanner scanner = new Scanner (System.in); 

		usuario = scanner.nextLine();

		return usuario;

	}

	public static String pedirContraseña()
	{
		System.out.println("Introduce tu contraseña: ");
		String contraseña = null;
		Scanner scanner = new Scanner (System.in); 
		contraseña = scanner.nextLine();

		return contraseña;
	}

	public static String pedirConfirmarContraseña (String contraseña)
	{
		System.out.println("Introduce tu contraseña para confirmar: ");
		String conf_contraseña = null;
		Scanner scanner = new Scanner (System.in); 
		conf_contraseña = scanner.nextLine();

		return conf_contraseña;
	}

	public static final int CLAVE = 5;
	public static final char LETRA = '{';

	public static void confirmarContraseña (String contraseña, String contraseña_confirmar)
	{

			while (contraseña != contraseña_confirmar)
				{
				confirmarContraseña(contraseña, contraseña_confirmar);
				}
			
//			if (contraseña == contraseña_confirmar)
//				{
//				System.out.println("Las contraseñas coinciden.");	
//				}
//			else {
//				System.out.println("Las contraseñas no coinciden");
//				String sin_confirmar = pedirContraseña();
//				
//			
//				if (sin_confirmar == contraseña)
//				{
//				System.out.println("Las contraseñas coinciden.");
//				}
//			}
			
		}
			
	
	
	public static String codifica (String cadena)

	{
		String palabra_cifrada = null;
		int longitud = cadena.length();
		char caracter_inicial = 0;
		int n_caracter = 0;
		char caracter_cifrado = 0;
		palabra_cifrada = new String();



		for (int pos = 0; pos < longitud; pos++)
		{
			caracter_inicial = cadena.charAt(pos);
			if (caracter_inicial != ' ')
			{
				n_caracter = (int)caracter_inicial;
				n_caracter = n_caracter + CLAVE;
				caracter_cifrado = (char)n_caracter;
				palabra_cifrada = palabra_cifrada + caracter_cifrado;

			} else 

			{ 
				//palabra_cifrada = palabra_cifrada + caracter_inicial;

				palabra_cifrada = palabra_cifrada + LETRA;
			}
		}

		return palabra_cifrada;
	}

	public static boolean guardarUsuario (String nombre_usuario)
	{
		boolean ok = true;	
		//FileWriter archivo = null;
		BufferedWriter buff_escribir = null;

		try {

			//archivo = new FileWriter ("filecito4");
			//buff_escribir = new BufferedWriter (archivo);
			buff_escribir = new BufferedWriter (new FileWriter ("Usuarios.txt"));
			buff_escribir.write(nombre_usuario);
			buff_escribir.newLine();


		} catch (IOException e) {
			ok = false;
			e.printStackTrace();
		}
		finally 
		{			
			try {
				buff_escribir.close();
				//archivo.close();

			} catch (IOException e) {
				System.out.println("Error creando ficheros");
				e.printStackTrace();
			}

		}
		
		return ok;
				}
}
