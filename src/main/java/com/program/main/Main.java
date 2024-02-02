package com.program.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;


@SpringBootApplication //alternate for below three notations

@EnableAutoConfiguration //create spring application context
@ComponentScan //only scans classes annoted by @component within same package 
@SpringBootConfiguration //Your main class itself is a configuration class
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = SpringApplication.run(Main.class, args);
	}

}

//for spring core
//@Component
//class person{}
//
//@Configuration
//@ComponentScan(basePackages = "com.program.main") //for spring core
//class config{
//	//here we have to do manual configurations for spring core
//}
