package edu.femxa.val.baseDatos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SalarioAdministration {
	
	public static void main(String[] args) throws Exception {


		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		float salario1 = 0;
		int empleado_id = 0;
		int rset2 = 0;
		Statement stmt2 = null;
		
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
		 	       stmt = conn.createStatement();
		 	       rset = stmt.executeQuery("UPDATE employees salary set salary = (salary *1.2) where DEPARTMENT_ID IN (select department_id FROM DEPARTMENTS WHERE DEPARTMENT_NAME = 'ADMINISTRATION' or department_name = 'IT')");
		 	       while (rset.next())
		{
		empleado_id = rset.getInt("DEPARMENT_ID");
		salario1 = rset.getFloat("SALARY");
		}
		 	       System.out.println(empleado_id+ "Y SU SALARIO ES:" +salario1 );
		}
		
		
		catch(Exception e)
		{ 
		e.printStackTrace();
		}
		finally 
		{
		if (rset != null) { try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (stmt != null)	{ try { stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (conn != null) { try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
		 	  
		} 

		}

		}