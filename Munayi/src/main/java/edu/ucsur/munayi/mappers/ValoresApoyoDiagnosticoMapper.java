package edu.ucsur.munayi.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import edu.ucsur.munayi.model.ValoresApoyoDiagnostico;

@Mapper
public interface ValoresApoyoDiagnosticoMapper {
	public List<ValoresApoyoDiagnostico> listarValoresApoyoDiagnostico();
	public int agregarReceta(ValoresApoyoDiagnostico valoreaApDiagnostico);
	public int actualizarValoresApoyoDiagnostico(ValoresApoyoDiagnostico  valoreaApDiagnostico);
}
