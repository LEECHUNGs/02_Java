package com.hw3.model.vo;

public class Product {
	
	private int pid;
	private String pName;
	private int price;
	private double tax;
	
	public Product() {}

	public Product(int pid, String pName, int price, double tax) {
		this.pid = pid;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
	}
	
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public String information() {
		
		return "도서 번호 : " + pid +
				"\n도서 이름 : " + pName +
				"\n도서 가격 : " + price + 
				"\n도서 세금 : " + tax + "\n";
	}
	
}
