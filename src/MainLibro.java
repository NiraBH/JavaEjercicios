
import java.io.FileInputStream;
import java.util.HashMap;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import edu.femxa.val.actpracticalibros.Libro;
import edu.femxa.val.actpracticalibros.ParserLibroXML;

public class MainLibro {

	public static void main(String[] args) throws Throwable {

		mostrar();

	}

	public static void mostrar() throws Throwable {

		XMLReader reader = XMLReaderFactory.createXMLReader();
		ParserLibroXML parserLibro = null;
		parserLibro = new ParserLibroXML();

		reader.setContentHandler(parserLibro);
		reader.parse(new InputSource(new FileInputStream("libros.xml")));

	}

	public static int getNLibros() {

		int numero_libros = 0;

		return numero_libros;

	}
}
