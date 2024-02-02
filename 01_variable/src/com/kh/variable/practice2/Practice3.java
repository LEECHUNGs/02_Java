package com.kh.variable.practice2;

import java.util.Scanner;

public class Practice3 {
	
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		double a = sc.nextDouble();
		
		System.out.print("영어 점수 : ");
		double b = sc.nextDouble();
		
		System.out.print("수학 점수 : ");
		double c = sc.nextDouble();
		
		System.out.printf("총 점 : %d, 평균 : %d\n", (int)(a + b + c), (int)(a+b+c)/3);
	}
	public void ex3() {

		// sc.next() 와 sc.nextLine() 차이
		
		// next() : 띄어쓰기 입력 불가, 띄어쓰기를 구분인자로 생각하여 각각 저장
		// nextLine() : 문자열에 띄어쓰기 간으, 줄구분까지 저장
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 1 :");
		String input1 = sc.nextLine();
		
		System.out.print("문자열 입력 2 :");
		String input2 = sc.next();
		
		System.out.println(input1);
		System.out.println(input2);
		
	}
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input1 = sc.nextInt();
		System.out.println(input1);
		
		System.out.print("문자열 입력 : ");
		String input2 = sc.nextLine();
		System.out.println(input2);
	}

}
