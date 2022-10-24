package com.example.pruebaFinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.example.pruebaFinal.entity.UserEntity;

@Controller
public class UserRestController {

	UserController user = new UserController();

	@GetMapping("/index")
	public String mostrar(Model model) {

		model.addAttribute("users", user.lista());

		return "index";
	}

	@GetMapping("/agregar")
	public String ver(UserEntity user) {

		return "agregar";
	}

	@PostMapping("/agregarUser")
	public String agregar(UserEntity user, Model model) {

		this.user.agregar(user);

		return "redirect:/index";
	}

	@GetMapping("/editar/{id}")
	public String editar(@PathVariable("id") Long id, Model model) {
		
		UserEntity usuario = user.buscar(id);
		
		if (usuario == null) {
			
			return "index";
			
		}
		
		model.addAttribute("userEntity" , usuario);
		user.eliminar(id);

		return "editar";
	}

	@PostMapping("/editarUser/{id}")
	public String editarUser(UserEntity user) {
		
		this.user.editar(user);

		return "redirect:/index";

	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable("id") Long id) {
		
		user.eliminar(id);
		
		return "redirect:/index";
		
	}

}
