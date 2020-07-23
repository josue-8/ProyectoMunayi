package edu.ucsur.munayi.service;

import java.util.List;
import edu.ucsur.munayi.model.Usuario;

public interface UsuarioService {
	public List<Usuario> listarUsuarios();
	public Usuario buscarUsuario(String username); 
	public boolean validarUsuario(Usuario usuario);

}
