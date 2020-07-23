package edu.ucsur.munayi.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import edu.ucsur.munayi.mappers.ValoresApoyoDiagnosticoMapper;
import edu.ucsur.munayi.model.ValoresApoyoDiagnostico;
import edu.ucsur.munayi.service.ValoresApoyoDiagnosticoService;

public class ValoresApoyoDiagnosticoServiceImpl implements ValoresApoyoDiagnosticoService{
	private List<ValoresApoyoDiagnostico> listarValoresApoyoDiagnostico;
	@Autowired ValoresApoyoDiagnosticoMapper valoresApoyoDiagnosticoMapper;

	public ValoresApoyoDiagnosticoServiceImpl() {
		super();
		listarValoresApoyoDiagnostico = new ArrayList<ValoresApoyoDiagnostico>();
		listarValoresApoyoDiagnostico.add(new ValoresApoyoDiagnostico());
		listarValoresApoyoDiagnostico.add(new ValoresApoyoDiagnostico());
		listarValoresApoyoDiagnostico.add(new ValoresApoyoDiagnostico());
		listarValoresApoyoDiagnostico.add(new ValoresApoyoDiagnostico());
		listarValoresApoyoDiagnostico.add(new ValoresApoyoDiagnostico());
	}
	
	@Override
	public List<ValoresApoyoDiagnostico> listarValoresApoyoDiagnostico() {
		List<ValoresApoyoDiagnostico> listado = new ArrayList<ValoresApoyoDiagnostico>();
		listado = valoresApoyoDiagnosticoMapper.listarValoresApoyoDiagnostico();
		return listado;
	}

	@Override
	public int agregarReceta(ValoresApoyoDiagnostico valoreaApDiagnostico) {
		listarValoresApoyoDiagnostico().add(valoreaApDiagnostico);
		return 0;
	}

	@Override
	public int actualizarReceta(ValoresApoyoDiagnostico valoreaApDiagnostico) {
		valoresApoyoDiagnosticoMapper.actualizarValoresApoyoDiagnostico(valoreaApDiagnostico);
		return 0;
	}

}
