package edu.kh.oop.abstraction.mode.service;

import java.util.Arrays;

import edu.kh.oop.abstraction.mode.vo.People;

// Service : 특정 기능(비즈니스 로직)을 제공하는 클래스
public class AbstractionService {
	
	// ctrl + shift + o : 해당 클래스에서 import 안된것 모두 import
	public void ex1() {
		// 국민 객체 만들기
		People p1 = new People();
		// People p1 : People 객체에 주소를 저장하여 참조하는 변수 p1
		// new People() : 새로운 People객체를 Heap 영역에 생성
		
		// int num = 10;
		
		// ** 클래스 이름이 자료형 처럼 사용된다
		// == 그래서 클래스를 "사용자 정의 자료형" 이라고도 한다!!
		/*
		p1.name = "홍길동";
		p1.gender = '남';
		p1.pNo = "111111-1111111";
		p1.address = "서울시 중구 남대문로 120 그레이츠청계 3층 E강의장";
		p1.phone = "010-1111-1111";
		p1.age = 20;
		
		
		System.out.println("p1의 name : " + p1.name);
		System.out.println("p1의 gender : " + p1.gender);
		System.out.println("p1의 pNo : " + p1.pNo);
		System.out.println("p1의 adress : " + p1.address);
		System.out.println("p1의 phone : " + p1.phone);
		System.out.println("p1의 age : " + p1.age);
		*/
		
		p1.setName("홍길동");
		p1.setGender('남');
		p1.setpNo("111111-1111111");
		p1.setAdress("서울시 중구 남대문로 120 그레이츠청계 3층 E강의장");
		p1.setPhone("010-1111-1111");
		p1.setAge(20);
		
		System.out.println(p1.getName());
		System.out.println(p1.getGender());
		System.out.println(p1.getpNo());
		System.out.println(p1.getAdress());
		System.out.println(p1.getPhone());
		System.out.println(p1.getAge());
		
		// 본인 객체 만들기
		
		People me = new People();
		
		me.setName("이충섭");
		me.setGender('남');
		me.setpNo("980903-10xxxxx");
		me.setAdress("서울특별시 서대문구");
		me.setPhone("010-8822-0457");
		me.setAge(26);
		
		System.out.println();
		
		System.out.println("이름 : " + me.getName());
		System.out.println("성별 : " + me.getGender());
		System.out.println("주민번호 : " + me.getpNo());
		System.out.println("주소 : " + me.getAdress());
		System.out.println("전화번호 : " + me.getPhone());
		System.out.println("나이: " + me.getAge());
		
		me.tax();
		me.vote();
		
		
		
		
		
		
		
	}
}
