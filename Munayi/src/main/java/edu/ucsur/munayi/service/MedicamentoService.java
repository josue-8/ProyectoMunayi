package edu.ucsur.munayi.service;

import java.util.List;
import edu.ucsur.munayi.model.Medicamento;

public interface MedicamentoService {
	public List<Medicamento> listarMedicamento();
	public int actualizarMedicamento(Medicamento  medicamento);
	public int agregarMedicamento(Medicamento medicamento);
}

