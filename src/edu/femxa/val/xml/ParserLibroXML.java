package edu.femxa.val.xml;


import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ParserLibroXML extends DefaultHandler{

	
	private Libro libro;
	private String valor_actual;
	private List <Libro> lista_Libros;
	
	
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("INICIO DEL DOCUMENTO");
		this.libro = new Libro();
		lista_Libros = new ArrayList<>();
		
	}
	

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		//super.startElement(uri, localName, qName, attributes);
		//System.out.println("StartElement = Localname: " +localName);
		
		if (localName.equals("libro")){
			libro = new Libro();
			String valor_isbn = attributes.getValue("isbn");
			this.libro.setIsbn(valor_isbn);
		}
	}
	
	
	

	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		//super.characters(ch, start, length);
		
//		System.out.println("Start = "  +start);
//		System.out.println("Length = " +length);
//		
		String str = new String(ch, start, length);
//		System.out.println("String = " +str);
		valor_actual = str;
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		//super.endElement(uri, localName, qName);
		//System.out.println("EndElement = Localname: " +localName);
		
		if (localName.equals("titulo"))
		{
			libro.setTitulo(valor_actual);
		}
		else if (localName.equals("autor"))
		{
			libro.setAutor(valor_actual);
		}
		else if (localName.equals("anyo"))
		{
			libro.setAnyo(valor_actual);
		}
		else if (localName.equals("editorial"))
		{
			libro.setEditorial(valor_actual);
		}
		else if (localName.equals("libro")){
			
			lista_Libros.add(libro);
			
			}
			
		}
	
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		
		
		for (Libro libro: lista_Libros){
			
		System.out.println("INFO LIBRO");
		System.out.println("ISBN= " +libro.getIsbn());
		System.out.println("AUTOR= " +libro.getAutor());
		System.out.println("TITULO= " +libro.getTitulo());
		System.out.println("EDITORIAL= " +libro.getEditorial());
		System.out.println("AÑO= " +libro.getAnyo()+"\n");
		
		}
		
		System.out.println("FIN DEL DOCUMENTO");
	}
}
