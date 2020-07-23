package edu.ucsur.munayi.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.ucsur.munayi.mappers.EnfermedadMapper;
import edu.ucsur.munayi.model.Enfermedad;
import edu.ucsur.munayi.service.EnfermedadService;

@Service
public class EnfermedadServiceImpl implements EnfermedadService{
	private List<Enfermedad> listarEnfermedad;
	@Autowired EnfermedadMapper enfermedadMapper;

	public EnfermedadServiceImpl() {
		super();
		listarEnfermedad = new ArrayList<Enfermedad>();
		listarEnfermedad.add(new Enfermedad());
		listarEnfermedad.add(new Enfermedad());
		listarEnfermedad.add(new Enfermedad());
		listarEnfermedad.add(new Enfermedad());
		listarEnfermedad.add(new Enfermedad());
		listarEnfermedad.add(new Enfermedad());
	}

	@Override
	public List<Enfermedad> listarEnfermedad() {
		List<Enfermedad> listado = new ArrayList<Enfermedad>();
		listado = enfermedadMapper.listarEnfermedad();
		/*conectar a bd*/
		return listado;
	}
	
	@Override
	public int agregarEnfermedad(Enfermedad enfermedad) {
		listarEnfermedad.add(enfermedad);
		return 0;
	}

	@Override
	public int actualizarEnfermedad(Enfermedad enfermedad) {
		enfermedadMapper.actualizarEnfermedad(enfermedad);
		return 0;
	}
	
}
