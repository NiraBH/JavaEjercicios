package edu.femxa.val.baseDatos;

public class Consultas {

	public static final String CONSULTA_EMPLEADOS_SALARIOS_ASC = "SELECT e.FIRST_NAME, e.EMPLOYEE_ID, e.SALARY, d.DEPARTMENT_NAME, e.DEPARTMENT_ID from EMPLOYEES E, DEPARTMENTS D where E.DEPARTMENT_ID = D.DEPARTMENT_ID ORDER BY E.SALARY DESC";

	public static final String CONSULTA_EMPLEADOS_ACT_SALARY =  "UPDATE EMPLOYEES SET salary = (salary * 1.2)"
+ "where department_id IN "
+ "(SELECT department_id FROM "
+ "DEPARTMENTS WHERE department_name = "
+ "'Administration' or "
+ "department_name = 'IT')";
	
	public static final String CONSULTA_AUMENTOS_EMPLEADOS = "SELECT * from AUMENTOS where TO_DATE (FECHA_AUMENTO, 'DD/MM/YYYY') = TO_DATE (sysdate, 'DD/MM/YYYY')";
}