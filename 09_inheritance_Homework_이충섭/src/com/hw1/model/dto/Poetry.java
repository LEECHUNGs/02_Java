package com.hw1.model.dto;

public class Poetry extends Book{
	
	private int numberOfPoems;
	
	public Poetry() {}

	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		String str = "[시집] ";
		str += "제목 : " + super.getTitle() + " / 저자 : " + super.getAuthor() + " / 시 수 : " + numberOfPoems;
		
		System.out.println(str);
	}
}
