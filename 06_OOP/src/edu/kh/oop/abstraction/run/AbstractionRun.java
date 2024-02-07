package edu.kh.oop.abstraction.run;

import edu.kh.oop.abstraction.mode.service.AbstractionService;

public class AbstractionRun {
	
	public static void main(String[] args) {
		
		// 서비스 
		AbstractionService ser = new AbstractionService();
		// 그 객체에서 ex1() 호출
		ser.ex1();
	}
}
