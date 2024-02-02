package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	
	
	public void old() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 나이는 ? : ");
		int year = sc.nextInt();
		
		String a;
		boolean result1 = year >= 20;
		boolean result2 = year > 13 && year <= 19;
		boolean result3 = year >= 65 || year <= 12;
		
		String str1 = result1 ? "성인" : "미성년";
		String str2 = result2 ? "true" : "false";
		String str3 = result3 ? "true" : "false";
		
		System.out.println(str1 + "입니다.");
		System.out.println("청소년 입니까? : " + str2);
		System.out.println("노인이거나 어린이입니까? : " + str3);

	}
}
