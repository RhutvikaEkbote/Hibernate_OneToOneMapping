package com.exp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Alien {
	
	int age=10;

	public Alien() {
		System.out.println("alien object created");
	}
	@Autowired
	Laptop lap;
	@Autowired
	Desktop desk;
	public void code() {
		lap.compile();
		desk.compile();
	}
}
