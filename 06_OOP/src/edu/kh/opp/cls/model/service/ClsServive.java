package edu.kh.opp.cls.model.service;

import edu.kh.opp.cls.model.vo.Student;
import edu.kh.opp.cls.model.vo.User;

public class ClsServive /*extends Student*/{
						// 부모 student를 상속 받음
	public void ex1() {
		
		// 클래스 접근제한자 확인하기
		Student std = new Student();
		// public class 인 Student는 import 가능
		
		// TestVO test = new TestVO(); 
		// (default)인 class는 TestVO는 import 불가(다른 패키지)
		
		System.out.println(std.v1);
		// 다름 패키지에서 접근 가능한 public을 제외하곤 모두 에러x
		
		//System.out.println(std.v2);
		//System.out.println(std.v3);
		//System.out.println(std.v4);
		
		// 상속 관계에서 직접 접근 가능 범위
		//System.out.println(v1); // public
		//System.out.println(v2); // protected
		//System.out.println(v3);
		//System.out.println(v4);
	}
	
	public void ex2() {
		// staitc 필드 확인 예제
		
		// 학생 객체 2개 생성
		Student std1 = new Student();
		Student std2 = new Student();
		
		// 학생 객체에 name 세팅
		std1.setName("홍길동");
		std1.setName("김영희");
		
		System.out.println(std1.schoolName);
		// scholName에 경고가 뜨는 이유는 => 제대로 작성되지 않았기 때문
		
		// *** static이 붙은 변수는 class명.변수명 으로 호출함
		System.out.println(Student.schoolName);
		
		Student.schoolName = "KH정보교육원";
		
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		
		/* static
		 * 
		 * 1) 공유 메모리 영역(또는 정적 메모리 영역) 이라고 함.
		 * 
		 * -> static 영역이 생성되고,
		 * 프로그램이 종료될 떄 까지 사라지지 않음(정적)
		 * 그리고, static 영역에 생성된 변수는 어디서든 공유 가능(공유)
		 * 
		 * 2) 사용법 : 클래스명.변수명(Student.schoolNmae)
		 * */
	}

	public void ex3() {
		// 생성자 확인 테스트
		
		// User 기본 생성자를 이용해 객체 생성
		User u1 = new User();
		
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		
		User u2 = new User();
		
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		// 문제점 : u1이 참조하고있는 User 객체와
		//			u2가 참조하고있는 User 객체의 필드값이 모두 동일
		// 			왜? 같은 기본 생성자로 user 객체를 생성했기 때문
		
		System.out.println("-----------------------------------");
		
		// 해결법 1 : setter를 이용해 새 값 대입
		
		u2.setUserAge(19);
		u2.setUserGender("여");
		u2.setUserId("pwzeze");
		u2.setUserName("김영희");
		u2.setUserPw("kim12");
		
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		// 해결법 2 : 매개변수 생성자를 이용해 객체가
		//			  생성 시 다른값으로 필드 초기화
		
		User u3 = new User("test3", "password333"); // 매개변수 생성자
						// 생성자 수행 시 전달할 값을 작성(순서 중요)
		
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
	}

	public void ex4() {
		
		// 매개변수 생성자 예제
		
		User u1 = new User(); // 기본 생성자
		User u2 = new User("user02", "pass02"); // 매개변수 2개 생성자
		User u3 = new User("user03", "pass03", "김길동", 20, "남"); // 매개변수 5개 생성자
		
		System.out.printf("u1 : %s / %s/ %s/ %d/ %s\n",
						u1.getUserId(), u1.getUserPw(), u1.getUserName(), 
						u1.getUserAge(), u1.getUserGender());
		
		System.out.printf("u1 : %s / %s/ %s/ %d/ %s\n",
				u2.getUserId(), u2.getUserPw(), u2.getUserName(), 
				u2.getUserAge(), u2.getUserGender());

		System.out.printf("u1 : %s / %s/ %s/ %d/ %s\n",
				u3.getUserId(), u3.getUserPw(), u3.getUserName(), 
				u3.getUserAge(), u3.getUserGender());
	}
}




















