package com.hw.songList.model.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.hw.songList.model.service.SongListService;
import com.hw.songList.model.service.SongListServiceImpl;

public class SongListView {
	
	BufferedReader br = null;
	SongListService service;
	
	public SongListView() {

		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			service = new SongListServiceImpl();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void displayMenu() {
		
		int input = 0;
		
		do {
			
			try {
				
				System.out.println("<< 노래 차트 >>");
				System.out.println("1. 노래 차트 보기");
				System.out.println("2. 노래 추가하기");
				System.out.println("3. 노래 삭제하기");
				System.out.println("4. 노래 내용");
				
			} catch (IOException e) {
				
				System.out.println("");
			} catch (NumberFormatException e) {
				
				System.out.println("");
			}
			
			
		} while (input != 0);
	}
}
