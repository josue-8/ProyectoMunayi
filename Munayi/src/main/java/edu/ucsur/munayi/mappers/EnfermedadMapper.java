package edu.ucsur.munayi.mappers;

import java.util.List;

import edu.ucsur.munayi.model.Enfermedad;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EnfermedadMapper {
	public List<Enfermedad> listarEnfermedad();
	public int actualizarEnfermedad(Enfermedad  enfermedad);
	public int agregarEnfermedad(Enfermedad enfermedad);
}
