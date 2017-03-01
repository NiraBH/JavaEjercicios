import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class Propiedades {

	public static void main(String[] args) throws Exception {

		Properties fichero_propiedades = null;
		fichero_propiedades = new Properties();
		FileReader fr = new FileReader("db.properties");

		fichero_propiedades.load(fr);
		String valor_driver = fichero_propiedades.getProperty("driver");
		String vc = fichero_propiedades.getProperty("cadena_conexion");
		String user = fichero_propiedades.getProperty("user");
		String password = fichero_propiedades.getProperty("password");

		System.out.println(valor_driver);
		System.out.println(vc);
		System.out.println(user);
		System.out.println(password);

		fr.close();
	}

}
