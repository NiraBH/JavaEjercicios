package edu.femxa.val.palindromo;

public class SiPalindromo {

	String frase_introducida;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad = null;

		cad = "orro";
		esPalindromo(cad);

	}

	public static boolean esPalindromo(String cad) {
		boolean bes_palim = false;
		int letra_inicial = 0;
		int letra_final = cad.length() - 1;

		while ((letra_inicial < letra_final) && (!bes_palim)) {
			if (cad.charAt(letra_inicial) == cad.charAt(letra_final)) {
				letra_inicial++;
				letra_final--;
			} else
				bes_palim = true;
		}

		if (!bes_palim) {
			System.out.println(cad + " = Es palindromo ");
		} else {
			System.out.println("No lo es... ");
		}
		return bes_palim;

	}
}
