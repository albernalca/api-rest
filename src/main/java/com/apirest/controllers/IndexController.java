package com.apirest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apirest.models.Usuario;


@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/index", "/", "", "/home"})
	public String index(Model model) {
		model.addAttribute("titulo", "Spring Framework");
		return "index";
		
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		
		Usuario usuario = new Usuario();
		
		usuario.setNombre("Alejandro");
		usuario.setApellido("Bernal Castiblanco");
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil Usuario: ".concat(usuario.getNombre()));
		
		return "perfil";
		
	}
}
