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
	
public List<UserEntity> findAllUsers();

public UserEntity findUserById(int id);

public String totalDatos(String dato);

public void insertUser(UserEntity userEntity);

public void updateUser(UserEntity userEntity, int id);

public void deleteUser(int id);

}
