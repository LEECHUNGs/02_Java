package com.hw2.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;
import com.hw2.model.service.Company;
import com.hw2.model.service.ManagementSystem;
import com.hw2.model.service.Prison;

public class Run {
	
	public static void main(String[] args) {
		
		ManagementSystem company = new Company(10);
		ManagementSystem prison = new Prison(10);
		
		// 2명 직원 생성
		Person emp1 = new Employee("EMP001", "유재석", "기획팀");
		Person emp2 = new Employee("EMP002", "정형돈", "개발팀");
		
		// 직원2명 회사 입사
		company.addPerson(emp1);
		company.addPerson(emp2);
		
		// 등록된 전체 직원 조회
		company.displayPersons();
		
		System.out.println("=======================================================================");
		
		// 2명의 수감자 생성
		Person prisoner1 = new Prisoner("1205", "정준하", "밥도둑");
		Person prisoner2 = new Prisoner("0705", "박명수", "웃음연쇄살인");
		
		// 수감자2명 감옥 수감
		prison.addPerson(prisoner1);
		prison.addPerson(prisoner2);
		
		// 등록된 전체 수감자 조회
		prison.displayPersons();
		
		System.out.println("=======================================================================");
		
		company.removePerson("EMP001");
		prison.removePerson("1205");
		
		System.out.println("=======================================================================");

		company.displayPersons();
		prison.displayPersons();
	}
}
