package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		String text;
		if(input <= 0) {
			text = "양수만 입력해주세요.";
		}
		else if(input % 2 == 1) {
			text = "홀수 입니다.";
		}
		else {
			text = "짝수 입니다.";
		}
		
		System.out.println(text);
	}
	
	public void practice2() {
		
		System.out.print("국어 점수 : ");
		int a = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int b = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int c = sc.nextInt();
		
		String text = "";
		if(a >= 40 && b >= 40 && c >= 40) {
			if((a+b+c)/3 >= 60) {
				text = "축하합니다, 합격입니다.";
			}
			else {
				text = "불합격입니다.";
			}
		}
		else {
			text = "불합격입니다.";
		}
		System.out.printf("평균 : %.1f\n", (double)(a+b+c)/3);
		System.out.println(text);
	}
	
	public void practice3() {
		
		System.out.print("1~12 사이 정수 입력 : "); 
		int input = sc.nextInt();
		
		String text = "";
		switch(input) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				text = "31";
				break;
			case 2:
			case 4:
			case 6:
			case 9:
			case 11:
				text = "30";
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				return;
		}
		
		System.out.println(input + "월은 " + text + "일까지 있습니다.");
		
	}
	
	public void practice4() {
		
		System.out.print("키를 입력하세요 : ");
		double input1 = sc.nextDouble();
		
		System.out.print("몸무게를 입력하세요 : ");
		double input2 = sc.nextDouble();
		
		double bmi = input2 / (input1 * input1 * 0.0001);
		
		System.out.println("BMI 지수 : " + bmi);
		
		String text = "";
		if(bmi < 18.5) text = "저제중";
		else if(bmi < 23) text = "정상체중";
		else if(bmi < 25) text = "과체중";
		else if(bmi < 30) text = "비만";
		else text = "고도비만";
				
		System.out.println(text);
	}
	
	public void practice5() {
		
		System.out.print("중간고사 : ");
		double input1 = sc.nextDouble();
		
		System.out.print("기말고사 : ");
		double input2 = sc.nextDouble();
		
		System.out.print("과제점수 : ");
		double input3 = sc.nextDouble();
		
		System.out.print("출석횟수 : ");
		double input4 = sc.nextDouble();
		
		
		double result = 
				input1 * 0.2 + input2 * 0.3 
				+ input3 * 0.3 + (100 * input4 / 20) * 0.2;
		
		System.out.println("=============결과=============");

		if(input4/20 < 0.7) {
			System.out.printf("Fail [출석 횟수 부족 (%d/20)]", (int)input4);
			return;
		}
		
		System.out.printf("중간 고사 점수(20) : %.1f\n", input1 * 0.2);
		System.out.printf("기말 고사 점수(30) : %.1f\n", input2 * 0.3);
		System.out.printf("과제 점수\t(30) : %.1f\n", input3 * 0.3);
		System.out.printf("출석 점수\t(20) : %.1f\n", (100 * input4 / 20) * 0.2);
		System.out.printf("총점 : %.1f\n", result);
		
		
		if(result < 70) 
			System.out.println("Fail [점수 미달]");
		
		else
			System.out.println("Pass" + result);
	}
}















