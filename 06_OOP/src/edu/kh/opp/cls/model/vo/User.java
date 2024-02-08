package edu.kh.opp.cls.model.vo;

public class User {
	
	// 속성 (== 필드 ) 
	// 아이디, 비밀번호, 이름, 나이, 성별 (추상화 진행)
	// 데이터 직접접근 불가원칙 -> 필드는 기본적으로 모두 private(캡슈화 진행)
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private String userGender;
	
	
	// 기능 (== 생성자 + 매서드 )
	
	// 생성자 : new 연산자를 통해 객체 생성 시
	// 			생성된 객체의 필드값 초기화 + 기능 수행 역할
	
	// 기본생성자
	public User() {
		// 기능
		System.out.println("기본생성자로 User 객체 생성");
		
		// 필드 초기화
		userId = "user01";
		userPw = "pass01";
		userName = "user01";
		userAge = 20;
		userGender = "남";
	}
	
	// 매개변수 생성자
	// ** 사용되는 기술 ,변수 : 매개변수, OverLoading (오버로딩), this
	
	// ** 매개변수 : 생성자나 메서드 호출 시 () 안에 작성되어
	//				 전달되어지는 값을 저장하고 있는 변수
	// -> 전달 받은 값을 저장가고 있는 매개체 역할의 변수
	public User(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
		// 필드 = 매개변수
		
		// this 참조변수
		// - 객체가 자기 자신을 참조할 수 있도록 하는 변수
		// - 모든 객체 내부에 숨겨져 있음
	}
	
	// 필드를 전부 초기화 하는 목적의 매개변수 생성자
	public User(String userId, String userPw, String userName,
				int userAge, String userGender) {
		
		// this() 생성자
		// 같은 클래스의 다른 생성자를 호출할 때 사용
		// 생성자 내에서 반드시 첫쨰 줄에 작성해야 함!!!
		// 위에 다른 코드 쓰면 에러
		// 왜 쓰나?
		// 중복코드 제거, 코드길이 감소, 재사용성 증가...
		// 가독성이 떨어지는 단점 존재
		
		this(userId, userPw);
		//this.userId = userId;
		//this.userPw = userPw;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
		
	}
	
	// 자바는 기본적으로 필드명, 생성자명, 메서드며으 변수명의
	// 중복을 허용하지 않음
	
	// *** 오버로딩 (OverLoadiing) ***
	// - 클래스 내에 동일한 이름의 메서드(생성자도 포함)를
	// 여러개 작성하는 기법
	
	// -> 하나의 이름으로 여러 기능을 수행 할 수 있게 하는 것
	
	// [오버로딩 조건]
	
	// 1) 메서드 이름 동일
	// 2) 매개변수의 개수, 이름, 타입, 순서중 1개라도 다를 것
	
	// public User() {} // 기본 생성자가 이미 존재해 중복상태
	public User(String userId) {} // 매개변수의 개수가 같은 생성자 없음
									// 오버로딩 성립
	
	public User(int userAge) {} // 매개변수 개수는 같으나 타입이 다름
									// 오버로딩 성립
	
	public User(String userId, int userAge) {} 
	// 매개변수 개수는 동일한것이 있으나 하나의 타입이 다름 -> 오버로딩 가능
	
	public User(int userAge, String userId) {}
	// 매개변수의 개수, 타입이 같으나 순서가 다름 -> 오버로딩 가능
	
	//public User(int userAge, String userName) {} 
	// 매개변수의 개수, 타입, 순서가 모두 같아 오버로딩 불가
	// -> 오버로딩은 변수명은 신경쓰지 않는다
	
	

	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserPw() {
		return userPw;
	}


	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getUserAge() {
		return userAge;
	}


	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}


	public String getUserGender() {
		return userGender;
	}


	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	
	
	
}
