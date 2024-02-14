package com.hw4.view;

import java.util.Scanner;

import com.hw4.controller.MemberController;
import com.hw4.model.vo.Member;

public class MemberMenu {
	
	private MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		int inputNum = 0;
		do {
			
			System.out.println("===== 회원 관리 메뉴 =====");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("수행할 작업 : ");
			inputNum = sc.nextInt();
			
			switch(inputNum) {
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deldteMember(); break;
			case 5 : printAIMember(); break;
			case 6 : sortMember(); break;
			case 0 : break;
			default : System.out.println("잘못된 입력입니다."); break;
			}
			
		} while (inputNum != 0);
		
	}
	
	public void insertMember() {
		// 1. 
		if(mc.getMemberCount() > mc.SIZE) {
			return;
		}
		
		// 2.
		System.out.print("아이디 : ");
		String inputId = sc.next();
		
		if(mc.checkId(inputId) != null) {
			
			System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
		}
		else {
			
			System.out.print("비밀번호 : ");
			String inputPw = sc.next();
			
			System.out.print("이름 : ");
			String inputName = sc.next();
			
			System.out.print("나이 : ");
			int inputAge = sc.nextInt();
			
			System.out.print("성별 : ");
			String inputGender = sc.next();
			
			System.out.print("이메일 : ");
			String inputEmail = sc.next();
			
			Member temp = new Member(inputId, inputPw, inputName, inputAge, inputGender.charAt(0), inputEmail);
			
			mc.insertMember(temp);
			
			System.out.println("성공적으로 회원 등록이 되었습니다.");
		}
		
	}
	
	public void searchMember() {
		
		int inputNum = 0;
		do {
			
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("0. 이전 메뉴로");
			
			System.out.print("메뉴 선택 : ");
			inputNum = sc.nextInt();
			
			if(inputNum == 0) break;
			
			System.out.print("검색 내용 : ");
			String inputText = sc.next();
			
			Member temp = new Member();
			temp = mc.searchMember(inputNum, inputText);
			
			if(temp == null) 
				System.out.println("검색된 결과가 없습니다.");
			else
				System.out.println(temp.information());
			
			
		} while (inputNum != 0);
		
	}
	
	public void updateMember() {
		
		int inputNum = 0;
		do {
			
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("0. 이전 메뉴로");
			
			System.out.print("메뉴 선택 : ");
			inputNum = sc.nextInt();
			
			if(inputNum == 0) break;
			
			System.out.print("변경할 회원 아이디 : ");
			String inputText = sc.next();
			
			Member temp = new Member();
			temp = mc.checkId(inputText);
			
			if(temp == null) 
				System.out.println("변경할 회원이 존재하지 않습니다.");
			else {
				System.out.print("변경 내용 : ");
				String update = sc.next();
				mc.updateMember(temp, inputNum, update);
				
				System.out.println("회원의 정보가 변경되었습니다.");
			}
			
		} while (inputNum != 0);
		
	}
	
	public void deldteMember() {
		
		System.out.print("삭제할 회원 아이디 : ");
		String userId = sc.next();
		
		if(mc.checkId(userId) == null) {
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		}
		else {
			System.out.print("정말 삭제하시겠습니까? (y/n)");
			char inputChar = (sc.next()).charAt(0);
			
			if(inputChar < 'a') inputChar += 32;
			
			if(inputChar == 'y') {
				System.out.println("(y/n) : " + inputChar);
				
				mc.deleteMember(userId);
				
				System.out.println("회원의 정보가 삭제되었습니다.");
			}
		}
		
	}
	
	public void printAIMember() {
		
		Member[] mem = mc.getMem();
		
		for(int i = 0; i<mem.length; i++) {
			
			if(mem[i] == null) break;
			
			System.out.println(mem[i].information());
		}
		
	}
	
	public void sortMember() {
		
		Member[] sortMem = null;
		
		int inputNum = 0;
		do {
			
			System.out.println("===== 회원 정보 정렬 =====");
			System.out.println("1. 아이디 오름차순 정렬");
			System.out.println("2. 아이디 내림차순 정렬");
			System.out.println("3. 나이 오름차순 정렬");
			System.out.println("4. 나이 내림차순 정렬");
			System.out.println("5. 성별 내림차순 정렬(남여순)");
			System.out.println("0. 이전 메뉴로");
			
			switch(inputNum) {
			case 1: 
				sortMem = mc.sortIdAsc(); 
				break;
			case 2: 
				sortMem = mc.sortIdDesc(); 
				break;
			case 3: 
				sortMem = mc.sortAgeAsc(); 
				break;
			case 4: 
				sortMem = mc.sortAgeDesc(); 
				break;
			case 5: 
				sortMem = mc.sortGenderDesc(); 
				break;
			case 0: break;
			}
			
			for(int i = 0; i<mc.getMemberCount(); i++) {
				System.out.println(sortMem[i].information());
			}
			
		} while (inputNum != 0);
		
		
		
	}
	
	
}
