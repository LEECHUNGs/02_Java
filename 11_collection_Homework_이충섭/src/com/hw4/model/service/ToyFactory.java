package com.hw4.model.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.hw4.model.dto.Toy;

public class ToyFactory {
	
	private Scanner sc = new Scanner(System.in);
	private Set<Toy> toyList = new HashSet<Toy>(); // 장난감 저장용 컬렉션
	private Map<Integer, String> resMap = new HashMap<Integer, String>();
	
	public ToyFactory() {
		resMap.put(1, "면직물");
		resMap.put(2, "플라스틱");
		resMap.put(3, "유리");
		resMap.put(4, "고무");
		
		toyList.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", makeMap("면직물", "고무")));
		
		toyList.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", makeMap("면직물", "플라스틱")));
		
		toyList.add(new Toy("키시미시", 5, 27000, "분홍색", "19940505", makeMap("면직물", "플라스틱")));
		
		toyList.add(new Toy("캣닙", 8, 27000, "보라색", "19960128", makeMap("면직물", "플라스틱")));
		
		toyList.add(new Toy("파피", 12, 57000, "빨간색", "19931225", makeMap("면직물", "플라스틱", "고무")));
		
		//toyList.add
	}
	
	public Set<String> addMaterials(Integer...newMaterials) {
		
		
		return new HashSet<String>();
	}
	
	
	/**
	 * @param a
	 * @return
	 * 
	 * 매개변수에서 (Wrapper 자료형)...변수명 으로 매개변수를 설정하면
	 * 해당 매개변수의 자료형을 여러개 입력받을 수 있다!!!!
	 */
	public Map<Integer, String> makeMap(String...a) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		Set<Entry<Integer, String>> entry = resMap.entrySet();
		
		for(String b : a) {
			
			for(Entry<Integer, String> e : entry) {
				
				if((e.getValue()).equals(b)) {
					
					map.put(e.getKey(), e.getValue());
				}
			}
		}
		
