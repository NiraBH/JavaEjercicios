package edu.femxa.val.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CrearFichero {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("Por favor, introduzca el nombre del fichero:");
		
		String nombre_fichero = pedirPalabra();
		String cadena_con = crearArchivo(nombre_fichero);
		
		System.out.println("Por favor, introduzca el nombre del fichero a borrar:");
		String nombre_borrar = pedirPalabra();
		String borrado = borrarArchivo(nombre_borrar);
		
	}

	public static String pedirPalabra()
	{
	String cadena = null;
	Scanner scanner = new Scanner (System.in); 
	
	
	cadena = scanner.nextLine();
	
	return cadena;
		
	}
	
	public static String crearArchivo (String nombre_archivo) throws IOException {
		File archivo = new File("/Users/nirabethencourt/Documents/workspace/",nombre_archivo);
		
	 
		if (archivo.createNewFile())
		{
			System.out.println("El archivo ha sido creado con éxito");
		}
		else
		{
	        System.out.println("El archivo ya existe");
		
		
	}
		return nombre_archivo;
	}
	
	
	public static String borrarArchivo (String archivo_borrar){
		String archivo_borrado = null;
		File archivo = new File ("/Users/nirabethencourt/Documents/workspace/",archivo_borrar);
		
		if (archivo.exists())
		{
			archivo.delete();
			System.out.println("El archivo ha sido borrado");
		}
		else
		{
			System.out.println("El archivo no existe");
		}
	
		return archivo_borrado;
	
	}
	
}