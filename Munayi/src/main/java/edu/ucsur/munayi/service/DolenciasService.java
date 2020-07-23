package edu.ucsur.munayi.service;

import java.util.List;
import edu.ucsur.munayi.model.Dolencias;

public interface DolenciasService {
	public List<Dolencias> listarDolencias();
	public int actualizarDolencias(Dolencias dolencias);
	public int agregarDolencias(Dolencias dolencias);
}
