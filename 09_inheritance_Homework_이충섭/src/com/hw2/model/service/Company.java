package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem{
	
	private Employee[] employees;
	private int employeeCount;
	
	public Company() {}
	
	public Company(int size) {
		
		employees = new Employee[size];
		employeeCount = 0;
	}

	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		
		if(person instanceof Employee) {
			if(employeeCount < employees.length) {
				
				employees[employeeCount++] = (Employee)person;
				System.out.println("직원이 추가되었습니다 - " + employees[employeeCount-1].getInfo());
			}
			else {
				
				System.out.println("인원이 모두 충원되었습니다.");
			}
		}
	}

	@Override
	public void removePerson(String id) {
		// TODO Auto-generated method stub
		
		int index = -1;
		for(int i = 0; i<employeeCount; i++) {
			
			if(id.equals(employees[i].getId())) {
				
				index = i;
				break;
			}
		}
		
		
		if(index == -1) {
			
			System.out.println("해당 id를 가진 직원을 찾을 수 없습니다.");
		}
		
		else {
			
			System.out.print("직원이 삭제되었습니다 - ");
			System.out.println(employees[index].getInfo());
			
			employees[index] = null;
			for(int i = index; i<employeeCount-1; i++) {
				employees[i] = employees[i+1];
			}
			
			employeeCount--;
		}
	}

	@Override
	public void displayPersons() {
		// TODO Auto-generated method stub
		
		System.out.println("전체 직원 명단 : ");
		for(int i = 0; i<employeeCount; i++) {
			
			System.out.println(employees[i].getInfo());
		}
	}
	
}
