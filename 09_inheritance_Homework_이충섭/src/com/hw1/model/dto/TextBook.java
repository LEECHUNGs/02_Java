package com.hw1.model.dto;

public class TextBook extends Book{
	
	private String subject;

	public TextBook() {}

	public TextBook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}


	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		String str = "[전문 서적] ";
		str += "제목 : " + super.getTitle() + " / 저자 : " + super.getAuthor() + " / 과목 : " + subject;
		
		System.out.println(str);
	}	
}
