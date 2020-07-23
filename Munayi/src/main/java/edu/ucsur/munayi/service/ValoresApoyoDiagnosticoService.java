package edu.ucsur.munayi.service;

import java.util.List;
import edu.ucsur.munayi.model.ValoresApoyoDiagnostico;

public interface ValoresApoyoDiagnosticoService {
	public List<ValoresApoyoDiagnostico> listarValoresApoyoDiagnostico();
	public int agregarReceta(ValoresApoyoDiagnostico valoreaApDiagnostico);
	public int actualizarReceta(ValoresApoyoDiagnostico  valoreaApDiagnostico);
}
