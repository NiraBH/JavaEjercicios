package edu.femxa.val.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) throws IOException {
		File archivo = new File("/Users/nirabethencourt/Documents/workspace/cadena");
		FileReader file = new FileReader(archivo);
		int a = file.read();
		int b = file.read();

		char c = (char) a; // Casting: conversion de tipo int a char
		char d = (char) b; // Casting: conversion de tipo int a char

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		while (file.read() != -1) {

		}
		file.close();
	}

}
