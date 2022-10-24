package com.example.pruebaFinal.entity;



public class UserEntity {
	
	private long id = (long) Math.random()*10+1;
	
	private String nombre;
	
	private String correo;
	
	public UserEntity(String nombre, String correo) {
		
		this.nombre = nombre;
		this.correo = correo;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", nombre=" + nombre + ", correo=" + correo + "]";
	}
	
	

}
