package edu.ucsur.munayi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.ucsur.munayi.model.Enfermedad;
import edu.ucsur.munayi.service.EnfermedadService;

@Controller
@RequestMapping("/Enfermedad")
public class EnfermedadController{
	@Autowired
	private EnfermedadService enfermedadService;

	@RequestMapping(value = { "/formularioenfermomental" })
	public String formularioEnfermedad(Model model) {
		List<Enfermedad> listadoEnfermedad;
		listadoEnfermedad = enfermedadService.listarEnfermedad();
		model.addAttribute("listarEnfermedad", listadoEnfermedad);
		model.addAttribute("enfermedad", new Enfermedad());
		return "enfermo";
	}

	@RequestMapping(value = { "/crear" }, method = RequestMethod.POST)
	public String crearEnfermedad(@ModelAttribute Enfermedad enfermedad, BindingResult errors, Model model) {
		enfermedadService.agregarEnfermedad(enfermedad);
		model.addAttribute("enfermedad", enfermedadService.listarEnfermedad());
		return "redirect:/Enfermedad/lista";
	}

	@RequestMapping(value = { "/actualizar" })
	public String actualizarEnfermedad(@ModelAttribute Enfermedad enfermedad, BindingResult errors, Model model) {
		enfermedadService.actualizarEnfermedad(enfermedad);
		model.addAttribute("enfermedad", enfermedadService.listarEnfermedad());
		return "redirect:/munayi";
	}

	@RequestMapping(value = { "/lista" }, method = RequestMethod.GET)
	public String listarEnfermedad(Model model) {
		model.addAttribute("enfermedad", enfermedadService.listarEnfermedad());
		return "enfermo";
	}
 }