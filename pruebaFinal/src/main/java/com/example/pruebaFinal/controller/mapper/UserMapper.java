package com.example.pruebaFinal.controller.mapper;

import java.beans.JavaBean;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.pruebaFinal.entity.UserEntity;

@Mapper
public interface UserMapper {
	
@Select("select * from Users")
public List<UserEntity> findAllUsers();

@Select("select * from User where id=#{id}")
public UserEntity findUserById(int id);

@Insert("insert into User(nombre,correo) values(nombre=#{nombre},correo=#{correo})")
public void insertUser(UserEntity userEntity);

@Update("update User set nombre=#{userEntity.nombre},corre=#{userEntity.correo}"
		+ "where id=#{id}")
public void updateUser(UserEntity userEntity, int id);
@Delete("delete from User where id=#{id}")
public void deleteUser(int id);

}
