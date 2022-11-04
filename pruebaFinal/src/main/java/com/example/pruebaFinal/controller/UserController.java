package com.example.pruebaFinal.controller;

import java.util.List;

import javax.swing.text.html.parser.Entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.pruebaFinal.controller.mapper.UserMapper;
import com.example.pruebaFinal.entity.UserEntity;

@Component
public class UserController {
	
	
	@Autowired
	private UserMapper mapper;
	
	public List<UserEntity> findAllUsers(){
		
		return mapper.findAllUsers();
		
	}
	
	public void insertUser(UserEntity userEntity) {
		
		mapper.insertUser(userEntity);
		
	}
	
	public String totalDatos(String dato) {
		
		return mapper.totalDatos(dato);
		
	}
	
	public void deleteUser(int id) {
		
		mapper.deleteUser(id);
		
	}

	

}
