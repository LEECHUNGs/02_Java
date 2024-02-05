package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1이상의 숫자를 입력해 주세요");
			return;
		}
			
		
		for(int i = 1; i<=num; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void practice2() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1이상의 숫자를 입력해 주세요");
			return;
		}
		
		for(int i = num; i>0; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void practice3() {
		System.out.print("정수 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i<=num; i++) {
			sum += i;
			System.out.print(i);
			
			if(i == num) break;
			
			System.out.print(" + ");
		}
		
		System.out.println(" = " + sum);
	}
	
	public void practice4() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		int min = num1;
		int max = num2;
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해 주세요");
			return;
		}
		
		if(num1 > num2) {
			min = num2;
			max = num1;
		}
		
		for(int i = min; i<=max; i++) {
			
			System.out.print(i + " ");
		}
			
	}

	public void practice5() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("========" + num + "단========");
		
		for(int i = 1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}

	public void practice6() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 2 || num > 9) {
			System.out.println("2~9 사이 숫자만 입력해주세요");
			return;
		}
		
		for(int i = num; i<10; i++) {
			System.out.println("========" + num + "단========");
			for(int j = 1; j<10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		}
	}

	public void practice7() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void practice8() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int j = num; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void practice9() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int j = 1; j<=i; j++) {
				if(i-num>=j+1)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
