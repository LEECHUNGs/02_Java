package edu.kh.oop.abstraction.mode.vo;
// MVC 패턴(Model Vie Controller)
// Model : 프로그램, 어플리케이션의 데이터, 비즈니스로직 담당
// View : 사용자에게 데이터를 시각적으로 표현하는 부분 담당
// Controller : model, view 간의 상호작용을 조정, 제어하는 역할의 담당
// - 사용자의 입력 처리하고 대응하는 작업 담당


// VO(Value Object) : 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지
public class People { // 국민(사람) 클래스
	
	// 클래스란? 객체의 특성(속성, 기능)을 정의한 것
	// 객체를 만들기 위한 설계도
	
	// 속성 == 값 == data
	// 값을 저장하기 위한 변수 선언
	// -> 국민이라면 공통적으로 가지고 있는 속성만 작성(추상화)
	// 이름, 성별, 주민번호, 주소, 전화번호, 나이
	
	// 필드 == 필드변수 == 멤버변수 == 클래스 변수
	
	// 캡슐화
	// - 데이터와 기능을 하나로 묶어서 관리하는 기법
	// - 데이터에 직접적인 접근을 제한하는 것이 원칙이다.
	// -> 직접 접근을 못하기에
	// 		클래스 내부에 간접 접근을 제공하는 기능을 작성해둠
	// 		-> getter/setter
	
	// ** 데이터 직접 접근 제한**
	// public (공공의) -> private (사적인, 개인적인) 변경
	private String name;
	private char gender;
	private String pNo; // "111111-1111111"
	private String adress;
	private String phone; // 010-1111-1111""
	private int age;
	// public doub bitCoin; -> 공통점이 아니므로 제거
	
	// public 		int 	age;
	// [접근제한자] 자료형	변수명
	
	
	// 기능 == 행동 == method(메서드)
	// void : 반환할 값이 없다(반환형이 없다)
	// <-> 반환할 값이 있으면 그 값으 자료형을 작성 (반환형)
	
	
	public void tax() {
		System.out.println("세금을 냅니다....");
	}
	
	public void vote() {
		System.out.println("투표를 합니다.....");
	}
	
	// name 변수의 값을 돌려 보내주는 간접 접근 기능
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// 캡슐화에서 사용할 간접 접근 기능(getter/setter)
	
	// alt + shift + s 또는 상단메뉴 Source
	// -> Generate Getters and Setters ... 클릭
	// -> selectAll -> generate
	
	
	
	
}















