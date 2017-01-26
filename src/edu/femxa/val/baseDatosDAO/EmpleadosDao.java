package edu.femxa.val.baseDatosDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.femxa.val.baseDatosDAO.Consultas;


public class EmpleadosDao {
	Connection conn = null;
	ResultSet rset = null;
	Statement stmt = null;
	List<EmpleadosDto> lista_empleados = null;
	EmpleadosDto empleado = null;
	public List<EmpleadosDto> seleccionarEmpleados(String department_id){
		
	
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
	    stmt = conn.createStatement();
		rset = stmt.executeQuery(Consultas.CONSULTA_LISTA_EMPLEADOS +department_id); 
		String nombre = null;
		int salario = 0;
		int  employee_id = 0;
		lista_empleados = new ArrayList<EmpleadosDto>();
		
		while (rset.next()) {
				
				nombre= rset.getNString("FIRST_NAME");
				salario = rset.getInt("SALARY");
				employee_id = rset.getInt("EMPLOYEE_ID");
					
				empleado = new EmpleadosDto(employee_id, nombre, salario);

				lista_empleados.add(empleado);
				
		}
	
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return lista_empleados;
	
	
	
	}
	
	public void mostrarLista (List<EmpleadosDto> lista_empleados)
	{
	for (EmpleadosDto emp : lista_empleados)
	{
		System.out.println(" ·Nombre: " + emp.getNombre() + " ·Salario: " + emp.getSalario() 
		+ "·Employee ID: " + emp.getEmployee_id());
		
	}
	
	}
	
	
	private static void liberarRecursos (Statement st, ResultSet rs)
	{
		
		if (rs != null) 	{ try { rs.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (st != null)	{ try {	st.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		
	}
	
	
	private static void liberarRecursos (Statement st)
	{
		
		if (st != null)	{ try {	st.close(); } catch (Exception e2) { e2.printStackTrace(); }}
	  	
		
	}
	
	private static void liberarRecursos (Connection conn)
	{
		
		if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
	  	
		
	}

}
