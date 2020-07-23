package edu.ucsur.munayi.mappers;

import java.util.List;
import edu.ucsur.munayi.model.Dolencias;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DolenciasMapper {
	public List<Dolencias> listarDolencias();
	public int agregarDolencias(Dolencias dolencias);
	public int actualizarDolencias(Dolencias dolencias);
}
