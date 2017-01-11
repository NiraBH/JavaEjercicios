package edu.femxa.val.file;

import java.io.File;

public class MainArchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivo = null;
		archivo = new File("/Users/nirabethencourt/Documents/workspace/edu.femxa.val.ejernavi");
		//boolean existe = archivo.exists();
		
		
		boolean si_es_carpeta = archivo.isDirectory();
		
		while (si_es_carpeta)
		{
			String nombre = archivo.getName();
			String [] lista = null;
			lista = archivo.list();
			
			System.out.println();
		}
		
//		if (existe)
//			{
//			System.out.println("Existe el directorio y los documentos son: \n ");
//			String [] lista = null;
//			lista = archivo.list();
//			
//			for (int i=0; i < lista.length; i++)
//			{
//				System.out.println(lista[i]);
//			}
//		}
//		else
//		{
//			System.out.println("No existe el directorio");
//		}
		
		
		
		
		
		
	}

}
