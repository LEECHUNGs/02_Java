package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	
	/* 배열(Array)
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	 * - 묶여진 변수들은 배열명으로 불러지고
	 * 	 구분은 index를 이용함 (index는 0부터 시작하는 정수값)
	 * 
	 * */
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		// 변수 vs 배열
		
		// 변수 선언 
		int num;
		// stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 할당하고
		// 그 공간에 num 이라는 이름을 부여
		
		// 변수 대입
		num = 10;
		
		// 변수 사용
		System.out.println("num에 저장된 값 : " + num);
		// num이 작성된 자리에 num에 저장된 값을 읽어와서 출력
		
		// ------------------------------------
		
		// 배열 선언
		int[] arr; // int arr2[];
		// Stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr 이라는 이름을 부여
		// ** 해당 변수는 참조형을 주소값만을 저장할 수 있다.
		
		arr = new int[3];
		
		// new : "new 연산자" 라고 하며
		// 		 Heap 메모리 영역에 새로운 공간 (배열, 객체)을 할당
		
		// int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
		
		// new int[3] : heap 영역에 int 3칸 짜리 int[] 을 생성(할당)
		//				생성된 int[] 에는 시작 주소가 저장됨!!
		
		// arr = new int[3]
		//(int[])	(int[])		-> 같은 자료형 == 연산 가능
		
		// heap 영역에 생성된 int[]의 시작주소를
		// stack 영역에 생성된 arr 변수에 대임
		
		// -> arr 변수가 int[]을 참조하게 됨
		// 		그래서 arr을 참조형 이라 함 
		
		// 배열의 요소 값 대입
		// arr은 int[] 참조형 변수 이지만
		// arr[0], arr[1], arr[2] 는 int 자료형 변수이기에 정수 대입 가능!
		
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 1000;
		
		// 배열의 요소 값 읽어오기
		System.out.println("arr의 주소값 : "+ arr); 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

	public void ex2() {
		
		// 배열 선언 및 할당
		int[] arr = new int[4];
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 500;
		arr[3] = 1000;
		
		// 배열의 길이 (몇 칸 인가) : 배열명.length
		System.out.println("배열의 길이 : " + arr.length);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void ex3() {
		// 5명의 키(cm)를 입력받고 평균 구하기
		
		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 165.7
		// 3번 키 입력 : 184.3
		// 4번 키 입력 : 190.2
		// 5번 키 입력 : 174.4
		
		double[] height = new double[5];
		
		for(int i = 0; i<height.length; i++) {
			System.out.print((i+1) + "번 키 입력 : ");
			height[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		double sum = 0;
		
		for(int i = 0; i<height.length; i++) {
			sum += height[i]; // 배열에 저장된 값을 sum에 누적
		}
		
		System.out.printf("\n 평균 : %.2f", sum / height.length);
		
	}

	public void ex4() {
		// 입력받은 인원 수 만큼의 정수를 입려받아 배열에 저장
		// 입력 완료시 점수 합계, 평균, 최고점, 최저점 출력
		
		// ex)
		// 입력받을 인원 수 : 4
		// 1번 점수 입력 : 100
		// 2번점수 입력 : 80
		// 3번점수 입력 : 50
		// 4번점수 입력 : 60
		
		// 합계 : 290
		// 평균 : 72.5
		// 최고점 : 100
		// 최저점 : 50
		
		System.out.print("입력 받을 인원 수 : ");
		int num = sc.nextInt();
		
		int[] score = new int[num];
		
		int sum = 0;
		
		int min = 101;
		int max = -1;
		
		for(int i = 0; i<score.length; i++) {
			System.out.print((i+1) + "번 점수 입력 : ");
			score[i] = sc.nextInt();
			sum += score[i];
			
			if(min > score[i]) min = score[i];
			if(max < score[i]) max = score[i];
		}
		
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum/score.length);
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);
		
	}
	
	public void ex5() {
		// 배열 선언과 동시에 초기화
		
		char[] arr = new char[5];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (char)('A' + i);
		}
		
		// ** Arrays 클래스
		// -> Java 에서 제공하는 배열과 관련된 기능을 모아둔 클래스
		
		// Arrays.toString(배열명) : 모든 요소 값 출력
		
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = new int[4];
		System.out.println(Arrays.toString(arr2)); // [0,0,0,0]
		// int형 배열 4칸짜리 생성 후 각 인텍스에 값을 대입하지 않았으므로
		// jvm에 의해 int형 기본값인 0으로 초기화 되어있음
		
		boolean[] arr3 = new boolean[4];
		System.out.println(Arrays.toString(arr3)); // [0,0,0,0]
		
		String[] arr4 = new String[4];
		System.out.println(Arrays.toString(arr4)); // [0,0,0,0]
		
		
		// 배열 선언과 동시에 (할당 및) 초기화
		char[] arr5 = {'A','B','C','D','E'};
		// {} (중괄호) 는 배열의 리터럴 표기법 이다
		
		System.out.println(Arrays.toString(arr5));
	}

	public void ex6() {
		// 점심메뉴 뽑기 프로그램
		
		String[] arr = {"김밥", "서브웨이", "햄버거", "백반", "국밥", "파스타" };
		
		System.out.println("오늘 점심 메뉴 : " + arr[(int)(Math.random()*6)]);
		
	}

	public void ex7() {
		// 배열을 이용한 검색
		
		// 입력받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇번 인덱스에 존재하는지 출력
		// int[] arr = {100,200,300,400,500,600,700,800,900,1000};
		
		// ex)
		// 정수 입력 : 200
		// 1번째 인덱스에 조재
		
		// 정수 입력 : 5
		// 존재하지 않음
		
		int[] arr = {100,200,300,400,500,600,700,800,900,1000};
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int index = -1;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == input) index = i;
		}
		
		if(index == -1) {
			System.out.println("존재하지 않음");
		}
		else {
			System.out.println(index + "번째 인덱스에 존재");
		}
	}

	public void ex8() {
		// 입력받은 값과 일치하는 값이 있으면 인덱스 번호 출력
		// 없으면 존재하지 않음 출력
		
		String[] arr = {"사과","딸기","바나나","키위","멜론","아보카도"};
		
		System.out.print("과일 입력 : ");
		String fruit = sc.next();
		
		int index = -1;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].equals(fruit)) index = i;
		}
		
		if(index == -1) System.out.println("존재하지 않음");
		else System.out.println(index + "번 인덱스에 존재");
		
	}

	public void ex9() {
		// 1. 문자열을 입력받아 한 글자씩 잘라내어 char 배열에 순서대로 저장
		// 2. 문자 하나를 입력받아 일치하는 문자가 char 배열에 몇 개 존재하는지 확인
		// 2. 단, 일치하는 문자 없을경우 존재하지 않습니다. 출력
		
		/* [사용해야할 기술, 기능]
		 * 1) 배열 검색
		 * 2) String.length() : 문자열의 길이
		 * 		ex) "hello".length() -> 5
		 * 		 
		 * 3) String.charAt(index) : 문자열에서 특정 index에 위치한 문자 하나를 얻어옴
		 * 		ex) "Hello".charAt(1) -> 'e'
		 * */
		
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		char[] strChar = new char[str.length()];
		for(int i = 0; i<str.length(); i++) {
			strChar[i] = str.charAt(i);
		}
		
		System.out.println(Arrays.toString(strChar));
		
		System.out.print("탐색할 문자 : ");
		char input = sc.next().charAt(0);
		
		int count = 0;
		for(int i = 0; i<strChar.length; i++) {
			if(strChar[i] == input){
				count++;
			}
		}
		
		if(count == 0) System.out.println("존재하지 않습니다.");
		else System.out.println("'" + input + "' 은 " + count + "개 존재합니다.");
	}
}




















