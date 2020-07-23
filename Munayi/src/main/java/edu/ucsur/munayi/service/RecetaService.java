package edu.ucsur.munayi.service;

import java.util.List;
import edu.ucsur.munayi.model.Receta;

public interface RecetaService {
	public List<Receta> listarReceta();
	public int agregarReceta(Receta receta);
	public int actualizarReceta(Receta  receta);
}
