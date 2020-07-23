package edu.ucsur.munayi.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import edu.ucsur.munayi.mappers.RecetaMapper;
import edu.ucsur.munayi.model.Receta;
import edu.ucsur.munayi.service.RecetaService;

public class RecetaServiceImpl implements RecetaService{
	private List<Receta> listarReceta;
	@Autowired RecetaMapper recetaMapper;
	
	public RecetaServiceImpl() {
		super();
		listarReceta = new ArrayList<Receta>();
		listarReceta = new ArrayList<Receta>();
		listarReceta = new ArrayList<Receta>();
		listarReceta = new ArrayList<Receta>();
		listarReceta = new ArrayList<Receta>();
		listarReceta = new ArrayList<Receta>();
	}
	
	@Override
	public List<Receta> listarReceta() {
		List<Receta> listado = new ArrayList<Receta>();
		listado = recetaMapper.listarReceta();
		return listado;
	}

	@Override
	public int agregarReceta(Receta receta) {
		listarReceta.add(receta);
		return 0;
	}

	@Override
	public int actualizarReceta(Receta receta) {
		recetaMapper.actualizarReceta(receta);
		return 0;
	}
	
}
