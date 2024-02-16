package com.hw2.model.dto;

public class Prisoner extends Person{
	
	private String crime;
	
	public Prisoner() {}
 	
	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
	}


	@Override
	public String getInfo() {
		String str = "Id : " + super.id + ", 이름 : " + super.name + ", 죄목 : " + crime;
		
		return str;
	}
}
