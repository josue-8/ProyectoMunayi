package edu.ucsur.munayi.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import edu.ucsur.munayi.model.Usuario;
import edu.ucsur.munayi.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	private List<Usuario> listaUsuarios;

	public UsuarioServiceImpl() {
		super();
		listaUsuarios = new ArrayList<Usuario>();
		listaUsuarios.add(new Usuario("Juan", "clave"));
		listaUsuarios.add(new Usuario("Pedro", "clave"));
		listaUsuarios.add(new Usuario("Anita", "clave"));
	}

	@Override
	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return listaUsuarios;
	}

	@Override
	public Usuario buscarUsuario(String username) {

		for (Usuario usuario : listaUsuarios) {
			if (usuario.getUsername().equals(username)) {
				return usuario;
			}
		}
		return null;
	}

	@Override
	public boolean validarUsuario(Usuario usuario) {
		for (Usuario user : listaUsuarios) {
			if (usuario.getUsername().equals(user.getUsername())) {
				if (usuario.getPassword().equals(user.getPassword())) {
					return true;
				} 
			}
		}		
		return false;
	}
}
