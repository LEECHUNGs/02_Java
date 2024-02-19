package edu.kh.exception.test;

public class ExceptionTest {
	
	public static void main(String[] args) {

		// 컴파일 에러 => 개발자가 코드를 잘못쓴 것
		// 자료형이 맞지 않아 연산 불가하여 컴파일 에러 발생
		// int a = 99.9; // Type mismatch: cannot convert from double to int
		int a = (int) 99.9; // 코드 수정으로 해결
		
		// 런타임 에러 => 프로그램 수행 중에 발생하는 에러
		// 				주로 if문으로 처리 가능
		
		int[] arr = new int[3]; // 길이 : 3, 인덱스 : 0, 1, 2
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		//arr[3] = 40;
		
		if(3>=arr.length) {
			System.out.println("배열 범위 초과");
		}
		else {
			arr[3] = 40;
			arr[4] = 50;
		}
		
	}
}
