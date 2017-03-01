
/**
 * @author Administrador
 * @version 1.0
 * @created 12-dic-2016 17:53:38
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Empieza el programa");

		// PEDIR DATOS PERSONA

		Persona persona = PedirDatos.pedirDatosPersona();

		// CALCULAR IMC

		CalcularIMC.calcula(persona);

		// MOSTRAR PERSONA IMC

		persona = new Persona();
	}

	public Main() {

	}

	public void finalize() throws Throwable {

	}

}