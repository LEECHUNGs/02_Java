package edu.kh.array2.practice;

import java.util.Scanner;

public class Array2Practice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		String str[][] = { {"(0, 0)", "(0, 1)", "(0, 2)"}, 
							{"(1, 0)", "(1, 1)", "(1, 2)"}, 
							{"(2, 0)", "(2, 1)", "(2, 2)"}};
		
		for(int i = 0; i<str.length; i++) {

			for(int j = 0; j<str[0].length; j++) {
				System.out.print(str[i][j]);
			}
			System.out.println();
		}
	}

	public void practice2() {
		int num[][] = new int[4][4];
		
		for(int i = 0; i<num.length; i++) {
			
			for (int j = 0; j < num[0].length; j++) {
				num[i][j] = i * 4 + j + 1 ;
			}
		}
		
		for(int i = 0; i<num.length; i++) {
			
			for (int j = 0; j < num[0].length; j++) {
					System.out.printf("%2d ",num[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		int num[][] = new int[4][4];
		
		for(int i = 0; i<num.length; i++) {
			
			for (int j = 0; j < num[0].length; j++) {
				num[i][j] = (num.length * num[0].length) - j - (i * 4) ;
			}
		}
		
		for(int i = 0; i<num.length; i++) {
			
			for (int j = 0; j < num[0].length; j++) {
					System.out.printf("%2d ",num[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		int num[][] = new int[4][4];
		
		System.out.println("실행");
		for(int i = 0; i<num.length-1; i++) {
			
			for (int j = 0; j < num[0].length-1; j++) {
				System.out.printf("%d행 %d열 값 : ",i, j);
				num[i][j] = sc.nextInt();
				num[i][num[0].length-1] += num[i][j];
			}
			
		}
				
		for(int i = 0; i<num.length; i++) {
			for (int j = 0; j < num[0].length-1; j++) {
				num[num.length-1][i] += num[j][i];
			}
		}
		
		for(int i = 0; i<num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				System.out.printf("%2d ", num[i][j]);
			}
			System.out.println();
		}
		
	}

	public void practice5() {
		int row, col;
		while(true) {
			System.out.print("행 크기 : ");
			row = sc.nextInt();
			
			if(row > 1 && row <= 10) {
				break;
			}
			else {
				System.out.println("1~10 사이의 숫자를 입력하세요");
			}
			
		}
		
		while(true) {
			System.out.print("열 크기 : ");
			col = sc.nextInt();
			
			if(row > 1 && row <= 10) {
				break;
			}
			else {
				System.out.println("1~10 사이의 숫자를 입력하세요");
			}
		}
		
		char[][] a = new char[row][col];
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[0].length; j++) {
				a[i][j] = (char)((int)(Math.random()*26 + 65));
			}
		}
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice6() {
		System.out.print("행의 크기 : ");
		char[][] a = new char[sc.nextInt()][];
		
		int count = 0;
		
		for(int i = 0; i<a.length; i++) {
			System.out.print(i + "열의 크기 : ");
			a[i] = new char[sc.nextInt()];
			
			for(int j = 0; j<a[i].length; j++) {
				a[i][j] = (char)((int)'a' + (count++));
			}
		}
		
		for(int i = 0; i<a.length; i++) {			
			for(int j = 0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	public void pracitce7() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] a = new String[3][2];
		
		for(int i = 0; i<students.length; i++) {
			a[i%6][i/6] = students[i];
		}
		
		for(int i = 0; i<a.length; i++) {
			System.out.printf("== %d분단 ==", (i+1));
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}

















