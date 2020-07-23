package edu.ucsur.munayi.model;

public class Paciente {
	private int idUsuario;
	private String username;
	private String password;
	private String nombre;
	private int dni;
	private String correo;
	private int edad;
	private String sexo;
	
	public Paciente() {
		super();
	}

	public Paciente(int idUsuario, String username, String password, String nombre, int dni, String correo, int edad,
			String sexo) {
		super();
		this.idUsuario = idUsuario;
		this.username = username;
		this.password = password;
		this.nombre = nombre;
		this.dni = dni;
		this.correo = correo;
		this.edad = edad;
		this.sexo = sexo;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Empleado ["+ super.toString() +"edad=" + edad + ", sexo=" + sexo + "]";
	}
	
}
