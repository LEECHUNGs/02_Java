package edu.kh.control.branch;

import java.util.Scanner;

import javax.swing.SwingConstants;

public class BranchExample {
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		// 1부터 10까지 1씩 증가하며 출력하는 반복문 작성
		// 단, 5를 출력하면 반복문 종료
		// 1, 2, 3, 4, 5
		
		for(int i = 1; i<=10; i++) {
			System.out.print(i + " ");
			if(i==5) break;
		}
		
	}
	
	public void ex2() {
		
		// 입력받는 모든 문자열 누적
		// 단, "exit@" 입력 시 문자열 누적을 종료하고 결과 출력
		
		String str = "";
		
		while(true) {
			
			System.out.print("문자열 입력(exit@ 입력 시 종료) : ");
			String input = sc.nextLine();
			
			// next() : 다음 한 단어 (띄어쓰기 포함 X)
			// nextLine() : 다음 한 단어 (띄어쓰기 포함 X)
		
			if(input.equals("exit@")) {
				// String 자료형은 비교연산자(==)로 같은 문자인지 판별 불가
				// 비교연산자(==)는 보통 기본자료형끼리의 연산에서만 사용 가능
				// -> String 은 기본자료형이 아닌 참조형
				
				// ** 해결 : 문자열1.equals(문자열2) 로 비교 가능
				
				break;
			}
			
			str += input;
		}
		
		System.out.println(str);
	}

	public void ex3() {
		// continue : 다음 반복으로 넘어감
		
		// 1~10까지 1씩 증가해 출력
		// 단, 3의 배수는 제외
		
		for(int i = 1; i<=10; i++) {
			if(i%3 == 0) continue;
			
			System.out.print(i + " ");
		}
	}

	public void ex4() {
		// 1~100 까지 1씩 증가하며 출력하는 반복문
		// 단, 5의 배수는 건너뛰고
		// 증가하는 값이 40이 되었을 때 반복을 정지
		
		for(int i = 1; i<=100; i++) {
			if(i == 40) break;
			if(i%5 == 0) continue;
			
			System.out.print(i + " ");
		}
	}
	
	public void RSPGame() {
		
		// 가위바위보 게임을 할건데
		// 몇판할지 입력받음
		// 입력받은 판수만큼 반복
		// 컴퓨터 : Math.random() : 0~1미만 난수 생성
		// 1) 1~3 사이 난수 생성
		// 2) 1이면 가위, 2이면 바위, 3이면 보 지정 (switch)
		// 컴퓨터와 플레이어 가위바위보 판별
		// 플레이어 승! // 졌습니다ㅠㅠ
		// 매 판마다 - 현재 기록 : 2승 1무 0패
		
		System.out.println("[가위 바위 보 게임]");
		System.out.print("몇 판? : ");
		int num = sc.nextInt();
		int num2 = -1;
		int ran = 0;
		String str = null; // null : 아무것도 참조하고 있지 않음
		
		int win = 0;
		int draw = 0;
		int def = 0;
		
		String bot = "";
		
		for(int i = 0; i<num; i++) {
			ran = (int)(Math.random() * 3); // 0: 가위, 1: 바위, 2: 보
			System.out.print("무엇을 낼까? (가위/바위/보) : ");
			str = sc.next();
			
			switch(str) {
				case "가위": num2 = 0;break;
				case "바위": num2 = 1;break;
				case "보": num2 = 2;break;
				default: 
					System.out.println("잘못된 입력 입니다.");
					continue;
			}
			
			switch(ran) {
				case 0: bot = "가위";break;
				case 1: bot = "바위";break;
				case 2: bot = "보";break;
			}
			
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", bot);
			
			
			switch(ran - num2) {
				case 0:
					System.out.println("비겼습니다!!");
					draw++;
					break;
				case -1:
				case 2:
					System.out.println("이겼습니다 !!!!!!!");
					win++;
					break;
				default:
					System.out.println("졌습니다 ㅠㅠㅠㅠ");
					def++;
					break;
			}
			
			System.out.printf("현재 기록 : %d승 %d무 %d패", win, draw, def);
		}
		
		
	}
}

















