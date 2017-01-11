package edu.femxa.val.sinEspacios;

import java.util.Scanner;

public class SinEspacios {

	public static void main(String[] args) {
		
		String cadena = null;
		String cadena_sin_espacios = null;
		
		Scanner scanner = new Scanner (System.in); 
		
		System.out.println("Por favor, introduzca su frase:");
		
		cadena= scanner.nextLine();
		
		
		for(int i=0; i< cadena.length(); i++)
			{
			if(cadena.charAt(i) != ' ')
			{
				cadena_sin_espacios += cadena.charAt(i);
							
				}
				
	}
		System.out.println(cadena_sin_espacios);
}
}