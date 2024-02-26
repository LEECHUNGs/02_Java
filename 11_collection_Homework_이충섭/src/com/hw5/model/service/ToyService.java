package com.hw5.model.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.hw5.model.dto.Toy;

public class ToyService {
	
	private Scanner sc = new Scanner(System.in);
	private Map<Integer, String> map; 
	private List<Toy> toys;
	
	public ToyService() {
		
		toys = new ArrayList<Toy>();
		map = new HashMap<Integer, String>();
		
		map.put(1, "면직물");
		map.put(2, "플라스틱");
		map.put(3, "유리");
		map.put(4, "고무");
		
		toys.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", makeMap("면직물", "고무")));
		toys.add(new Toy("허기워기", 5, 12000, "파란색", "1990312", makeMap("면직물", "플라스틱")));
		toys.add(new Toy("키시미시", 8, 27000, "분홍색", "19940505", makeMap("면직물", "플라스틱")));
		toys.add(new Toy("캣닙", 8, 27000, "보라색", "19960128", makeMap("면직물", "플라스틱")));
		toys.add(new Toy("파피", 12, 57000, "빨간색", "19931225", makeMap("면직물", "플라스틱", "고무")));
		
	}
	
	public Set<String> makeMap(String...s) {
		
		Set<String> set = new HashSet<String>();
		Set<Entry<Integer, String>> entrys = map.entrySet();
		
		for(String str : s) {
			
			for(Entry<Integer, String> e : entrys) {
				
				if(e.getValue().equals(str)) {
					
					set.add(str);
					break;
				}
			}
		}
		
		return set;
	}
	
	public void dispayMenu() {
		
		int input = 0;
		
		do {
			
			try {
				
				System.out.println("<< 플레이타임 공장 >>");
				System.out.println("1. 전체 장난감 조회하기");
				System.out.println("2. 새로운 장난감 만들기");
				System.out.println("3. 장난감 삭제하기");
				System.out.println("4. 장난감 제조일 순으로 조회");
				System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
				System.out.println("6. 재료 추가");
				System.out.println("7. 재료 제거");
				
				System.out.print("선택 : ");
				input = sc.nextInt();
				
				switch(input) {
				case 1 : searchAll(); break;
				case 2 : toyMake(); break;
				case 3 : toyDelete(); break;
				case 4 : toySort(); break;
				case 5 : toyAgeList(); break;
				case 6 : matarialAdd(); break;
				case 7 : matarialDelete(); break;
				case 0 : System.out.println("프로그램 종료"); break;
				}
				
			} catch (Exception e) {
				input = -1;
				sc.nextLine();
				System.out.println("잘못된 입력");
			}
			
		} while (input != 0);
	}
	
	public void searchAll() {
		
		for(Toy toy : toys) {
			
			System.out.println(toy);
		}
	}

	public void toyMake() {
		
System.out.println("<새로운 장난감 추가>");
		
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("장난감 이름 : ");
		String color = sc.next();
		
		System.out.print("제조일(YYYYMMDD 형식으로 입력) : ");
		String year = sc.next();
		
		
		String resorce = "";
		String resorces = "";
		while(true) {
			
			System.out.print("재료를 입력하세요 : ");
			if((resorce = sc.next()).equals("q")) break;
			
			resorces += resorce + "_";
		}
		
		toys.add(new Toy(name, age, price, color, year, makeMap(resorces.split("_"))));
		System.out.println("새로운 장난감이 추가되었습니다.");
	}
	public void toyDelete() {
		
		
		
	}
	public void toySort() {
		
	}
	public void toyAgeList() {
		
	}
	public void matarialAdd() {
		
	}
	public void matarialDelete() {
		
	}
}
