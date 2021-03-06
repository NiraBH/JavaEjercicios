package edu.femxa.val.baseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BaseDatos {

	public static void mostrarLista(ArrayList<Empleado> lemp) {
		for (Empleado emp : lemp) {
			System.out.println(" Nombre: " + emp.getNombre() + " Salario: " + emp.getSalario() + " ID: " + emp.getId()
					+ " Departamento: " + emp.getDpto() + " Nombre de departamento: " + emp.getNombdpto());

		}

	}

	public static void main(String[] args) throws Exception {

		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		ArrayList<Empleado> lista_empleados = null;
		lista_empleados = new ArrayList<>();
		// lista_empleados = new ArrayList<>();

		// Empleado empleado = new Empleado();

		// lista_empleados.addAll(c);

		// Haced un programa que recupere todos los empleados de la base de
		// datos HR, los introduzca en una aaraylis t de empleados y los muestre
		// ordenador por salario (des)

		try {
			// registro el driver, en realidad, hago que se ejecuten unas pocas
			// líneas de la clase OracleDriver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DriverManager.registerDriver (new
			// oracle.jdbc.driver.OracleDriver());// método equivalente al
			// anterior
			// Sea como sea, es, <<oye, si te piden una conexión, se la pides a
			// esa clase!>>
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
			stmt = conn.createStatement();
			rset = stmt.executeQuery(Consultas.CONSULTA_EMPLEADOS_SALARIOS_ASC); // seleccionar
																					// todo
																					// los
																					// atributos
			String nombre = null;
			int salario = 0;
			Integer id = 0;
			int dpto = 0;
			String nombdpto = null;

			while (rset.next()) {
				// System.out.println (rset.getString(1));
				// System.out.println (rset.getString(2));

				nombre = rset.getNString(1);
				salario = rset.getInt(3);
				id = rset.getInt("EMPLOYEE_ID");
				dpto = rset.getInt("DEPARTMENT_ID");
				nombdpto = rset.getString("DEPARTMENT_NAME");

				Empleado empleado = new Empleado(id, nombre, salario, dpto, nombdpto);

				// Empleado empleado = new Empleado(3, "Juanjo", 27000, 5);

				lista_empleados.add(empleado);

			}

			mostrarLista(lista_empleados);
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally // libero recursos, de "adentro a fuera" , ResultSet,
					// Statment, Conexion
		{
			if (rset != null) {
				try {
					rset.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}

		}

	}

}