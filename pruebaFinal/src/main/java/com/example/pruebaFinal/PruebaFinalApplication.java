package com.example.pruebaFinal;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.pruebaFinal.controller.mapper.UserMapper;
import com.example.pruebaFinal.entity.UserEntity;

@SpringBootApplication
@MapperScan("com.example.pruebaFinal.controller.mapper")
@MappedTypes({UserEntity.class})
public class PruebaFinalApplication{
	

	public static void main(String[] args) {
		SpringApplication.run(PruebaFinalApplication.class, args);
	}
	

}