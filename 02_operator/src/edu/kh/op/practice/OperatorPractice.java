package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (num2 / num1));
		System.out.println("남는 사탕 개수 : " + (num2 % num1));
		
		sc.close();
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(정수만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		int classNum = sc.nextInt();
		
		System.out.print("번호(정수만) : ");
		int num  = sc.nextInt();
		
		System.out.print("성별 : ");
		String gender = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double sum = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f 이다", 
							grade, classNum, num, name, gender, sum);
		
		sc.close();
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int a = sc.nextInt();
		
		System.out.print("영어 : ");
		int b = sc.nextInt();
		
		System.out.print("수학 : ");
		int c = sc.nextInt();
		
		System.out.println("합계 : " + (a+b+c));
		System.out.printf("평균 : %.1f",(double)(a+b+c) / 3);
		
		sc.close();
	}
}
