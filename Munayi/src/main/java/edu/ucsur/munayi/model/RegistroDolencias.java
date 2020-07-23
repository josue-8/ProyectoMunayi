package edu.ucsur.munayi.model;

import java.util.Date;

public class RegistroDolencias {
	private Paciente paciente;
	private Dolencias dolencias;
	private Date fecha;
	private String hora;
	private String observacion;
	
	public RegistroDolencias() {
		super();
	}

	public RegistroDolencias(Paciente paciente, Dolencias dolencias, Date fecha, String hora, String observacion) {
		super();
		this.paciente = paciente;
		this.dolencias = dolencias;
		this.fecha = fecha;
		this.hora = hora;
		this.observacion = observacion;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Dolencias getDolencias() {
		return dolencias;
	}

	public void setDolencias(Dolencias dolencias) {
		this.dolencias = dolencias;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}
