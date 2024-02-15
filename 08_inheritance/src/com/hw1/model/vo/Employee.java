package com.hw1.model.vo;

public class Employee extends Person{
	
	private int salary;
	private String dept;
	
	public Employee() {}

	public Employee(String name, int age, double height
					, double weight, int salary, String dept) {
		
		super(age, height, weight);
		super.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	@Override
	public String information() {
		String str = super.information();
		
		str += ", 급여 : " + salary +
				", 부서 : " + dept;
		
		
		return str;
	}
}
