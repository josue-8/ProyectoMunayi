package edu.ucsur.munayi.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import edu.ucsur.munayi.mappers.DolenciasMapper;
import edu.ucsur.munayi.model.Dolencias;
import edu.ucsur.munayi.service.DolenciasService;

public class DolenciasServiceImpl implements DolenciasService{
	private List<Dolencias> listarDolencia;
	@Autowired DolenciasMapper dolenciaMapper;
	
	public DolenciasServiceImpl() {
		super();
		listarDolencia = new ArrayList<Dolencias>();
		listarDolencia.add(new Dolencias());
		listarDolencia.add(new Dolencias());
		listarDolencia.add(new Dolencias());
		listarDolencia.add(new Dolencias());
		listarDolencia.add(new Dolencias());
	}
	
	@Override
	public List<Dolencias> listarDolencias() {
		List<Dolencias> listado = new ArrayList<Dolencias>();
		listado = dolenciaMapper.listarDolencias();
		return listado;
	}

	@Override
	public int agregarDolencias(Dolencias dolencias) {
		listarDolencias().add(dolencias);
		return 0;
	}

	@Override
	public int actualizarDolencias(Dolencias dolencias) {
		dolenciaMapper.actualizarDolencias(dolencias);
		return 0;
	}

}
