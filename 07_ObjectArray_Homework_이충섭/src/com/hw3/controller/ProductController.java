package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	
	private Product[] pro =  new Product[10];
	
	static int count = 0;
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		do {
			
			System.out.println("\n===== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("==> ");
			int inputNum = sc.nextInt();
			
			switch(inputNum) {
			case 1: productInput(); break;
			case 2: productPrint(); break;
			case 0: System.out.println("프로그램을 종료합니다..."); return;
			default : System.out.println("잘못된 입력 입니다. 다시 입력해 주세요"); break;
			}
			
		} while(true);
	}
	
	public void productInput() {
		
		System.out.print("도서 번호 : ");
		int inputPid = sc.nextInt();
		
		System.out.print("도서 이름 : ");
		String inputName = sc.next();
		
		System.out.print("도서 가격 : ");
		int inputPrice = sc.nextInt();
		
		System.out.print("도서 세금 : ");
		double inputTax = sc.nextDouble();
		
		if(count >= pro.length) {
			System.out.println("더 이상 도서를 저장할 수 없습니다.");
		}
		
		pro[count++] = new Product(inputPid, inputName, inputPrice, inputTax);
		System.out.println("count : " + count);
	}
	
	public void productPrint() {
		
		
		String result = "";
		
		for(int i = 0; i<count; i++ ) {
			result += pro[i].information();
			result += "---------------------\n";
		}
		
		System.out.println(result);
	}
	
}
