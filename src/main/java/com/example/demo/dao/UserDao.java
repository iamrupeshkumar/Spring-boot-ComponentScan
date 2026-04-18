package com.example.demo.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.example.demo.security.AppSecurity;

@Repository
public class UserDao {
	
	public UserDao() {
		System.out.println("UserDao :: Constructor");
	}
	
	@Bean
	public AppSecurity createInstance() {
		AppSecurity as = new AppSecurity();
		// custom logic to secure our application
		return as;
	}

}
