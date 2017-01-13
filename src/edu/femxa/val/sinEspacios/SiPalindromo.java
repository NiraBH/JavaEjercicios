package edu.femxa.val.sinEspacios;

public class SiPalindromo {
	
		
		private static boolean siEsPalindromo (String cad)
		{
		
			boolean bd = true;
			
			int i = 0;
			int j = cad.length()-1;
			
			while ((i<=j)&&(bd))
			{
				bd = cad.charAt(i)==cad.charAt(j);
				i++;
				j--;
			}
			
			
			return bd;
		}
		/**
		 * 
		 * Este programa tiene un método que sirve para averiguar si es una palabra es un palindromo.
		 * 
		 */
		public static void main(String[] args) {
			
			if (siEsPalindromo("lool"))
			{
				System.out.println("VERDADERO");
			} else 
			{
				System.out.println("FALSO");
			}
		}

	}

