package edu.kh.variable.ex2;

import java.util.Scanner;

// import : 다른 패키지에 존재하는 클래스를 얻어오는 구문
// import java.util.Scanner : java.util 패키지에서 Scanner 설계도 수입

public class ScannerExample {
	public static void main(String[] args) {
		
		// Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할 
		
		// Scanner 생성
		// -> 프로그램 안에 스캐너라는 기계를 만드는 행위
		
		Scanner sc = new Scanner(System.in);
		
		// 오류 원인 -> 만들고 싶으나 설계도가(class)가 없어서 만들수 없음
		// -> import 구문 작성 시 오류 해결
		
		System.out.print("정수1 입력 : ");
		
		int input1 = sc.nextInt(); // 입력받은 정수 input1 변수에 대입
		// nextInt() : 다음 입력된 정수를 읽어옴 (키보드로 입력된 정수를 읽어옴)
		
		System.out.print("정수2 입력 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d + %d = %d", input1, input2, input1 + input2);
	}
}
