package com.hw2.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {

	private ArrayList<Animal> animals = new ArrayList<Animal>();
	
	public Zoo() {}
	
	public void addAnimal(Animal animal) {
		
		animals.add(animal);
	}
	
	public void showAnimals() {
		
		
	}
	
	public void displayMenu() {
		
		Scanner sc = new Scanner(System.in);
		
		int inputNum = 0;
		
		do {
			
			System.out.println("****** KH 동물원 ******");
			System.out.println("원하는 작업을 선택하세요 :");
			System.out.println("1. 동물들의 울음소리 듣기");
			System.out.println("2. 종료");
			System.out.print("선택 : ");
			
			try {
				
				inputNum = sc.nextInt();
				
				switch(inputNum) {
				case 1 : 
					
					for(Animal ani : animals) 
						ani.sound();
					break;
				case 2 : 
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
			catch(InputMismatchException e) {
				
				System.out.println("유효하지 않은 입력입니다.");
			}
			
			
		} while (inputNum != 2);
	}
}
