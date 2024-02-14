package com.hw.run;

import com.hw.model.vo.Employee;

public class Run {
	
	public static void main(String[] args) {
		
		Employee employ[] = new Employee[3];
		
		employ[0] = new Employee();
		employ[1] = new Employee(1, "홍길동", 19, 'M',"01022223333", "서울 잠실");
		employ[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		for(int i = 0; i<employ.length; i++) {
			
			System.out.println("emp[" + i + "] : " + employ[i].infomation());
		}
		
		System.out.println("==============================================================================");
		
		
		employ[0].setEmpNo(0);
		employ[0].setEmpName("김말똥");
		employ[0].setDept("영업부");
		employ[0].setJob("팀장");
		employ[0].setAge(30);
		employ[0].setGender('M');
		employ[0].setSalary(3000000);
		employ[0].setBonusPoint(0.2);
		employ[0].setPhone("01055559999");
		employ[0].setAdress("전라도 광주");
		
		employ[1].setDept("기획부");
		employ[1].setJob("부장");
		employ[1].setSalary(4000000);
		employ[1].setBonusPoint(0.3);
		
		System.out.println("emp[" + 0 + "] : " + employ[0].infomation());
		System.out.println("emp[" + 1 + "] : " + employ[1].infomation());
		
		
		System.out.println("==============================================================================");
		
		int sum = 0;
		for(int i = 0; i<employ.length; i++) {
			System.out.printf("%s의 연봉 : %d원\n", employ[i].getEmpName(), 
					(int)(employ[i].getSalary() * 12 * (1 + employ[i].getBonusPoint())));
	
			sum += employ[i].getSalary() * 12 * (1 + employ[i].getBonusPoint());
		}
		
		System.out.println("==============================================================================");
		System.out.print("직원들의 연봉의 평균 : " + sum / employ.length + "원");
	}
}
