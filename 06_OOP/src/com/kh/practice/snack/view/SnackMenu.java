package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
		
		// 데이터 입력
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류 : ");
		String kind = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("맛 : ");
		String flavor = sc.next();
		
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		
		// 데이터 저장
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		
		
		// 정보 확인
		System.out.print("저장된 정보를 확인하시겠습니까?(y/n) : ");
		String check = sc.next();
		
		if(check.equals("y")) {
			System.out.print(scr.confirmData());
		}
		
	}
}
