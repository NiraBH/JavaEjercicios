package edu.femxa.val.file;

import java.io.File;

public class MainArchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File archivo = new File("/Users/nirabethencourt/Documents/workspace/edu.femxa.val.ejernavi/src/Carpeta");
		
		String [] lista = null;
		
		lista = archivo.list();
		
		for (int i=0; i < lista.length; i++)
		{
			System.out.println(lista[i]);
		}
		
		
		
		
	}

}
