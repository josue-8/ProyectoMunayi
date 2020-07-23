package edu.ucsur.munayi.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import edu.ucsur.munayi.mappers.MedicamentoMapper;
import edu.ucsur.munayi.model.Medicamento;
import edu.ucsur.munayi.service.MedicamentoService;

public class MedicamentoServiceImpl implements MedicamentoService{
	private List<Medicamento> listarMedicamento;
	@Autowired MedicamentoMapper medicamentoMapper;

	public MedicamentoServiceImpl() {
		super();
		listarMedicamento = new ArrayList<Medicamento>();
		listarMedicamento.add(new Medicamento("Paracetamol"));
		listarMedicamento.add(new Medicamento("AntiCovid"));
		listarMedicamento.add(new Medicamento("Penicilina"));
		listarMedicamento.add(new Medicamento("Heroina"));
		listarMedicamento.add(new Medicamento("Aspirina"));
	}


	@Override
	public List<Medicamento> listarMedicamento() {
		List<Medicamento> listado = new ArrayList<Medicamento>();
		listado = medicamentoMapper.listarMedicamento();
		return listado;
	}

	@Override
	public int agregarMedicamento(Medicamento medicamento) {
		listarMedicamento().add(medicamento);
		return 0;
	}

	@Override
	public int actualizarMedicamento(Medicamento medicamento) {
		medicamentoMapper.actualizarMedicamento(medicamento);
		return 0;
	}
	
}
