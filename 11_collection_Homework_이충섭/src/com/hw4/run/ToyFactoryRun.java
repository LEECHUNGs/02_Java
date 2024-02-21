package com.hw4.run;

import com.hw4.model.service.ToyFactory;

public class ToyFactoryRun {
	
	public static void main(String[] args) {
		
		ToyFactory service = new ToyFactory();
		
		service.displayMenu();
	}
}
