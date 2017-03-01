package edu.femxa.val.buscarletra;

public class BuscarLetra {

	public static boolean PalabraConI(String palabra) // declaramos una variable
														// booleana para
														// determinar si la
														// palabra tiene i o no
	{
		boolean siTieneI = false;
		int indice = 0; // declaramos contador
		int longi = palabra.length(); // declaramos valor para contar las letras
										// que tiene la palabra
		char car_aux = 0;

		while ((!siTieneI) && (indice < longi)) // en caso de que no tengaI y el
												// indice sea menor que la
												// longitud de la palabra
		{
			car_aux = (palabra.charAt(indice)); // creamos char_aux para
												// recorrer la plabra desde
												// indice que es 0
			if (car_aux == 'i' || car_aux == 'I') // si el caracter es igual a i
													// o I tieneI es verdadero
			{
				siTieneI = true;
			}
			indice++;
		}

		return siTieneI;

	}

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) // recorrer la palabra
		{

			if (PalabraConI(args[i])) // llamamos al metodo laPalabraTieneI e
										// indicarmos si args contiene i se
										// imprima dicha palabra
			{
				System.out.println(args[i]);
			}
		}

	}

}
