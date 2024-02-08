package edu.kh.array2.practice;

import java.util.Arrays;
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

	public void practice7() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] a = new String[3][2];
		String[][] b = new String[3][2];
		
		for(int i = 0; i<students.length/2; i++) {
			a[i/2][i%2] = students[i];
			b[i/2][i%2] = students[i+6];
		}
		
		
		System.out.printf("== %d분단 ==\n", 1);
		for(int i = 0; i<a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.printf("== %d분단 ==\n", 2);
		for(int i = 0; i<b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice8() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] a = new String[3][2];
		String[][] b = new String[3][2];
		
		for(int i = 0; i<students.length/2; i++) {
			a[i/2][i%2] = students[i];
			b[i/2][i%2] = students[i+6];
		}
		
		
		System.out.printf("== %d분단 ==\n", 1);
		for(int i = 0; i<a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.printf("== %d분단 ==\n", 2);
		for(int i = 0; i<b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String input = sc.next();
		
		int index[] = {-1, -1, -1};
		for(int i = 0; i<a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j].equals(input)) {
					index[0] = i;
					index[1] = j;
					index[2] = 1;
				}
			}
			
		}
		
		for(int i = 0; i<b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if(b[i][j].equals(input)) {
					index[0] = i;
					index[1] = j;
					index[2] = 2;
				}
			}
		}
		
		String st = "";
		if(index[1] == 0)
			st = "왼쪽";
		else 
			st = "오른쪽";
			
		
		System.out.printf("검색하신 %s 학생은 %d분단 %d번째 줄 %s에 있습니다.", input, index[2], index[0] + 1, st);
	}

	public void practice9() {
		String a[][] = new String[6][6];
		
		String temp = "";
		int k = -1;
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				
				if((i == 0 || j == 0) && (i != j)) {
					k = i + j -1;
					temp += k;
					a[i][j] = temp;
					temp = "";
				}
			}
		}
		
		System.out.print("행 인덱스 입력 : ");
		int row = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int col = sc.nextInt();
		
		a[row+1][col+1] = "X";
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				if(a[i][j] == null)
					System.out.print("  ");
				else if((i == 0 || j == 0) && (i != j)) {
					System.out.print(a[i][j] + " ");
				}
				else {
					System.out.print(a[i][j]);
				}
			}
			System.out.println();
		}
	}

	public void practice10() {
		String a[][] = new String[6][6];
		
		String temp = "";
		int k = -1;
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				
				if((i == 0 || j == 0) && (i != j)) {
					k = i + j -1;
					temp += k;
					a[i][j] = temp;
					temp = "";
				}
			}
		}
		
		int row = 0;
		int col = 0;
		while(true) {
			System.out.print("행 인덱스 입력 >> ");
			row = sc.nextInt();
			
			if(row == 99) {
				System.out.println("\n프로그램 종료");
				break;
			}
			
			System.out.print("열 인덱스 입력 >> ");
			col = sc.nextInt();
			
			a[row+1][col+1] = "X";
			
			for(int i = 0; i<a.length; i++) {
				for(int j = 0; j<a[i].length; j++) {
					if(a[i][j] == null)
						System.out.print("  ");
					else if((i == 0 || j == 0) && (i != j)) {
						System.out.print(a[i][j] + " ");
					}
					else {
						System.out.print(a[i][j]);
					}
				}
				System.out.println();
			}
			
		}
		
	}
}

















