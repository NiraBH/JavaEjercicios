package edu.femxa.val.arrays;

public class NotaMedia {
	
	private static int[] array_notas = {0, 10, 2, 6, 7, 5, 4};
	
	public static void notaMedia(){
		
		int[] media = array_notas;//Aquí esta mi duda... private
	
		float media_notas = 0;
		
		for (int i=0; i < media.length; i++){
			media_notas = media_notas + media[i];
			
		}
		
		media_notas = media_notas / media.length;
		System.out.println("Según las notas dadas, la nota media es: "+media_notas);
		
		
	}
	public static void main(String[] args) {
		
		notaMedia();
		
		}
}