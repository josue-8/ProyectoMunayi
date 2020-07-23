package edu.ucsur.munayi.model;

import java.util.Date;

public class Receta {
	private Paciente paciente;
	private Medicamento medicamento;
	private int cantidad;
	private int dosis;
	private String unidadDosis;
	private int frecuencia;
	private Date fechaInicio;
	private Date fechaFin;
	private int horaInicio;
	
	public Receta() {
		super();
	}

	public Receta(Paciente paciente, Medicamento medicamento, int cantidad, int dosis, String unidadDosis,
			int frecuencia, Date fechaInicio, Date fechaFin, int horaInicio) {
		super();
		this.paciente = paciente;
		this.medicamento = medicamento;
		this.cantidad = cantidad;
		this.dosis = dosis;
		this.unidadDosis = unidadDosis;
		this.frecuencia = frecuencia;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.horaInicio = horaInicio;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getDosis() {
		return dosis;
	}

	public void setDosis(int dosis) {
		this.dosis = dosis;
	}

	public String getUnidadDosis() {
		return unidadDosis;
	}

	public void setUnidadDosis(String unidadDosis) {
		this.unidadDosis = unidadDosis;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

}
