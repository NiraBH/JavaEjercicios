package edu.femxa.val.dNI;

import java.util.Scanner;

public class LetraDni {

	public static String caracteresDNI = "TRWAGMYFPDXBNJZSQVHLCKE";

	public static void LetraDni(int dni) {
		int resultado = 0;
		resultado = dni % 23;

		char letra = caracteresDNI.charAt(resultado);

		System.out.println("La letra de su DNI es: " + letra);

	}

	public static int pedirDni() {
		System.out.println("Por favor, introduce tu DNI sin letra: ");

		int dni = 0;
		Scanner scanner = new Scanner(System.in);
		dni = scanner.nextInt();

		return dni;
	}

	public static void main(String[] args) {

		int dni = pedirDni();
		System.out.println("");

		LetraDni(dni);

	}
}
