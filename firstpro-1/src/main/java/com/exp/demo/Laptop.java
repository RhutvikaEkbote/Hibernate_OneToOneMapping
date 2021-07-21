package com.exp.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	public Laptop() {
		System.out.println("Laptop object created");
	}
	public void compile() {
		
		System.out.println("laptop compiling");
	}
	
}
