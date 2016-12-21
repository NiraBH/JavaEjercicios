package edu.femxa.val.herencia;

public class Cesar {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Cesar cesar = null; // Clase variable = null; 
		String cadena;		
			cesar = new Cesar(); //variable = new Objeto/metodo () que se llamara igual que la clase.
			cadena = cesar.cifrarCesar("POLLOLOCO", 4);
			
			System.out.println(cadena);
			
//	int  j =81;
//	char c= (char)j;
//	System.out.println(c);
	}
//	
	
//	public void mostrarCodChars (String cadena)
//	{
//		int longi = cadena.length();
//		int numero_carac = 0;
//		char caracter = 0;
//		
//			for (int pos = 0; pos < longi; pos++)
//			{
//				caracter = cadena.charAt(pos);
//				numero_carac = (int) caracter;
//				System.out.println(caracter + "=" + numero_carac);
//			}
//			
//	}
	
	public String cifrarCesar (String palabra, int clave)
	{
		int longi = palabra.length();
		//int numero_carac = 0;
		char caracter = 0;
		int caracter_n = 0; 
		char caracter_cifrado = 0;
		String cadena_dev = "";
		
		
	
			for (int pos = 0; pos < longi; pos++)
				{
				
				if (caracter == ' ')
				{
					cadena_dev = cadena_dev + ' ';
				}	
				else 
				{
					caracter = palabra.charAt(pos);
					caracter_n = (int) caracter; //habría que hacer una conversion primero a numero int
					
					//caracter_cifrado = (char) (caracter_n + clave); //para luego hacer una suma de numeros y no sumar letras y numeros
					
					//numero_carac = (int) caracter;
								
					cadena_dev =  cadena_dev + caracter;
						}
				}
			return cadena_dev;
		
			
			
	}
	
	}

		//Este texto 
		//GUVG VGZVQ

