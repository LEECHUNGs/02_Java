package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{
	
	private Prisoner[] prisoners;
	private int prisonerCount;
	
	public Prison() {}
	public Prison(int size) {
		prisoners = new Prisoner[size];
		prisonerCount = 0;
	}
	
	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		if(person instanceof Prisoner) {
			if(prisonerCount < prisoners.length) {
				
				prisoners[prisonerCount++] = (Prisoner)person;
				System.out.println("수감자가 추가되었습니다 - " + prisoners[prisonerCount-1].getInfo());
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
		for(int i = 0; i<prisonerCount; i++) {
			
			if(id.equals(prisoners[i].getId())) {
				
				index = i;
				break;
			}
		}
		
		
		if(index == -1) {
			
			System.out.println("해당 id를 가진 수감자를 찾을 수 없습니다.");
		}
		
		else {
			
			System.out.print("수감자가 삭제되었습니다 - ");
			System.out.println(prisoners[index].getInfo());
			
			prisoners[index] = null;
			for(int i = index; i<prisonerCount-1; i++) {
				prisoners[i] = prisoners[i+1];
			}
			
			prisonerCount--;
		}
	}

	@Override
	public void displayPersons() {
		// TODO Auto-generated method stub
		
		System.out.println("전체 수감자 명단 : ");
		for(int i = 0; i<prisonerCount; i++) {
			
			System.out.println(prisoners[i].getInfo());
		}
	}

}
