package edu.kh.op.ex;

public class ExampleRun { // 코드 실행용 클래스
	
	// 메인 메서드 필수 작성
	public static void main(String[] args) {
		
		// OpExample 생성 -> OpExample 이라는 클래스를 이용해서 객체를 생성하는데,
		// 그 객체 이름이 ex 이다
		OpExample ex = new OpExample();
		// 같은 패키지 안에 있는 클래스는 import 하지 않아도 불러다 쓸 수 있음
		ex.ex1();
		ex.ex2();
		ex.ex3();
		ex.ex4();
	}
}
