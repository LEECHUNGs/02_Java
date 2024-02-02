package edu.kh.variable.ex2;

public class PrintExample {
	
	// main 작성 ctrl + space + enter
	public static void main(String[] args) {
		
		// System.out.print(); : 단순 출력 (줄바꿈X)
		// System.out.println(); 한줄 출력 (줄바꿈O)
		// 줄바꿈이라는 차이점은 잇지만 괄호안의 내용이 그대로 출력된다는 것은 같음
		
		// System.out.println; 자동완성 syso ctrl + space
		System.out.println("테스트 1");
		System.out.println("테스트 2");
		
		System.out.print("테스트 3");
		
		System.out.println(); // 내용없은 println() :  단순 줄바꿈
		
		System.out.print("테스트 4");
		
		// 테스트3
		// 테스트4
		
		// System.out.printf(); : 출력될 문자열 형식을 패턴으로 지정하는 출력구문
		
		System.out.println(); // 위에 print 구문을 썼으니 줄바꿈
		
		int iNum1 = 10;
		int iNum2 = 5;
		
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		// 중간 오타 ...
		
		/* printf 사용 패턴
		 * 
		 * %d : 정수형, %o : 8진수, %x : 16진수
		 * %c : 문자, %s : 문자열
		 * %f : 실수(소수점자리 6자리), %e : 지수형태표현, %g : 대입 값 그대로
		 * %A : 16진수 실수
		 * %b : 논리형
		 * 
		 * 
		 * */
		
		// System.out.print("패턴", 패턴에 들어갈 값);
		
		System.out.printf("%d + %d = %d", iNum1, iNum2, iNum1 + iNum2);
		System.out.println();
		
		
		// 10 + 10 * 5 / 2 = 35
		System.out.printf("%d + %d * %d / 2 = %d\n", iNum1, iNum1, iNum2, (iNum1 + iNum1 * iNum2 / 2));
		
		int iNum3 = 3;
		
		System.out.printf("%d\n", iNum3); // 3
		System.out.printf("%5d\n", iNum3); // 5칸 확보 후 오른쪽 정렬
		System.out.printf("%-5d\n", iNum3); // 5칸 확보 후 오른쪽 정렬
		
		// 소수점 자리 제어 (반올림)
		
		System.out.printf("%f\n", 10 / 4.0); // 2.50000
		System.out.printf("%.2f\n", 10 / 4.0); // 소수점 둘째자리까지
		System.out.printf("%.0f\n", 10 / 4.0); // 소수점 아래를 표현 x
		
		// 문자, 문자열, boolean
		boolean isTrue = false;
		char ch = '조';
		String str = "안녕하세요";
		
		// false / 조 / 안녕하세요
		System.out.printf("%b / %c / %s\n", isTrue, ch, str);
		
		// escape(이스케이프 == 탈출)문자 : 일반 문자가 아닌 특수문자 표현
		// 		\
		System.out.println("\\"); // 백슬래시(역슬래시) 출력방법
		
		//	\0/
		System.out.println("\\o/");
		
		System.out.println("a\tb\tc\td"); // tab 출력
		
		System.out.println("\u0041"); // A
		// 유니코드(16진수)
		// 65를 16진수로 표현
		// 65 / 16 = 몫 4, 나머지 1
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
