package edu.ucsur.munayi.mappers;

import java.util.List;
import edu.ucsur.munayi.model.Medicamento;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MedicamentoMapper {
	public List<Medicamento> listarMedicamento();
	public int agregarMedicamento(Medicamento medicamento);
	public int actualizarMedicamento(Medicamento  medicamento);
}
