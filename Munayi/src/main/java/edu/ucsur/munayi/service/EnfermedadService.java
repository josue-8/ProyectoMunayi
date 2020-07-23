package edu.ucsur.munayi.service;

import java.util.List;
import edu.ucsur.munayi.model.Enfermedad;

public interface EnfermedadService {
	public List<Enfermedad> listarEnfermedad();
	public int actualizarEnfermedad(Enfermedad  enfermedad);
	public int agregarEnfermedad(Enfermedad enfermedad);
}
