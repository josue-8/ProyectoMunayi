package edu.ucsur.munayi.model;

public class ValoresApoyoDiagnostico {
	private Paciente paciente;
	private int presion;
	private int temperatura;
	private int edad;
	private int peso;
	
	public ValoresApoyoDiagnostico() {
		super();
	}

	public ValoresApoyoDiagnostico(Paciente paciente, int presion, int temperatura, int edad, int peso) {
		super();
		this.paciente = paciente;
		this.presion = presion;
		this.temperatura = temperatura;
		this.edad = edad;
		this.peso = peso;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public int getPresion() {
		return presion;
	}

	public void setPresion(int presion) {
		this.presion = presion;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
