package edu.ucsur.munayi.model;

public class Medicamento {
	private String nombreMedicamento;

	public Medicamento() {
		super();
	}

	public Medicamento(String nombreMedicamento) {
		super();
		this.nombreMedicamento = nombreMedicamento;
	}

	public String getNombreMedicamento() {
		return nombreMedicamento;
	}

	public void setNombreMedicamento(String nombreMedicamento) {
		this.nombreMedicamento = nombreMedicamento;
	}
	
}
