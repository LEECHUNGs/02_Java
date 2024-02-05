package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {

	/* while 문
	 * 
	 * - 별도의 초기식, 증감식이 존재하지 않고
	 * 반복 종료 조건을 자유롭게 설정하는 반복문
	 * 
	 * * 확실히 언제 반복이 끝날지 모르나
	 * 	 언젠가 반복 조건이 False가 되는 경우 반복 종료
	 * 
	 * [작성법]
	 * while(조건문) {
	 * 		조건식이 true 일때 반복 수행할 구문
	 * }
	 * */
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		int input = 9;
		
		while(input != 0) {
			System.out.println("----메뉴선택----");
			System.out.println("1. 떡볶이");
			System.out.println("2. 쫄면");
			System.out.println("3. 김밥");
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 >>");
			input = sc.nextInt();
			
			switch(input) {
				case 1:System.out.println("떡볶이를 주문했습니다.");break;
				case 2:System.out.println("쫄면를 주문했습니다.");break;
				case 3:System.out.println("김밥를 주문했습니다.");break;
				case 0:System.out.println("메뉴선택을 종료합니다..");break;
				default:System.out.println("잘못 입력하셨어요~");break;
			}
			
		}
	}
	
	public void ex2() {
		// 입력되는 모든 정수의 합
		// 단, 0이 입력시 반복 종료후 결과 출력
		
		int input = 1;
		int sum = 0;
		do {
			input = sc.nextInt();
			sum += input;
			
		} while(input != 0);
		
		System.out.println("합계 : " + sum);
	}
}
