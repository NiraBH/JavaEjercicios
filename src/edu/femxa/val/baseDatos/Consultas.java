package edu.femxa.val.baseDatos;

public class Consultas {

	public static final String CONSULTA_EMPLEADOS_SALARIOS_ASC = "SELECT e.FIRST_NAME, e.EMPLOYEE_ID, e.SALARY, d.DEPARTMENT_NAME, e.DEPARTMENT_ID from EMPLOYEES E, DEPARTMENTS D where E.DEPARTMENT_ID = D.DEPARTMENT_ID ORDER BY E.SALARY DESC";
}
	public static final String CONSULTA_EMPLEADOS_ACT_SALARY = "SELECT e.FIRST_NAME, e.EMPLOYEE_ID, e.SALARY, d.DEPARTMENT_NAME, e.DEPARTMENT_ID from EMPLOYEES E, DEPARTMENTS D where E.DEPARTMENT_ID = D.DEPARTMENT_ID ORDER BY E.SALARY DESC";
}