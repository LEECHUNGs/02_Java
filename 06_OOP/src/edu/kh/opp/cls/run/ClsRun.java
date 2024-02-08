package edu.kh.opp.cls.run;

import edu.kh.opp.cls.model.service.ClsServive;

public class ClsRun {
	public static void main(String[] args) {
		ClsServive servive = new ClsServive();
		// 매개변수 없는 생성자 -> 기본생성자라 함
		// ClsSercvice의 기본생성자가 작성되있지 안지만
		// 문제는 없다
		// 왜?
		// 컴파일러가 코드를 번역 시
		// 매개변수 있는 생성자가 없으면
		// 자동으로 매개변수 없는 생성자를 만들기 때문
		
		
		//servive.ex1();
		//servive.ex2();
		//servive.ex3();
		servive.ex4();
	}
}
