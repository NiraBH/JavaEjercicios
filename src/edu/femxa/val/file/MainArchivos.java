package edu.femxa.val.file;

import java.io.File;

public class MainArchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivo = null;
		archivo = new File("Foldercito");
		boolean existe = archivo.exists();
		
		
		if (existe)
			{
			System.out.println("Existe el directorio");
			String [] lista = null;
			lista = archivo.list();
			
			for (int i=0; i < lista.length; i++)
			{
				boolean esta_oculto = archivo.isHidden();
				
				if (esta_oculto)
				System.out.println(lista [i]);
			}
		}
		else
		{
			System.out.println("No existe el directorio");
		}
		
		
		
		
		
		
	}

}
