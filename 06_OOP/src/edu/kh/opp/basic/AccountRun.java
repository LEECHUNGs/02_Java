package edu.kh.opp.basic;

import java.util.Scanner;

public class AccountRun {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account me = new Account();
		
		me.setName("이충섭");
		me.setAccountNumber("1234-12345");
		me.setBalance(10000);
		me.setPassword("1234");
		
		System.out.print("얼마를 입금할까? : ");
		me.deposit(sc.nextInt());
		
		System.out.print("얼마를 출금할까? : ");
		int input = sc.nextInt();
		System.out.print("비밀번호는 ? : ");
		String input2 = sc.next();
		
		me.withdraw(input2, input);

		
		
	}
}
