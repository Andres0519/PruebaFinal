package com.example.pruebaFinal.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.html.parser.Entity;

import com.example.pruebaFinal.entity.UserEntity;

public class UserController {
	
	UserEntity userA;
	ArrayList<UserEntity> lista = new ArrayList<>();

	UserController(){
		
		userA = new UserEntity("Andres", "andres@test.com");
		UserEntity user2 = new UserEntity("Nuevo", "NOOOOO");
		lista.add(userA);
		lista.add(user2);
		
	}

	public List<UserEntity> lista(){
		
		return lista;
		
	}
	
	public void agregar(UserEntity user) {
		
		userA = new UserEntity(user.getNombre(), user.getCorreo());
		lista.add(userA);
		
		
	}
	
	public UserEntity buscar(Long id) {
		
		for (int i = 0; i < lista.size(); i++) {
			
			if (lista.get(i).getId() == id) {
				
				return lista.get(i);
				
			}
			
		}
		
		return null;
		
	}

	public void eliminar(Long usuario) {
		
		UserEntity user = buscar(usuario);
		lista.remove(user);
		
		
	}
	
	public void editar(UserEntity usuario) {
		
		String b = usuario.getNombre();
		String c = usuario.getCorreo();
		
		UserEntity user = new UserEntity(b, c);
		lista.add(user);
		
		
		
	}
	
	

}
