package edu.femxa.val.sinEspacios;

import java.util.Scanner;

public class SinEspacios {

	
	public static void main(String[] args) {
		
		SinEspacios palabra =  new SinEspacios();
		String palabra_sin_espacios = palabra.pedirPalabra();
		
		SinEspacios sinEspacios = new SinEspacios();
		String palabra_devuelta = sinEspacios.quitarEspacios(palabra_sin_espacios);
		
		System.out.println("Su frase sin espacios es: " +palabra_devuelta);
	
		
	}
	
	public static String pedirPalabra()
		{
		String cadena = null;
		Scanner scanner = new Scanner (System.in); 
		
		System.out.println("Por favor, introduzca su frase:");
		
		cadena = scanner.nextLine();
		
		return cadena;
		
		}
	public static String quitarEspacios (String cadena) 
	{
		String cadena_sin_espacios = "";
		
		for(int i=0; i< cadena.length(); i++)
			{
			if(cadena.charAt(i) != ' ')
			{
				
				cadena_sin_espacios = cadena_sin_espacios + cadena.charAt(i); // es una manera de hacerlo como si fuera i++ cadena_sin_espacios += cadena.charAt(i);
				
			}
			
			
				}
		return cadena_sin_espacios;
		
				
	}
		


		
	}
