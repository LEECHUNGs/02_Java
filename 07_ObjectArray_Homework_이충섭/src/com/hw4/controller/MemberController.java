package com.hw4.controller;

import com.hw4.model.vo.Member;

public class MemberController {
	
	public final int SIZE = 10;
	
	private Member mem[] = new Member[SIZE];
	private int memberCount = 0;
	
	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.com");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		
		memberCount = 5;
	}
	
	public int getMemberCount() {
		
		 return memberCount;
	}
	
	public Member[] getMem() {
		
		return mem;
	}
	
	public Member checkId(String userId) {
		
		for(int i = 0; i<memberCount; i++) {
			
			if(userId.equals(mem[i].getUserId())) {
				return mem[i];
			}
		}
		
		return null;
	}
	
	public void insertMember(Member m) {
		
		mem[memberCount++] = m;
	}
	
	public Member searchMember(int menu, String search) {
		
		
		for(int i = 0; i<memberCount; i++) {
			switch(menu) {
			case 1: 
				if(search.equals(mem[i].getUserId()))
					return mem[i];
				break;
			case 2: 
				if(search.equals(mem[i].getName()))
					return mem[i];
				break;
			case 3: 
				if(search.equals(mem[i].getEmail()))
					return mem[i];
				break;
			}
		}
		
		return null;
	}
	
	public void updateMember(Member m, int menu, String update) {
		
		switch(menu) {
		case 1 :
			m.setUserPwd(update);
			break;
		case 2 :
			m.setName(update);
			break;
		case 3 :
			m.setEmail(update);
			break;
		}
	}
	
	public void deleteMember(String userId) {
		
		int index = 0;
		for(int i = 0; i<mem.length; i++) {
			if(userId.equals(mem[i].getUserId())) {
				mem[i] = null;
				index = i;
				break;
			}
		}
		
		for(int i = index; i<mem.length-1; i++) {
			mem[i] = mem[i+1];
		}
		
		memberCount--;
		
	}
	
	public Member[] sortIdAsc() {
		
		Member[] copy = mem.clone();
		Member temp = null;
		for(int i = 0; i<memberCount-1; i++) {
			for(int j = i+1; j<memberCount; j++) {
				if((copy[i].getUserId()).compareTo(copy[j].getUserId()) > 0) {
					temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		
		return copy;
	}
	
	public Member[] sortIdDesc() {
		
		Member[] copy = mem.clone();
		Member temp = null;
		for(int i = 0; i<memberCount-1; i++) {
			for(int j = i+1; j<memberCount; j++) {
				if((copy[i].getUserId()).compareTo(copy[j].getUserId()) < 0) {
					temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		
		return copy;
	}
	
	public Member[] sortAgeAsc() {
		
		Member[] copy = mem.clone();
		Member temp = null;
		for(int i = 0; i<memberCount-1; i++) {
			for(int j = i+1; j<memberCount; j++) {
				if(copy[i].getAge() > copy[j].getAge()) {
					temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		
		return copy;
	}
	
	public Member[] sortAgeDesc() {
		
		Member[] copy = mem.clone();
		Member temp = null;
		for(int i = 0; i<memberCount-1; i++) {
			for(int j = i+1; j<memberCount; j++) {
				if(copy[i].getAge() < copy[j].getAge()) {
					temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		
		return copy;
	}
	
	public Member[] sortGenderDesc() {
		
		Member[] copy = mem.clone();
		Member temp = null;
		for(int i = 0; i<memberCount-1; i++) {
			for(int j = i+1; j<memberCount; j++) {
				if(copy[i].getGender() < copy[j].getGender()) {
					temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		
		return copy;
	}
	
}
