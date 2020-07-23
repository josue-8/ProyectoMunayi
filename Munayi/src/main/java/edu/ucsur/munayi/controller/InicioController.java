package edu.ucsur.munayi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import edu.ucsur.munayi.model.Usuario;
import edu.ucsur.munayi.service.UsuarioService;

@Controller
@Scope("session")
@SessionAttributes("user")
public class InicioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping({ "/login" })
	public String login() {

		return "login";
	}
	
	@GetMapping({ "/index" })
	public String index() {

		return "index";
	}

	@RequestMapping(value = { "/autenticacion" })
	public String autenticacion(Model model, @RequestParam(name = "usuario") String username,
			@RequestParam(name = "password") String password) {
		String mensaje;
		Usuario usuario;

		usuario = new Usuario(username, password);
		if (usuarioService.validarUsuario(usuario)) {
			mensaje = "Password correcto";
			model.addAttribute("msg", mensaje);
			model.addAttribute("user", usuario);
			return "principal";
		} else {
			mensaje = "Password incorrecto";
			model.addAttribute("msg", mensaje);
			model.addAttribute("user", usuario);
			return "login";
		}
	
}
}
