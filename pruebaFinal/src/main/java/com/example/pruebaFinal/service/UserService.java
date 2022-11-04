package com.example.pruebaFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.pruebaFinal.controller.UserController;
import com.example.pruebaFinal.entity.UserEntity;

@Component
public class UserService {
	
	@Autowired
	UserController userController;
	
	public List<UserEntity> findAllUsers(){
		
		return userController.findAllUsers();
		
	}
	
	public void insertUser(UserEntity entity) {
		
		userController.insertUser(entity);
		
	}
	
	public String totalDatos(String datos){
		
		return userController.totalDatos(datos);
		
	}
	
	public void deleteUser(int id) {
		
		userController.deleteUser(id);
	}

}