		return map;
	}
	
	public void displayMenu() {
		
		int num = 0;
		
		do {
			
			try {
				
				System.out.println("<<플레이타임 공장>>");
				System.out.println("1. 전체 장남감 조회하기");
				System.out.println("2. 새로운 장난감 만들기");
				System.out.println("3. 장난감 삭제하기");
				System.out.println("4. 장난감 제조일 순으로 조회하기");
				System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
				System.out.println("6. 재료 추가");
				System.out.println("7. 재료 제거");
				System.out.print("선택 : ");
				
				num = sc.nextInt();
				
				switch(num) {
				case 1 : toySearch(); break;
				case 2 : toyMaking(); break;
				case 3 : toyDelete(); break;
				case 4 : toySortSearch(); break;
				case 5 : 
					toyAgeSearch(); break;
					//displayToyByAge(); break;
				case 6 : toyAddResorce(); break;
				case 7 : toySubResorce(); break;
				case 0 : System.out.println("프로그램을 종료합니다...."); break;
				default : System.out.println("없는 번호입니다 다시 입력해 주세요"); break;
				}
			}
			catch(InputMismatchException e) {
				
				sc.nextLine();
				System.out.println("유효하지 않은 입력입니다. 다시 입력해 주세요;;");
				num = -1;
			}
			
			
		} while (num != 0);
	}
	
	public void toySearch() {
		
		System.out.println("<전체 장난감 목록>");
		int i = 1;
		for(Toy t : toyList) {
			System.out.println((i++) + ". " + t.toString());
		}
	}
	
	public void toyMaking() {
		
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
			
			resorces += resorce + " ";
		}
		
		toyList.add(new Toy(name, age, price, color, year, makeMap(resorces.split(" "))));
		System.out.println("새로운 장난감이 추가되었습니다.");
	}
	
	public void toyDelete() {
		
		System.out.println("<장난감 삭제>");
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String name = sc.next();
		
		Toy seacrchToy = null;
		for(Toy t : toyList) {
			
			if((t.getName()).equals(name)) {
				
				seacrchToy = t;
			}
		}
		
		if(seacrchToy != null) {
			toyList.remove(seacrchToy);
			System.out.println("장난감이 삭제되었습니다.");
		}
		else {
			System.out.println("해당 이름의 장난감이 없습니다.");
		}
	}
	
	public void toySortSearch() {
		
		System.out.println("<제조일 순으로 장난감을 정렬>");
		
		List<Toy> toListSortByDate = new ArrayList<Toy>(toyList);
		
		toListSortByDate.sort(Comparator.comparing(Toy::getYear));
		
		int index = 1;
		for(Toy t : toListSortByDate) {
			
			System.out.println((index++) + ". " + t.toString());
		}
 	}
	
	public void toyAgeSearch() {
		
		System.out.println("<연령별로 사용 가능한 장난감>");
		
		Map<Integer, Set<Toy>> list = new HashMap<Integer,Set<Toy>>();
				
		for(Toy t : toyList) {
			
			if(list.get(t.getAge()) == null) {
				
				list.put(t.getAge(), new HashSet<Toy>());
			}
			
			list.get(t.getAge()).add(t);
		}
		
		Set<Entry<Integer, Set<Toy>>> entry = list.entrySet();
		
		int i = 1;
		for(Entry<Integer, Set<Toy>> e : entry) {
			
			System.out.println("[연령 : " + e.getKey() + "세]");

			for(Toy t : e.getValue()) {
				System.out.print((i++) + ". ");
				System.out.println(t.toString());
			}
			i = 1;
		}
	}
	
	public void displayToyByAge() {
		
		System.out.println("<연령별로 사용 가능한 장난감>");
		
		Map<Integer, List<Toy>> toysByAge = new HashMap<Integer, List<Toy>>();
		// toysByAge 라는 이름의 새로운 맵을 생성
		// -> 연령을 key로 하고, 해당 연령을 가진 장난감 list를 value로 가짐
		// {K:V} -> {5:["키시미시", "허기워기"]}
		
		for(Toy toy : toyList) {
			
			int age = toy.getAge(); 
			
			toysByAge.putIfAbsent(age, new ArrayList<Toy>());
			// putIfAbsent() : Map 인터페이스에서 제공되는 메서드로
			// 해당 키가 존재하지 않는 경우에만 전달받은 값을 추가함
			// -> 맵에 해당 연령의 리스트가 없는 경우에만 새 리스트 생성후 추가
		}
		
		int index = 1;
		for(Entry<Integer, List<Toy>> entry : toysByAge.entrySet()) {
			
			System.out.printf("[연령 : %d세]", entry.getKey());
			for(Toy e : entry.getValue()) {
				
				System.out.printf("%d. %s", index++, e.toString());
			}
		}
	}
	
	public void toyAddResorce() {
		
		System.out.println("<재료 추가>");
		System.out.println("---현재 등록된 재료---");
		
		Set<Entry<Integer, String>> entry = resMap.entrySet();
		
		for(Entry<Integer, String> e : entry) {
			
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println("====================");
		
		System.out.print("재료 고유번호(key) 입력 : ");
		int key = sc.nextInt();
		sc.nextLine();
		
		System.out.print("재료명 입력 : ");
		String mat = sc.next();
		
		if(resMap.get(key) == null) {
			
			resMap.put(key, mat);
			System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
		}
		else {
			
			System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
			System.out.print("덮어쓰시겠습니까? (Y/N)");
			String bool = sc.next();
			
			if(bool.equalsIgnoreCase("Y")) {
				
				resMap.put(key, mat);
				System.out.println("재료가 성공적으로 덮어쓰기 되었습니다!");
			}
			else {
				
				System.out.println("재료 추가가 취소되었습니다.");
			}
		}	
	}
	
	public void toySubResorce() {
		
		System.out.println("<재료 삭제>");
		System.out.println("---현재 등록된 재료---");
		
		Set<Entry<Integer, String>> entry = resMap.entrySet();
		
		for(Entry<Integer, String> e : entry) {
			
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println("====================");
		
		System.out.print("삭제할 재료명 입력 : ");
		String mat = sc.next();
		
		for(Entry<Integer, String> e : entry) {
			
			if(e.getValue().equals(mat)) {
				
				resMap.remove(e.getKey());
				System.out.println("재료 '" + mat + "'가 성공적으로 제거되었습니다.");
				return;
			}
		}
		
		System.out.println("해당 이름의 재료가 존재하지 않습니다.");
	}
}