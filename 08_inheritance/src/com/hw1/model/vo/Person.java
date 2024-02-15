package com.hw1.model.vo;

public class Person {
	
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {}

	public Person(int age, double height, double weight) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String information() {
		/*
		String str = "";
		
		str += "이름 : " + name +
				", 나이 : " + age +
				", 신장 : " + height +
				", 몸무게 : " + weight;
		
		return str;
		*/
		
		return String.format("이름 : %s / 나이 : %s / 신장 : %.1f / 몸무게 : %.1f", 
								name, age, height, weight);
	}
}
