package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.security.AppSecurity;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.demo","com.wallmart"})
public class SpringBootComponentScanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootComponentScanApplication.class, args);
	}
	
//	@Bean
//	public AppSecurity createInstance() {
//		AppSecurity as = new AppSecurity();
//		// custom logic to secure our application
//		return as;
//	}

}
