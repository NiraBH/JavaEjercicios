package edu.femxa.val.file;

import java.io.File;

public class MainArchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivo = null;
		archivo = new File("/Users/nirabethencourt/Documents/workspace");
		// boolean existe = archivo.exists();

		contenganA(archivo);

		// if (existe)
		// {
		// System.out.println("Existe el directorio y los documentos son: \n ");
		// String [] lista = null;
		// lista = archivo.list();
		//
		// for (int i=0; i < lista.length; i++)
		// {
		// System.out.println(lista[i]);
		// }
		// }
		// else
		// {
		// System.out.println("No existe el directorio");
		// }
	}

	public static void contenganA(File ruta) {
		File file[] = ruta.listFiles();

		for (int i = 0; i < file.length; i++) {
			String palabra = null;
			palabra = file[i].getName();

			if (palabra.indexOf("A") != -1 || palabra.indexOf("a") != -1) {
				System.out.println(file[i]);
			}
		}

	}

}
