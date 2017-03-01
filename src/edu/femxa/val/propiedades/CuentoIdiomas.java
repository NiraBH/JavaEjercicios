package edu.femxa.val.propiedades;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class CuentoIdiomas {

	public static void main(String[] args) throws IOException {

		System.out.println("Su idioma elegido es: " + args[2]);
		String idioma = args[2];
		Properties propiedades_idioma = null;
		propiedades_idioma = new Properties();
		String titulo_cuento = null;
		FileReader filereader = null;
		FileWriter filewriter = null;
		BufferedWriter bufferw = null;

		switch (idioma) {

		case "EN":
			filereader = new FileReader("story_en.properties");

			break;

		case "IT":
			filereader = new FileReader("story_it.properties");
			break;

		case "ES":
			filereader = new FileReader("story_es.properties");
			break;

		default:
			System.out.println("Idioma no encontrado");
			break;
		}
		titulo_cuento = propiedades_idioma.getProperty("outfile");
		filewriter = new FileWriter(titulo_cuento);

		bufferw = new BufferedWriter(filewriter);
		propiedades_idioma.load(filereader);

		bufferw.write(propiedades_idioma.getProperty("start"));
		bufferw.newLine();
		bufferw.write(propiedades_idioma.getProperty("body"));
		bufferw.newLine();
		bufferw.write(propiedades_idioma.getProperty("end"));

		filewriter.close();
		bufferw.close();
		filereader.close();

	}

}
