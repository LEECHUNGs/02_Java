package com.hw5.model.dto;

import java.util.Set;

public class Toy {
	
	private String name;
	private int age;
	private int price;
	private String color;
	private String makeYMD;
	private Set<String> matarials = null;
	
	public Toy() {
		
	}

	public Toy(String name, int age, int price, String color, String makeYMD, Set<String> matarials) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.makeYMD = makeYMD;
		this.matarials = matarials;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMakeYMD() {
		return makeYMD;
	}

	public void setMakeYMD(String makeYMD) {
		this.makeYMD = makeYMD;
	}

	public Set<String> getMatarials() {
		return matarials;
	}

	public void setMatarials(Set<String> matarials) {
		this.matarials = matarials;
	}

	@Override
	public String toString() {
		return "Toy [name=" + name + ", age=" + age + ", price=" + price + ", color=" + color + ", makeYMD=" + makeYMD
				+ ", matarials=" + matarials + "]";
	}
	
}
