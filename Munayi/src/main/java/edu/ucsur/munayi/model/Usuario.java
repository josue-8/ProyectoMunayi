package edu.ucsur.munayi.model;

public class Usuario extends Paciente{
	private String username;
	private String password;
	
	public Usuario() {
		super();
	}
	
	
	public Usuario(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public Usuario(int idPersona, int numeroDocumento, String nombres, String primerApellido, String segundoApellido,
			String genero, int tipoEmpleado) {
		super();
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


	@Override
	public String toString() {
		return "Usuario ["+super.toString() + "username=" + username + ", password=" + password +"]";
	}
	
}
