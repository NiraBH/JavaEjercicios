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
		File file = new File("filecito");
		String[] para_escribir = null;
		
		try {
			para_escribir = fromFichero2Array(file);
			fromArray2Fichero(para_escribir);
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		for (String cad: para_escribir) //For each VER EN CASA
		{
			System.out.println(cad);
		}
		
		if (fromArray2Fichero(para_escribir))
		{
			System.out.println("Escrito");
		}
		else
		{
			System.out.println("No escrito");
		}
			
	}

	
	public static String[] fromFichero2Array (File file) throws IOException
	{
		
		String[] lista_cadena = new String[5];
		int indice = 0;
		String linea = null ;
		FileReader leerFichero = new FileReader(file);
		BufferedReader leer_file = new BufferedReader(leerFichero);
		linea = leer_file.readLine();
		
		try 
		
			{
			while ( linea != null)
			{
				lista_cadena[indice]= linea;
				indice++;
				linea = leer_file.readLine();
			}
			
			System.out.println("El Archivo ha sido leído");
			
			}
		
		catch (Exception e)
		{
			System.out.println("Se ha generado un error!!");
			e.printStackTrace();
			}	
		
		finally
		{
			try {
				leer_file.close();
				leerFichero.close();
				
				
			} catch (Exception e) {
				System.out.println("Ha ocurrido un error en los cierres");
				e.printStackTrace();
			}
			
		}
		
		return lista_cadena; 
		}
	

	public static boolean fromArray2Fichero (String [] lista_cadena)
	{
		boolean ok = true;	
		FileWriter fichero_escribir = null;
		BufferedWriter buff_para_escribir = null;

		try {

			fichero_escribir = new FileWriter ("filecito4");
			buff_para_escribir = new BufferedWriter (fichero_escribir);
			
			
			for (int i = 0; i < lista_cadena.length; i++) 
				{
					
						buff_para_escribir.write(lista_cadena[i]);
						buff_para_escribir.newLine();
						
//						int longi = lista_cadena.length -1;
//					if (i != longi)
//						{
//						buff_para_escribir.newLine();
//						}
//						i++;
				}	
			
					} catch (IOException e) {
						ok = false;
						e.printStackTrace();
					}
		finally 
		{			
			try {
				buff_para_escribir.close();
				fichero_escribir.close();
				
			} catch (IOException e) {
				System.out.println("Error creando ficheros");
				e.printStackTrace();
			}
			
		}
		
		return ok;
				}
			
		
	}
	
	

