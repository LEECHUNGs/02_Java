package edu.kh.poly.ex2.model.vo;

public class Fish extends Animal{
	
	public Fish() {
		// TODO Auto-generated constructor stub
	}
	
	public Fish(String type, String eatType) {
		super(type, eatType);
		// TODO Auto-generated constructor stub
	}


	// alt + shift + s -> 
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("입으로 먹는다");
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("아가미로 숨쉰다");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("지느러미로 헤엄친다");
	}

}
