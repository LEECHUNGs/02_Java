package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone {
	
	private boolean hasPhysicalKeybord;
	
	public BasicPhone() {}

	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeybord) {
		super(brand, model, year, price);
		this.hasPhysicalKeybord = hasPhysicalKeybord;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		
		if(hasPhysicalKeybord)
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
	}
	
}
