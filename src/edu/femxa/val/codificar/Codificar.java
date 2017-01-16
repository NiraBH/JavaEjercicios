package edu.femxa.val.codificar;

public class Codificar {

	public static void main(String[] args) {
		
		String adecodificar = codifica("para hacer una aplicacion web, es necesario hacer");
		System.out.println(adecodificar);
		
		String palabra_decodificada =decodifica(adecodificar);
		System.out.println(palabra_decodificada);
		
	}
		public static final int CLAVE = 5;
		public static final char LETRA = '{';
	
		public static String codifica (String cadena)
		
		{
				String palabra_cifrada = null;
				int longitud = cadena.length();
				char caracter_inicial = 0;
				int n_caracter = 0;
				char caracter_cifrado = 0;
				palabra_cifrada = new String();
				
				
				
					for (int pos = 0; pos < longitud; pos++)
					{
						caracter_inicial = cadena.charAt(pos);
						if (caracter_inicial != ' ')
						{
							n_caracter = (int)caracter_inicial;
							n_caracter = n_caracter + CLAVE;
							caracter_cifrado = (char)n_caracter;
							palabra_cifrada = palabra_cifrada + caracter_cifrado;
							
						} else 
						
						{ 
							//palabra_cifrada = palabra_cifrada + caracter_inicial;
							
							palabra_cifrada = palabra_cifrada + LETRA;
						}
						}
				
				return palabra_cifrada;
			}
			
		
	

		public static String decodifica (String cadena)
		{
			String palabra_cifrada2 = null;
			int longitud = cadena.length();
			char caracter_inicial = 0;
			int n_caracter = 0;
			char caracter_cifrado = 0;
			palabra_cifrada2 = new String();
				
				for (int pos = 0; pos < longitud; pos++)
				{
					caracter_inicial = cadena.charAt(pos);
					if (caracter_inicial != LETRA)
					{
						
						n_caracter = (int)caracter_inicial;
						n_caracter = n_caracter - CLAVE;
						caracter_cifrado = (char)n_caracter;
						palabra_cifrada2 = palabra_cifrada2 + caracter_cifrado;
						
					} else 
					{ 
						palabra_cifrada2 = palabra_cifrada2 + ' ';
						
					}
					}
			
			return palabra_cifrada2;
		}
			
		
			

	}


