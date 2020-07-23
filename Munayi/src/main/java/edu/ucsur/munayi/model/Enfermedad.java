package edu.ucsur.munayi.model;

import java.util.Date;

public class Enfermedad {
	protected Date fechaContagio;
	
	public Enfermedad() {
		super();
	}

	public Enfermedad(Date fechaContagio) {
		super();
		this.fechaContagio = fechaContagio;
	}

	public Date getFechaContagio() {
		return fechaContagio;
	}

	public void setFechaContagio(Date fechaContagio) {
		this.fechaContagio = fechaContagio;
	}

}
