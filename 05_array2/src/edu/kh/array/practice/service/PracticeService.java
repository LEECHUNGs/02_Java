package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		int[] a = new int[9];
		
		int sum = 0;
		for(int i = 0; i<9; i++) {
			a[i] = i+1;
			
			System.out.print(a[i] + " ");
			
			if(i%2 == 0) sum += a[i];
		}
		

		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}
	
	public void practice2() {
		int[] a = new int[9];
		
		int sum = 0;
		for(int i = 0; i<9; i++) {
			a[i] = 9-i;
			
			System.out.print(a[i] + " ");
			
			if(i%2 == 1) sum += a[i];
		}
		
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	}
	
	public void practice3() {
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int a[] = new int[num];
		
		for(int i = 0; i<a.length; i++) {
			a[i] = i+1;
			System.out.print(a[i] + " ");
		}
	}

	public void practice4() {
		int[] a = new int[5];
		for(int i = 0; i<5; i++) {
			System.out.print("입력 " + i + " : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int num = sc.nextInt();
		
		int index = -1;
		for(int i = 0; i<a.length; i++ ){
			if(a[i] == num) {
				index = i;
				break;
			}
		}
		
		if(index == -1) System.out.println("일치하는 값이 존재하지 않습니다.");
		else System.out.println("인덱스 : " + index);
		
	}

	public void practice5() {
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] a = new char[str.length()];
		
		System.out.print("문자 : ");
		char input = sc.next().charAt(0);
		
		for(int i = 0; i<str.length(); i++) {
			a[i] = str.charAt(i);
		}
		
		int count = 0;
		System.out.print(str + "에 " + input + "가 존재하는 위치(인덱스) : ");
		for(int i = 0; i<a.length; i++) {

			if(input == a[i]) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.println(input + "의 개수 : " + count);
		
		
	}

	public void practice6() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] a = new int[num];
		
		for(int i = 0; i<a.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
			sum += a[i];
		}
		
		System.out.println("\n총 합 : " + sum);
		
		
	}

	public void practice7() {
		
		System.out.print("주민등록번호(- 포함) : ");
		String a = sc.next();
		
		char b[] = new char[a.length()];
		
		for(int i = 0; i<a.length(); i++) {
			b[i] = a.charAt(i);
			
			if(i>=8) b[i] = '*';
		}
		
		for(int i = 0; i<b.length; i++) {
			System.out.print(b[i]);
		}
	}

	public void practice8() {
		
		int num;
		while(true) {
			System.out.print("정수 : ");
			num = sc.nextInt();
						
			if(num > 3 && num % 2 == 1) break;
			
			System.out.println("다시 입력하세요.");
		}
		
		int arr[] = new int[num];
		for(int i = 0; i<arr.length; i++){	
			arr[i] = i+1;
			
			if(i >= (arr.length/2 + 1)) arr[i] = arr.length - i;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

	public void practice9() {
		
		int num[] = new int[10];
		
		System.out.print("발생한 난수 : ");
		for(int i = 0; i<num.length; i++) {
			num[i] = (int)(Math.random()*10 + 1);
			System.out.print(num[i] + " ");
		}
	}

	public void practice10() {
		int num[] = new int[10];
		
		int min = 11;
		int max = 0;
		
		System.out.print("발생한 난수 : ");
		for(int i = 0; i<num.length; i++) {
			num[i] = (int)(Math.random()*10 + 1);
			System.out.print(num[i] + " ");
			
			if(min > num[i]) min = num[i];
			if(max < num[i]) max = num[i];
		}
		
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);

	}
	
	public void practice11() {
		int num[] = new int[10];
		
		for(int i = 0; i<num.length; i++) {
			num[i] = (int)(Math.random()*10 + 1);
			
			for (int j = 0; j < i; j++) {
				if(num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
	
	public void pracitce12() {
		int num[] = new int[10];
		
		for(int i = 0; i<num.length; i++) {
			num[i] = (int)(Math.random()*45 + 1);
			
			for (int j = 0; j < i; j++) {
				if(num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(num);
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

	public void practice13() {
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] strChar = new char[str.length()];

		System.out.print("문자열에 있는 문자 : ");
		
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			
			for(int j = 0; j<strChar.length; j++) {
				if(strChar[j] == str.charAt(i))
					count++;
			}
			
			strChar[i-count] = str.charAt(i);
		}
		
		for(int i = 0; i<strChar.length - count; i++) {
			System.out.print(strChar[i] + " ");
		}
		
		System.out.println("\n문자 개수 : " + (strChar.length - count));
	}

	public void practice14() {
		
		System.out.print("배열의 길이를 입력하세요 : ");
		String[] str = new String[sc.nextInt()];
		
		while(true) {
			
			for(int i = 0; i<str.length; i++) {
				System.out.print((i+1) + "번째 문자열 : ");
				str[i] = sc.next();
			}
			
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			if(sc.next().equals("N")) break;
			else {
				System.out.print("더 입력하고 싶은 개수 : ");
			}
		}
		
		System.out.println(Arrays.toString(str));
	}
}


















