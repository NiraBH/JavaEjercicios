package edu.femxa.val.baseDatos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import com.sun.swing.internal.plaf.basic.resources.basic_pt_BR;


public class BaseDatosAct {
	
	
	private static void consultaHistoricoAumentos (Connection conn)
	{
		Statement st = null;
		ResultSet rs = null;
		
		try{
			
			st = conn.createStatement();
			rs = st.executeQuery(Consultas.CONSULTA_AUMENTOS_EMPLEADOS);
			Integer empleado_id = 0;
			Integer salario_antiguo = 0;
			Integer salario_actual = 0;
			Date fecha =null;
			
			while (rs.next())
			    {
					empleado_id = rs.getInt("EMPLOYEE_ID");
					salario_antiguo = rs.getInt("SALARIO_ANTERIOR");
					salario_actual = rs.getInt("SALARIO_POSTERIOR");
					fecha = rs.getDate("FECHA_AUMENTO");
					System.out.println("Empleado ID = "+empleado_id + " || Salario anterior = " +salario_antiguo+ "|| Salario actual = " +salario_actual+ "a fecha de: " +fecha);
				 }
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			liberarRecursos(st, rs);
			
		}
			
	}
	
	
	public static void mostrarLista (ArrayList<Empleado> lemp)
	{
	for (Empleado emp : lemp)
	{
		System.out.println(" ·Nombre: " + emp.getNombre() + " ·Salario: " + emp.getSalario() + " ·ID: " + emp.getId() + " ·Departamento: " + emp.getDpto() + " ·Nombre de departamento: " + emp.getNombdpto());
		
	}
	
	}
	
	private static void subeSueldo (Connection conn)
	{
		Statement st = null;
		
		try
		{
			st = conn.createStatement();
			st.execute(Consultas.CONSULTA_EMPLEADOS_ACT_SALARY);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			liberarRecursos(st);
			
		}
	}
	
	
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try{
			DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
			conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
		    conn.setAutoCommit(false);
			subeSueldo(conn);
		    consultaHistoricoAumentos(conn);
		    
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error ejecutando bd");
			conn.rollback();
			
		} finally {
			liberarRecursos(conn);
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