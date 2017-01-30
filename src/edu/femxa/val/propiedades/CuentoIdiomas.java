package edu.femxa.val.propiedades;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class CuentoIdiomas {
	

	 public static void main(String[] args) throws IOException {

	System.out.println("Su idioma elegido es: " +args[2]);
	String idioma = args[2];
	Properties propiedades_idioma = null;
	propiedades_idioma = new Properties();
	FileReader filereader = null;
	FileWriter filewriter = null;
	BufferedWriter bufferw = null;

	switch (idioma) {
	
		case "EN":
			filereader = new FileReader("story_en.properties");
			filewriter = new FileWriter("story.txt");
			break;
	
		case "IT":
			filereader = new FileReader("story_it.properties");
			filewriter = new FileWriter("storia.txt");
			break;
		
		case "ES":
			filereader = new FileReader("story_es.properties");
			filewriter = new FileWriter("cuento.txt");
			break;
		
		default:
			System.out.println("Idioma no encontrado");
			break;
	}

			propiedades_idioma.load(filereader);

			propiedades_idioma.load(filereader);

			bufferw = new BufferedWriter(filewriter);

			bufferw.write(propiedades_idioma.getProperty("start"));
			bufferw.newLine();
			bufferw.write(propiedades_idioma.getProperty("body"));
			bufferw.newLine();
			bufferw.write(propiedades_idioma.getProperty("end"));

			filereader.close();
			bufferw.close();
			filewriter.close();
	}
	 
	
}

