package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample { // 기능제공용 클래스
	
	/* for 문
	 * - 끝이 정해져 있는 (횟수가 지정된) 반복문
	 * 
	 * [작성법]
	 * 
	 * for(초기식; 조건식; 증감식) {
	 * 		조건식이 true일 때 반복할 코드
	 * }
	 * 
	 * - 초기식 : for문을 제어하는 용도의 변수 선언
	 * 
	 * - 조건식 : for문의 반복 여부를 지정하는 식
	 * 			보통 초기식에 사용된 변수를 이용해 작성
	 * 
	 * - 증감식 : 초기식에 사용된 변수를
	 * 			for문이 끝날 때 마다 증가 또는 감소시켜
	 * 			조건식의 결과를 변하게 하는 식
	 * 
	 * */
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		for(int i = 0; i<= 10; i++) {
			System.out.println(i);
		}
	}
	
	public void ex2() {
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		for(int i = 1; i <= input; i++) {
			System.out.println(i);
		}
	}
	
	public void ex3() {
		// 영어 알파벳 A-Z까지 한줄로 출력
		for(int i = 'A'; i<'Z'; i++) {
			System.out.print((char)(i));
		}
	}
	
	public void ex4() {
		// 정수 5개를 입력 받아서 합계 구하기
		
		// ex)
		// 입력1 : 10
		// 입력2 : 20
		// 입력3 : 30
		// 입력4 : 40
		// 입력5 : 50
		// 합계 : 150
		int sum = 0;
		
		for(int i = 0; i<5; i++) {
			System.out.print("입력" + (i+1) + " : ");
			sum += sc.nextInt();
		}
		
		System.out.println("합계 : " + sum);
	}
	
	public void ex5() {
		// 1~20 까지 1씩 증가하며 출력
		// 단, 입력받은 수의 배수는 양쪽에 () 표시
		// ex)
		// 괄호를 표시할 배수 : 3
		// 12(3)45(6)...20
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i<=20; i++) {
			if(i%input == 0)
				System.out.print("(" + i + ") ");
			else 
				System.out.print(i + " ");
		}
	}
	
	public void ex6() {
		// [구구단 출력]
		// 2~9 사이 수를 하나 입력받아
		// 해당 단 출력
		// 단, 입력받은 수가 2~9 숫자가 아니면
		// 잘못 입력
		
		System.out.print("출력할 단 입력 : ");
		
		int num = sc.nextInt();
		
		if(num < 2 || num >9) {
			System.out.println("잘못 입력");
			return;
		}
		
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d X %d = %d\n", num, i, num*i);
		}
		
	}
	
	public void ex7() {
				
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d X %d = %d\t", i, j, i*j);
			}
			System.out.println("");
		}
		
		System.out.println("----------------------------------역순 출력------------------------------------");
		
		for(int i = 9; i>=2; i--) {
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d X %d = %d\t", i, j, i*j);
			}
			System.out.println("");
		}

	}
	
	public void ex8() {
		
		// 숫자 세기 count
		
		// 1부터 20 까지 1씩 증가하며
		// 입력받은 수의 배수의 총 개수 출력
		// 입력받은 수의 배수의 합계 출력
		
		// 배수 입력 : 3
		// 3 6 9 12 15 18 : 6개
		// 3의 배수 합계 : 63
		System.out.print("배수 입력 : ");
		int num = sc.nextInt();
		
		int count = 0;
		int sum = 0;
		
		for(int i = 1; i<=20; i++) {
			if(i%num == 0) {
				System.out.print(i + " ");
				count++;
				sum += i;
			}
		}
		System.out.println(": " + count + "개");
		System.out.println(num + "의 배수의 합계 : " + sum);
		
	}
	
}
















