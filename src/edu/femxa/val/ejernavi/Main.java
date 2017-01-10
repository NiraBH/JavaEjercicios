package edu.femxa.val.ejernavi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaPersonas lista_nue = new ListaPersonas();
		
		String nombre2 = null;
		int edad2 = 0;
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Introduzca una persona:");
		nombre2 = scanner.next();
		edad2 = scanner.nextInt();
		Persona persona = new Persona(nombre2, edad2);

		System.out.println("Introduzca la segunda persona:");
		nombre2 = scanner.next();
		edad2 = scanner.nextInt();
		Persona persona2 = new Persona(nombre2, edad2);
		
		lista_nue.insertarPersona(persona);
		lista_nue.insertarPersona(persona2);

		
		int resultado_buscar = 	lista_nue.buscarPersonaPos("Vale"); 
		
			if (resultado_buscar == -5)
			{
				System.out.println("No existe una persona con ese nombre");
			}
				else
				{
				  System.out.println("Esa persona si existe");
				  System.out.println("La persona esta en la posición: " +resultado_buscar);
				  
				  
				  Persona persona3 = lista_nue.obtenerPersona(resultado_buscar);
				  persona3.mostrarPersona();
				  
				}
				
			
//			ListaPersonas lista_nue = new ListaPersonas();
//			
//			Persona persona = new Persona("Ana", 23);
//			Persona persona2 = new Persona("Oscar", 25);
//			
//			lista_nue.insertarPersona(persona);
//			lista_nue.insertarPersona(persona2);
//
//			
//			int resultado_buscar = 	lista_nue.buscarPersonaPos("Ana"); 
//			
//				if (resultado_buscar == -5)
//				{
//					System.out.println("No existe una persona con ese nombre");
//				}
//					else
//					{
//					  System.out.println("Esa persona si existe");
//					  System.out.println("La persona esta en la posición: " +resultado_buscar);
//					  Persona persona3 = lista_nue.obtenerPersona(resultado_buscar);
//					  persona3.mostrarPersona();
//					  
//					}
//					
//				
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//		}

	}
		
		
		
		
		
		
		
		
		
		
	}


