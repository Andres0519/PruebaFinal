package com.example.pruebaFinal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.pruebaFinal.PruebaFinalApplication;
import com.example.pruebaFinal.controller.mapper.UserMapper;
import com.example.pruebaFinal.entity.UserEntity;

@RestController
public class UserRestController {
	
	@Autowired
	private UserMapper map;
	
	public static Logger LOG = LoggerFactory.getLogger(PruebaFinalApplication.class);

	@GetMapping("/index")
	public String mostrar(Model model) {

		model.addAttribute("users", map.findAllUsers());
		LOG.info(map.findAllUsers().toString());

		return "index";
	}

	@GetMapping("/agregar")
	public String ver(UserEntity user) {

		return "agregar";
	}

	@PostMapping("/agregarUser")
	public String agregar(UserEntity user, Model model) {

		map.insertUser(user);

		return "redirect:/index";
	}

	@GetMapping("/editar/{id}")
	public String editar(@PathVariable("id") int id, Model model) {
		
		model.addAttribute(map.findUserById(id));

		return "editar";
	}

	@PutMapping("/editarUser/{id}")
	public String editarUser(UserEntity user, @PathVariable("id") int id) {
		
		map.updateUser(user, id);

		return "redirect:/index";

	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable("id") int id) {
		
		map.deleteUser(id);
		
		return "redirect:/index";
		
	}

}
