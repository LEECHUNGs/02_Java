package com.hw1.run;

import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {
	
	public static void main(String[] args) {
		
//		ArrayList<Friend> friends = new ArrayList<Friend>();
//		
//		Friend[] p = new Friend[5];
//		
//		p[0] = new Friend("짱구");
//		p[1] = new Friend("철수");
//		p[2] = new Friend("유리");
//		p[3] = new Friend("훈이");
//		p[4] = new Friend("맹구");
		
		// Collections.addAll();
		
		// Collection.addAll(friends, new Friend("짱구"), new Friend("철수"), new Friend("유리"),
		//					new Friend("훈이"), new Friend("맹구"));
		
		// List.of() : Java 9 이상의 버전에서 사용가능
		List<Friend> friends = List.of(new Friend("짱구"), new Friend("철수"), new Friend("유리"),
									new Friend("훈이"), new Friend("맹구"));
		
		int randomNum = (int)(Math.random() * 5);
		
		
		friends.get(randomNum).pickLeader();
		
	}
}
