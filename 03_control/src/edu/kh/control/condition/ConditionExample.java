package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { // 기능 제공용 클래스
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		// if문
		// 조건식이 true일 때만 내부코드 수행
		
		/*
		 * [작성법]
		 * if(조건식) {
		 * 		조건식이 true 일 때 수행하는 코드
		 * }
		 * 
		 * 
		 * */
		
		// 입력받은 정수가 양수인지 검사
		// 양수라면 양수입니다 출력
		
		int input = sc.nextInt(); 
		
		
		if(input > 0) {
			System.out.println("양수입니다.");
		}
		
		if(input <= 0) {
			System.out.println("양수가 아니다.");
		}
		
		
	}
	public void ex2() {
		
		// if - else 문
		// 조건식 결과가 true 이면 if 문,
		// false 이면 else 구문 실행
		
		/*
		 * [작성법]
		 * 
		 * if(조건식) {
		 * 		조건식이 ture 일 때 수행될 코드
		 * }
		 * else {
		 * 		조건식이 false 일 때 수행될 코드
		 * }
		 * 
		 * */
		
		// 홀짝 검사
		// 입력받은 정수값이
		// 홀수이면 홀수입니다 출력
		// 짝수이면 짝수입니다 출력
		// 0이면 0입니다 출력
		// else if 사용 X, 중첩 if문 사용
		
		int input1 = sc.nextInt();
		
		if(input1 % 2 == 0) {
			if(input1 == 0)
				System.out.println("0 입니다.");
			else 
				System.out.println("짝수 입니다.");
		}
		else {
			System.out.println("홀수 입니다.");
		}
	}
	public void ex3() {
		
		// 양수, 음수, 0 판별
		// if(조건식) - else if(조건식) - else
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수 입니다.");
		}
		else if(input < 0) {
			System.out.println("음수 입니다.");
		}
		else {
			System.out.println("0 입니다.");
		}
	}
	public void ex4() {
		
		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 단, 겨울일 때 온도가 -15도 이하 "한파 경보", -12 이하
		// "한파 주의보"
		// 여름일때 온도가 35도 이상 "폭염 경보", 33도 이상 
		// "폭염 주의보"
		// 1~12 사이가 아니면 "해당 계절이 없습니다" 출력
		// 1, 2, 12 겨울
		// 3~5 여름
		// 9~11 가을
		
		System.out.print("달 입력 : ");
		int input1 = sc.nextInt();
		System.out.print("온도 입력 : ");
		int input2 = sc.nextInt();
		
		if((input1 > 0 && input1 < 3) || (input1 == 12)) {
			System.out.println("계절 : 겨울");
			if(input2 <= -15)
				System.out.println("한파 경보");
			else if (input2 < -12) {
				System.out.println("한파 주의보");
			}
		}
		else if(input1 >= 3 && input1 <= 5) {
			System.out.println("봄");
		}
		else if(input1 >= 6 && input1 <= 8) {
			System.out.println("여름");
		}
		else if(input1 >= 9 && input1 <= 11) {
			System.out.println("가을");
		}
		else {
			System.out.println("해당 계절이 없습니다");
		}
	}
	
	public void ex5() {
		
		String text = "";
		System.out.print("나이를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input <= 13) {
			text = "어린이 입니다.";
		}
		else if(input <=19) {
			text = "청소년 입니다.";
		}
		else {
			text = "성입 입니다.";
		}
		
		System.out.println(text);
	}
	
	public void ex6() {
		
		String text = "";
		System.out.print("점수를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 0 || input > 100) text = "잘못 입력하셨습니다.";
		else if(input >= 90) text = "A";
		else if(input >= 80) text = "B";
		else if(input >= 70) text = "C";
		else if(input >= 60) text = "D";
		else text = "F";
		
		System.out.println(text);
	}
	
	public void ex7() {
		String text = "";
		
		
		System.out.print("키를 입력하세요 : ");
		double input = sc.nextDouble();
		
		System.out.print("나이를 입력하세요 : ");
		int input2 = sc.nextInt();
		
		
		if(input >= 140) {
			if(input2 > 0 && input2 < 100)
				text = "탑승 가능";
			else
				text = "잘못 입력 하셨습니다.";
		}
		
		else 
			text = "적정 키가 아닙니다.";
		
		System.out.println(text);
	}
	
	public void ex8() {
		
		System.out.print("나이를 입력하세요 : ");
		int input1 = sc.nextInt();
		if(input1 < 0 || input1 > 100) {
			System.out.println("나이를 잘못 입력 하셨습니다.");
			return;
		}
		
		System.out.print("키를 입력하세요 : ");
		double input2 = sc.nextDouble();
		if(input2 < 0 || input2 > 250.0) {
			System.out.println("키를 잘못 입력 하셨습니다.");
			return;
		}
		
		String text = "";
		
		if(input2 >= 140.0) {
			if(input1 >= 12) {
				text = "탑승 가능";
			}
			else {
				text = "키는 적절하나, 나이는 적절치 않음";
			}
		}
		else {
			if(input1 >= 12) {
				text = "나이는 적절하나, 키가 적절치 않음";
			}
			else {
				text = "나이와 키 모두 적절치 않음";
			}
		}
			
		System.out.println(text);
	}
	
}



















