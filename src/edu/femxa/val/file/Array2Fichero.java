package edu.femxa.val.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Array2Fichero {
	
	public static void main(String[] args) {
		File file = new File("/Users/nirabethencourt/git/JavaEjercicios/Foldercito/filecito");
		String[] para_escribir;
		try {
			para_escribir = fromFichero2Array(file);
			fromArray2Fichero(para_escribir);
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

	
	public static String[] fromFichero2Array (File file) throws IOException
	{
		
		String[] lista_cadena = new String[5];
		int indice = 0;
		String linea = null ;
		
		try {
			FileReader leerFichero = new FileReader(file);
			BufferedReader leer_file = new BufferedReader(leerFichero);
			
			while ((linea = leer_file.readLine()) != null)
			{
				lista_cadena[indice]= linea;
				indice++;
				System.out.println(linea);
			}
		
			}
			catch (Exception e)
		{
			System.out.println("Se ha generado un error!!");
			e.printStackTrace();
			}	
		
		
		return lista_cadena; 
		}
	
	
	public static boolean fromArray2Fichero (String [] lista_cadena) throws IOException
	{
		boolean ok = true;
		File fichero = new File("/Users/nirabethencourt/git/JavaEjercicios/Foldercito/filecito2");
		FileWriter fichero_escribir = new FileWriter (fichero);
		BufferedWriter buff_para_escribir = new BufferedWriter (fichero_escribir);

		
			for (int i = 0; i < lista_cadena.length; i++) 
				{
					try {
						
						buff_para_escribir.write(lista_cadena[i]);
						buff_para_escribir.newLine();
						
						
					} catch (IOException e) {
						ok = false;
						e.printStackTrace();
					}
					
					
				}
			
			buff_para_escribir.close();
			fichero_escribir.close();
			return ok;
		
	
			
		
		
		
		
	}
	
	
}
