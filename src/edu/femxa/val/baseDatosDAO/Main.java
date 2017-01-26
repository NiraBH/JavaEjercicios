package edu.femxa.val.baseDatosDAO;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import edu.femxa.val.baseDatosDAO.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dpto = "60 ";
		List<EmpleadosDto> lista_empleados = null;
		lista_empleados = new ArrayList<EmpleadosDto>();
		EmpleadosDao empleado = new EmpleadosDao();
		try{
			lista_empleados = empleado.seleccionarEmpleados(dpto); 
			empleado.mostrarLista(lista_empleados);
			
		}
		
			
	
			
		    
		 catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error ejecutando bd");
			
		}

	}
}
