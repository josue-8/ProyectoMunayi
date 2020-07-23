package edu.ucsur.munayi.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.ucsur.munayi.model.Usuario;

@Mapper
public interface UsuarioMapper {
	public List<Usuario> listarUsuarios();
	public Usuario findUsername(String username);
	public int actualizarUsuario(Usuario usuario);
}
