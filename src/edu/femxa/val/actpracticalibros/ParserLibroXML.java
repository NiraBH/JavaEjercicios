package edu.femxa.val.actpracticalibros;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import edu.femxa.val.xml.Libro;
import oracle.net.ns.MarkerPacket;

public class ParserLibroXML extends DefaultHandler {

	private Libro libro;
	private String valor_actual;
	private String isbn;
	private HashMap<String, Libro> mapaLibros;

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("INICIO DEL DOCUMENTO");
		this.libro = new Libro();
		mapaLibros = new HashMap<String, Libro>();

	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub

		if (localName.equals("libro")) {
			libro = new Libro();
			String valor_isbn = attributes.getValue("isbn");
			this.libro.setIsbn(valor_isbn);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {

		String str = new String(ch, start, length);
		valor_actual = str;
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub

		if (localName.equals("titulo")) {
			libro.setTitulo(valor_actual);
		} else if (localName.equals("autor")) {
			libro.setAutor(valor_actual);
		} else if (localName.equals("anyo")) {
			libro.setAnyo(valor_actual);
		} else if (localName.equals("editorial")) {
			libro.setEditorial(valor_actual);
		} else if (localName.equals("libro")) {

			mapaLibros.put(isbn, libro);

		}

	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub

		System.out.println("FIN DEL DOCUMENTO");
	}

}
