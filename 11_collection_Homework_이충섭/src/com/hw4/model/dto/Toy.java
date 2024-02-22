package com.hw4.model.dto;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Toy {
	
	// 필드
	private String name;
	private int age; // 사용가능 연령
	private int price;
	private String color;
	private String year; // 제조일(문자열로 표현 =20240222)
	
	private Map<Integer, String> resorce;
	
	// 메서드
	public Toy() {}

	public Toy(String name, int age, int price, String color, String year, Map<Integer, String> resorce) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.year = year;
		this.resorce = resorce;
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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Map<Integer, String> getResorce() {
		return resorce;
	}

	public void setResorce(Map<Integer, String> resorce) {
		this.resorce = resorce;
	}

	@Override
	public String toString() {
		String str = "이름 : " + name + " / 가격 : " + age + " / 색상 : " + color + 
				   " / 사용가능연령 : " + age + " / 제조년월일 : " + year+ 
				   " / 재료 : ";
		
		Set<Entry<Integer, String>> set = resorce.entrySet();
		
		for(Entry<Integer, String> e : set) {
			
			str += e.getValue() + " ";
		}
		
		return str;
	}
	
	// materials 안 모든 재료를 문자열 형태로 만들어 반환하는 메서드
//	public String getMaterialsAsString() {
//		
//		StringBuilder sb = new StringBuilder();
//		
//		for(String material : resorce) {
//			
//			sb.append(material).append(", ");
//		}
//		
//		if(sb.length() > 0) {
//			sb.setLength(sb.length() - 2);
//		}
//		
//		return sb.toString(sb);
//	}
	
}
