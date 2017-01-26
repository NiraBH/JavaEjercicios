package edu.femxa.val.baseDatosDAO;

public class EmpleadosDto {

	private int employee_id;
	private String nombre;
	private int salario;

	public EmpleadosDto(int employee_id, String nombre, int salario) {
		super();
		this.employee_id = employee_id;
		this.nombre = nombre;
		this.salario = salario;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

}
