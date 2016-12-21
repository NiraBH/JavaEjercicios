package edu.femxa.val.herencia;

public class CesarTraducido {

			public static void main(String[] args) {
			
			CesarTraducido cesar = null; // Clase variable = null; 
			String frase_final;		
			String frase_inicial;
			
				cesar = new CesarTraducido(); //variable = new Objeto/metodo () que se llamara igual que la clase.
				
				frase_inicial = "CLAUDIA ES TONTA";
				
				frase_final = cesar.cifrarCesar(frase_inicial, 3);				
									
				System.out.print(frase_final);
				}
		

				
		public String cifrarCesar (String palabra, int clave)
		{
			String palabra_cifrada = null;
			int longi = palabra.length();
			char caracter_actual = 0;
			int caracter_n = 0; 
			char caracter_cifrado = 0;
			CesarTraducido cesar = null;
			cesar = new CesarTraducido();
			
			palabra_cifrada = new String();
			palabra_cifrada = palabra_cifrada + "";	
			
		
				for (int pos = 0; pos < longi; pos++)
					{
					caracter_actual = palabra.charAt(pos);
					caracter_cifrado = cesar.traduceCharCesar(caracter_actual, clave);
					palabra_cifrada = palabra_cifrada + caracter_cifrado;
					}	
				
	
				
				return palabra_cifrada;
			
				
				
		}

		public char traduceCharCesar (char carac_cifrado, int clave)
		{
			char caracter_conv = 0;
			int caracter_n = 0;
			
			if (carac_cifrado == ' ')
			{
				caracter_conv = ' ';
			}
			else
			{
				caracter_n = (int) carac_cifrado + clave;
				caracter_conv = (char) caracter_n ;
			}
			
		
			
			return caracter_conv;
			
		}
		}

