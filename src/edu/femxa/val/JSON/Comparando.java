package edu.femxa.val.JSON;

public class Comparando {

	public static void main(String[] args) {

		String t1 = "922363537";
		String t2 = "928657648";
		String t3 = "928657647";

		int resultado = t1.compareTo(t2);
		int res2 = t3.compareTo(t2);

		System.out.println(resultado);
		System.out.println(res2);

	}

}
