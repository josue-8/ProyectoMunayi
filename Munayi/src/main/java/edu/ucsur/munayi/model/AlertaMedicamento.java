package edu.ucsur.munayi.model;

import java.util.Date;

public class AlertaMedicamento {
	private Paciente paciente;
	private Date fechaAler;
	private String horaAler;
	
	public AlertaMedicamento() {
		super();
	}

	public AlertaMedicamento(Paciente paciente, Date fechaAler, String horaAler) {
		super();
		this.paciente = paciente;
		this.fechaAler = fechaAler;
		this.horaAler = horaAler;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Date getFechaAler() {
		return fechaAler;
	}

	public void setFechaAler(Date fechaAler) {
		this.fechaAler = fechaAler;
	}

	public String getHoraAler() {
		return horaAler;
	}

	public void setHoraAler(String horaAler) {
		this.horaAler = horaAler;
	}
	
}
