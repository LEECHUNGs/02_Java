package com.kh.practice.snack.model.vo;

public class Snack {
	
	private String kind; 
	private String name; 
	private String flavor;
	private int numOf;
	private int price;
	
	public Snack() {}
	
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String information() {
		
		return this.kind + "(" + this.name + " - " + this.flavor + ") " + 
				this.numOf + "개 " + this.price + "원";
	}
}
