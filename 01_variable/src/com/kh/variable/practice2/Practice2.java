package com.kh.variable.practice2;

import java.util.Scanner;

public class Practice2 {
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		char a = sc.next().charAt(0);
		
		System.out.printf("입력받은 문자 : %c\n", a);
		System.out.printf("입력받은 문자의 유니코드 : %d\n", (int)a);
		
	}
}
