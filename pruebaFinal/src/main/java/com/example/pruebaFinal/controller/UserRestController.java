package com.example.pruebaFinal.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.pruebaFinal.PruebaFinalApplication;
import com.example.pruebaFinal.controller.mapper.UserMapper;
import com.example.pruebaFinal.entity.UserEntity;
import com.example.pruebaFinal.service.UserService;

@RestController
public class UserRestController {
	
	@Autowired
	UserService userService;
	
	public static Logger LOG = LoggerFactory.getLogger(PruebaFinalApplication.class);
	
	@GetMapping("/")
	public ModelAndView info() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setStatus(HttpStatus.OK);
		
		List<UserEntity> allusers = userService.findAllUsers();
		String totalDatos = userService.totalDatos(null);
		
		modelAndView.addObject("users" , allusers);
		modelAndView.addObject("total",totalDatos);
		modelAndView.setViewName("index.html");
		
		return modelAndView;
		
		
	}
	@GetMapping("/agregar")
	public ModelAndView agregar(UserEntity user) {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("agregar.html");
		return modelAndView;
		
	}
	
	@PostMapping("/agregarUser")
	public ModelAndView agregarUser(UserEntity user) {
		
		userService.insertUser(user);
		
		return info();
		
	}
	
	@GetMapping("/eliminar/{id}")
	public ModelAndView deleteUser(@PathVariable("id") int id) {
		
		userService.deleteUser(id);
		return info();
		
	}
	
	//Intento AngularJS
	@GetMapping("/mostrar")
	public List<UserEntity> entities(Model model){
		
		model.addAttribute("lista", userService.findAllUsers());
		return userService.findAllUsers();
		
	}
	

}
