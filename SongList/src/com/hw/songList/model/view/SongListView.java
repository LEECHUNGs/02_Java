package com.hw.songList.model.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.hw.songList.model.dto.Song;
import com.hw.songList.model.service.SongListService;
import com.hw.songList.model.service.SongListServiceImpl;

public class SongListView {
	
	private BufferedReader br = null;
	private SongListService service = null;
	
	public SongListView(){
		
		try {
			service = new SongListServiceImpl();
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public void startView() {
		int input = 0;
		
		do {
			try {
				input = inputMenu();
				
				switch(input) {
				case 1 : chartView(); break;
				case 2 : songSearch(); break;
				case 3 : songDetail(); break;
				case 4 : songAdd(); break;
				case 5 : songDelete(); break;
				case 0 : System.out.println("프로그램을 종료합니다...."); break;
				default : System.out.println("유효하지 않은 입력입니다. 다시 입력해 주세요;;");
				}

			} catch (IOException e) {
				System.out.println("오류");
				
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해 주세요;;");
				input = -1;
			}
			
			
		} while (input != 0);
	}
	
	public int inputMenu() throws IOException{
		System.out.println("<< 노래 차트 >>");
		System.out.println("1. 노래 차트 보기");
		System.out.println("2. 노래 검색(노래명, 앨범명, 가수명)(일부만 일치)");
		System.out.println("3. 노래 정보 보기(가사 포함)");
		System.out.println("4. 노래 추가하기");
		System.out.println("5. 노래 삭제하기");
		System.out.println("6. ");
		System.out.println("0. 프로그램 종료");
		
		System.out.print("선택 >> ");
		int input = Integer.parseInt(br.readLine());
		
		return input;
	}
	
	public void chartView() {
		System.out.println("******* 1. 노래 차트 보기 *******");
		
		List<Song> songList = service.sortSongList();
		
		int i = 1;
		for(Song song : songList) {
			System.out.println("----------- " + (i++) + "위 -----------");
			System.out.println("노래명 : " + song.getTitle());
			System.out.println("가수 : " + song.getArtist());
			System.out.println("좋아요 : " + song.getLike());
		}
		System.out.println("------------------------------");
	}
	
	public void songSearch() throws IOException{
		System.out.println("******* 2. 노래 검색(노래명, 앨범명, 가수명)(일부만 일치) *******");
		
		int input = 0; 
		
		do {
			input = searchMenu();
			
			
			StringBuilder sb = new StringBuilder("검색하실 ");
			switch(input) {
			case 1 : sb.append("노래명을 "); break;
			case 2 : sb.append("가수를 "); break;
			case 3 : sb.append("가사를 "); break;
			case 0 : System.out.println("검색을 종료합니다.."); return;
			default : System.out.println("유효하지 않은 입력입니다. 다시 입력해 주세요;;");
			}
			
			System.out.println(sb.toString() + "입력해 주세요 >> ");
			String str = br.readLine();
			
			List<Song> searchSongList = new ArrayList<Song>();
			searchSongList = service.searchSong(input, str);
			
			if(searchSongList == null) System.out.println("검색된 노래가 없습니다;;");
			
			else {
				for(Song song : searchSongList) {
					System.out.println("------------------------------");
					System.out.println("노래명 : " + song.getTitle());
					System.out.println("가수 : " + song.getArtist());
					System.out.println("좋아요 : " + song.getLike());
				}
				
				System.out.println("------------------------------");
				
			}
			
		} while (input != 0);
	}
	
	public int searchMenu() throws IOException{
		System.out.println("1. 노래명으로 검색");
		System.out.println("2. 가수명으로 검색");
		System.out.println("3. 가사로 검색");
		System.out.println("0. 검색 종료");
		
		System.out.print("선택 >> ");
		int input = Integer.parseInt(br.readLine());
		
		return input;
	}
	
	public void songDetail() throws IOException{
		System.out.println("******* 3. 노래 정보 보기(가사 포함) *******");
		
		System.out.print("노래 제목을 입력해 주세요 : ");
		String str = br.readLine();
		
		Song song = service.songLyrics(str);
	}
	
	public void songAdd() {
		
	}
	
	public void songDelete() {
		
	}
}
