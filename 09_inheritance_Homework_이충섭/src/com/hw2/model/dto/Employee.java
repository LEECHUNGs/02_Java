package com.hw2.model.dto;

public class Employee extends Person{
	
	private String position;
	
	public Employee() {}	

	public Employee(String id, String name, String position) {
		super(id, name);
		this.position = position;
	}

	@Override
	public String getInfo() {
		String str = "Id : " + super.id + ", 이름 : " + super.name + ", 직책 : " + position;
		
		return str;
	}
}
