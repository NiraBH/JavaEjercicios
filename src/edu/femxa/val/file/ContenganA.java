package edu.femxa.val.file;

import java.io.File;

public class ContenganA {

	public static void main(String[] args) {
		File file = null;
		file = new File("/Users/nirabethencourt/Documents/workspace");

		File[] lista = null;
		lista = file.listFiles();

		for (int i = 0; i < lista.length; i++) {
			String palabra = null;
			palabra = lista[i].getName();

			if (palabra.indexOf("A") != -1 || palabra.indexOf("a") != -1) {
				System.out.println(lista[i]);
			}

		}

	}

	public static boolean ContieneA(String archivos) {

		boolean b_contieneA = false;

		return b_contieneA;

	}
}
