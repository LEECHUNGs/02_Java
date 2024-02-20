package com.hw3.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {
	
	private ArrayList<Book> bookList = new ArrayList<Book>();
	private ArrayList<Book> bookMark = new ArrayList<Book>();
	
	private Scanner sc = new Scanner(System.in);
	
	public BookService() {
		
		bookList.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		bookList.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베게"));
		bookList.add(new Book(3333, "역행자", "자칭", 17550, "웅진지식하우스"));
		bookList.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		bookList.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
	}
	
	public void dispayMenu() {
		
		int inputNum = 0;
		
		do {
			
			System.out.println("=== 도서 목록 프로그램 ===");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");
			
			try{
				
				System.out.print("메뉴를 입력하세요 : ");
				inputNum = sc.nextInt();
				
				switch(inputNum) {
				case 1 : bookAdd(); break;
				case 2 : bookSearch(); break;
				case 3 : bookUpdate(); break;
				case 4 : bookDelete(); break;
				case 5 : bookMarkAdd(); break;
				case 6 : bookMarkDelete(); break;
				case 7 : bookMarkSearch(); break;
				case 8 : bookPick(); break;
				case 0 : System.out.println("프로그램을 종료합니다..."); break;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("유효하지 않은 입력입니다 다시 입력해 주세요");
				sc.nextLine();
				inputNum = -1;
			}
			
			
		} while (inputNum != 0);
		
	}
	
	
	/**
	 * 책을 추가하는 메서드 
	 */
	public void bookAdd() throws InputMismatchException{
		
		System.out.println("====== 도서 등록 ======");
		
		System.out.print("도서 번호 : ");
		int bNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		
		
		bookList.add(new Book(bNum, title, author, price, publisher));
		
		System.out.println("등록 완료");
		
	}
	
	/**
	 * 저장된 책 정보를 모두 출력하는 메서드 
	 */
	public void bookSearch() {
		
		System.out.println("====== 도서 조회 ======");
		
		for(Book book : bookList) {
			System.out.println(book);
		}
	}

	/**
	 * 도서의 번호를 입력받고 해당 도서의 정보를 수정하는 메서드
	 * @throws InputMismatchException
	 */
	public void bookUpdate() throws InputMismatchException{
		
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		Book searched = null;
		for(Book book : bookList) {
			
			if(book.getbNum() == num) {
				
				searched = book;
				break;
			}
		}
		
		if(searched == null) {
			
			System.out.println("해당 번호의 도서가 존재하지 않습니다.");
			return;
		}
		
		int inpuNum = 0;
		
		do {
			
			System.out.println("1. 도서명");
			System.out.println("2. 도서 저자");
			System.out.println("3. 도서 가격");
			System.out.println("4. 도서 출판사");
			System.out.println("0. 수정 종료");
			
			System.out.print("어떤 정보를 수정하시겠습니까? : ");
			inpuNum = sc.nextInt();
			sc.nextLine();
			
			switch(inpuNum) {
			case 1 : 
				System.out.println("===== 도서명 수정 =====");
				System.out.print("수정할 도서명을 입력하세요 : ");
				searched.setTitle(sc.nextLine());
				System.out.println("수정 완료");
				break;
			case 2 : 
				System.out.println("===== 도서 저자 수정 =====");
				System.out.print("수정할 저자명 입력하세요 : ");
				searched.setAuthor(sc.nextLine());
				System.out.println("수정 완료");
				break;
			case 3 : 
				System.out.println("===== 도서 가격 수정 =====");
				System.out.print("수정할 가격을 입력하세요 : ");
				searched.setPrice(sc.nextInt());
				sc.nextLine();
				System.out.println("수정 완료");
				break;
			case 4 : 
				System.out.println("===== 도서 출판사 수정 =====");
				System.out.print("수정할 출판사를 입력하세요 : ");
				searched.setPulisher(sc.nextLine());
				System.out.println("수정 완료");
				break;
			case 0 :
				System.out.println("수정을 종료합니다.");
				break;
			}
			
		} while (inpuNum != 0);
	}
	
	/**
	 * 도서의 번호를 입력받고 해당 도서를 삭제하는 메서드
	 */
	public void bookDelete() {
		
		System.out.print("삭제할 도서 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		Book searched = null;
		for(Book book : bookList) {
			
			if(book.getbNum() == num) {
				
				searched = book;
				break;
			}
		}
		
		if(searched != null) {
			
			bookList.remove(searched);
			System.out.println(num + "번 도서는 성공적으로 삭제되었습니다.");
		}
		else {
			System.out.println("해당 번호의 도서가 존재하지 않습니다.");
		}
	}

	/**
	 * 도서의 번호를 입력받고 해당 도서를 즐겨찾기에 추가하는 메서드
	 */
	public void bookMarkAdd() {
		
		System.out.print("즐겨찾기에 추가할 도서 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		Book searched = null;
		for(Book book : bookList) {
			
			if(book.getbNum() == num) {
				
				searched = book;
				break;
			}
		}
		
		if(searched != null) {
			
			bookMark.add(searched);
			System.out.println(num + "번 도서가 즐겨찾기에 추가되었습니다.");
		}
		else {
			
			System.out.println("해당 번호의 도서가 존재하지 않습니다.");
		}
	}
	
	/**
	 * 도서 번호를 입력받고 해당 도서가 즐겨찾기에 있으면 그 도서를 즐겨찾기에서 삭제하는 메서드 
	 */
	public void bookMarkDelete() {
		
		System.out.println("====== 즐겨찾기에서 삭제할 도서 선택 ======");
		
		System.out.print("즐겨찾기에서 삭제할 도서 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		Book searched = null;
		for(Book book : bookMark) {
			
			if(book.getbNum() == num) {
				
				searched = book;
				break;
			}
		}
		
		if(searched != null) {
			
			bookMark.remove(searched);
			System.out.println(num + "번 도서는 성공적으로 북마크에서 삭제되었습니다.");
		}
		else {
			System.out.println("해당 번호의 도서가 북마크에 존재하지 않습니다.");
		}
	}
	
	/**
	 * 즐겨찾기된 도서들을 조회하는 메서드
	 */
	public void bookMarkSearch() {
		
		System.out.println("====== 즐겨찾기된 도서 조회 ======");
		
		for(Book book : bookMark) {
			System.out.println(book);
		}
	}

	/**
	 * 오늘의 추천 도서를 랜덤하게 뽑는 메서드
	 */
	public void bookPick() {
		
		System.out.println("====== 추천 도서 뽑기 ======");
		
		int ranNum = (int)(Math.random() * bookList.size());
		
		System.out.println("오늘의 추천도서는????");
		
		System.out.println(bookList.get(ranNum));
	}
}













