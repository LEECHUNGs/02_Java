package edu.kh.opp.basic;

public class Account {
	
	// - geter/setter
	// - deposit() : 전달받은 금액을 잔액에 누적한 후, 현재 잔액을 콘솔에 출력
	// - withdraw() : 비밀번호와 출금할 금액을 전달받아, 조건에 맞으면 잔액에서 차감 후
	// 					현재 잔액 출력
	//				1) 비밀번호와 일치하지 않으면 "비밀번호 불일치"
	//				2) 출금할 그액이 잔액보다 크면 "잔액 부족" 출력
	
	
	private String name;
	private String accountNumber;
	private int balance;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void deposit(int amount) {
		System.out.println(amount + "원을 입금합니다.");
		this.balance += amount;
		System.out.println("현재 잔액은 " + this.balance + "입니다.");
	}
	
	public void withdraw(String pw, int amount) {
		if(!pw.equals(this.password)) {
			System.out.println("비밀번호 불일치");
			return;
		}
		
		if(this.balance < amount) {
			System.out.println("잔액 부족");
			return;
		}
		this.balance -= amount;
		System.out.printf("%d원이 출금되었습니다.", amount);
		System.out.printf("잔액은 %d원 입니다.", this.balance);
	}

}
