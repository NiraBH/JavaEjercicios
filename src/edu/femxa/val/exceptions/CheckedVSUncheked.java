package edu.femxa.val.exceptions;

public class CheckedVSUncheked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = null;
		
		int ae[] = new int [4];
	
		try 
		
		{
			int longi = ae.length;
			ae [longi] = 3;
			System.out.println(longi);
			
		} catch (Exception e) {
			System.out.println("Excepción producida");
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
		
	}

}
