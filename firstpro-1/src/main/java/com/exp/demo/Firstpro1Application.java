package com.exp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Firstpro1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Firstpro1Application.class, args);
		
		
		Alien obj = context.getBean(Alien.class);
		obj.code();
		obj.age=15;
		System.out.println("object1 age is "+obj.age);
		Alien obj1 = context.getBean(Alien.class);
		
		System.out.println("object2 age is:"+obj1.age);
	}

}
