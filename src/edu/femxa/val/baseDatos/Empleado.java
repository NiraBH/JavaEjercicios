package edu.femxa.val.baseDatos;

public class Empleado {

	private int id;
	private String nombre;
	private int salario;
	private int dpto;
	private String nombdpto;

	public Empleado(int id, String nombre, int salario, int dpto, String nombdpto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
		this.dpto = dpto;
		this.nombdpto = nombdpto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getDpto() {
		return dpto;
	}

	public void setDpto(int dpto) {
		this.dpto = dpto;
	}

	public String getNombdpto() {
		return nombdpto;
	}

	public void setNombdpto(String nombdpto) {
		this.nombdpto = nombdpto;
	}

}
