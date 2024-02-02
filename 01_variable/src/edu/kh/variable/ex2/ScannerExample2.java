package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		
		// 사칙연산 계산기
		// -> 두 실수를 입력받아 사칙연산 결과를 모두 출력
		// 단, 출력 결과는 소수점 이하 2자리까지 표현
		
		// 정수 : sc.nextInt()
		// 실수 : sc.nextDouble()
		
		Scanner sc = new Scanner(System.in);
		
		double a, b;
		
		System.out.print("실수 1 입력 : ");
		a = sc.nextDouble();
		
		System.out.print("실수 2 입력 : ");
		b = sc.nextDouble();
		
		System.out.printf("+ : %f + %f = %.2f\n", a, b, a + b);
		System.out.printf("- : %f - %f = %.2f\n", a, b, a - b);
		System.out.printf("* : %f * %f = %.2f\n", a, b, a * b);
		System.out.printf("/ : %f / %f = %.2f\n", a, b, a / b);

		
		
	}
}
