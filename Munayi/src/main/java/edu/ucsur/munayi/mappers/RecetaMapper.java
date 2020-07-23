package edu.ucsur.munayi.mappers;

import java.util.List;
import edu.ucsur.munayi.model.Receta;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecetaMapper {
	public List<Receta> listarReceta();
	public int agregarReceta(Receta receta);
	public int actualizarReceta(Receta  receta);
}
