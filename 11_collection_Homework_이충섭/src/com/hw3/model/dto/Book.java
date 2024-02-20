package com.hw3.model.dto;

public class Book {
	
	private int bNum;
	private String title;
	private String author;
	private int price;
	private String pulisher;
	
	public Book() {}

	public Book(int bNum, String title, String author, int price, String pulisher) {
		super();
		this.bNum = bNum;
		this.title = title;
		this.author = author;
		this.price = price;
		this.pulisher = pulisher;
	}
	
	public int getbNum() {
		return bNum;
	}

	public void setbNum(int bNum) {
		this.bNum = bNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPulisher() {
		return pulisher;
	}

	public void setPulisher(String pulisher) {
		this.pulisher = pulisher;
	}

	@Override
	public String toString() {
		return bNum + "번 도서 : [도서제목 : " + title + " / 도서저자 : " + author + " / 도서가격 : " + price + "원 / 출판사 : "
				+ pulisher + "]";
	}
	
	
}
