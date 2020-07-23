package edu.ucsur.munayi.model;

import java.util.Date;

public class EnfermedadesDiagnosticadas{
	private Paciente paciente;
	private Enfermedad enfermedad;
	private Date fechaContagio;
	private String especialista;
	
	public EnfermedadesDiagnosticadas() {
		super();
	}

	public EnfermedadesDiagnosticadas(Paciente paciente, Enfermedad enfermedad, Date fechaContagio,
			String especialista) {
		super();
		this.paciente = paciente;
		this.enfermedad = enfermedad;
		this.fechaContagio = fechaContagio;
		this.especialista = especialista;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Enfermedad getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}

	public Date getFechaContagio() {
		return fechaContagio;
	}

	public void setFechaContagio(Date fechaContagio) {
		this.fechaContagio = fechaContagio;
	}

	public String getEspecialista() {
		return especialista;
	}

	public void setEspecialista(String especialista) {
		this.especialista = especialista;
	}
	
}
