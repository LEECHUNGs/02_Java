package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student std[] = new Student[3];
		std[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		std[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		std[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		for(int i = 0; i<std.length; i++) {
			System.out.println(std[i].information());
		}
		
		Employee emp[] = new Employee[10];
		
		int i = 0;
		while(i <= 10) {
			System.out.println("사원의 정보를 입력해주세요");
			
			System.out.print("이름 : ");
			String inputName = sc.next();
			
			System.out.print("나이 : ");
			int inputAge = sc.nextInt();
			
			System.out.print("신장 : ");
			double inputHeight = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double inputWeight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int inputSalary = sc.nextInt();
			
			System.out.print("부서 : ");
			String inputDept = sc.next();
			
			
			emp[i++] = new Employee(inputName, inputAge, inputHeight, 
								inputWeight, inputSalary, inputDept);
			
			System.out.print("계속 사원을 추가하시겠습니까? (y/n) : ");
			if(sc.next().charAt(0) == 'n') break;
			
		}
		
		for(int j = 0; emp[j] != null; j++) {
			System.out.println(emp[j].information());
		}
		
		StringBuffer bu = new StringBuffer("ayayeye");
		
		System.out.println(bu.indexOf("ye"));
		
		
		String a = "";
		System.out.println(a.indexOf("a"));
	}
}
