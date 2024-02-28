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
				case 6 : songUpdate(); break;
				case 7 : songLyricsUpload(); break;
				case 0 : System.out.println("프로그램을 종료합니다...."); break;
				default : System.out.println("유효하지 않은 입력입니다. 다시 입력해 주세요;;");
				}

			} catch (IOException e) {
				System.out.println("입/출력 오류");
				
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해 주세요;;");
				input = -1;
			} catch (Exception e) {
				System.out.println("저장 에러;;");
			}
			
			
		} while (input != 0);
	}
	
	public int inputMenu() throws IOException{
		System.out.println("<< 노래 차트 >>");
		System.out.println("1. 노래 차트 보기(좋아요 순)");
		System.out.println("2. 노래 검색(노래명, 앨범명, 가수명)(일부만 일치)");
		System.out.println("3. 노래 정보 보기(가사 포함)(가사 완전일치)");
		System.out.println("4. 노래 추가하기");
		System.out.println("5. 노래 삭제하기");
		System.out.println("6. 노래 정보 수정하기");		
		System.out.println("7. 노래 가사 업로드");
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
			
			System.out.print(sb.toString() + "입력해 주세요 >>  ");
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
		System.out.println("******* 3. 노래 정보 보기(가사 포함)(가사 완전일치) *******");
		
		System.out.print("노래 제목을 입력해 주세요 : ");
		String str = br.readLine();
		
		String lyrics = service.songLyrics(str);
		System.out.println(lyrics);
		
		System.out.println("------------------------------");
	}
	
	public void songAdd() throws Exception{
		System.out.println("******* 4. 노래 추가하기 *******");
		
		System.out.print("노래 제목 입력 : ");
		String title = br.readLine();
		
		System.out.print("가수 이름 입력 : ");
		String artist = br.readLine();
		
		System.out.print("좋아요 개수 : ");
		int like = Integer.parseInt(br.readLine());
		
		switch(service.songAdd(title, artist, like)) {
		case 1 : System.out.println("정상적으로 노래가 저장되었습니다."); break;
		case 0 : System.out.println("노래는 정상적으로 저장했지만 가사가 저장되지 않았습니다.\n"
														+ "나중에 가사파일 (노래명.txt) 을 (/io_test/song_list) 경로에 업로드 해주세요"); break;
		case -1 : System.out.println("같은 곡이 저장되어 있습니다!!! 확인해 주세요;;;");
		}
	}
	
	public void songDelete() throws Exception{
		System.out.println("******* 5. 노래 삭제하기 *******");
		
		System.out.println("삭제할 노래의 제목을 입력하세요");
		System.out.print(">> ");
		String title = br.readLine();
		
		System.out.println("삭제할 노래의 가수를 입력하세요");
		System.out.print(">> ");
		String artist = br.readLine();
		
		Song song = service.songExist(title, artist);
		
		service.songDelete(song);
		
		if(song != null) {
			System.out.println("------------------------------");
			System.out.println("노래명 : " + song.getTitle());
			System.out.println("가수 : " + song.getArtist());
			System.out.println("좋아요 : " + song.getLike());
			
			System.out.println("위의 노래가 삭제되었습니다.");
		}
		else {
			System.out.println("해당 노래가 존재하지 않습니다.");
			
		}
		
		System.out.println("------------------------------");
	}
	
	public void songUpdate() throws Exception{
		System.out.println("******* 6. 노래 정보 수정 *******");
		
		System.out.println("수정할 노래의 제목을 입력하세요");
		System.out.print(">> ");
		String title = br.readLine();
		
		System.out.println("수정할 노래의 가수를 입력하세요");
		System.out.print(">> ");
		String artist = br.readLine();
		
		Song song = service.songExist(title, artist);
		
		System.out.println("------------------------------");
		System.out.println("노래명 : " + song.getTitle());
		System.out.println("가수 : " + song.getArtist());
		System.out.println("좋아요 : " + song.getLike());
		
		System.out.println("위 노래에서 변경할 내용을 선택해 주세요");
		
		int input = 0;
		
		String str = null;
		do {
			System.out.println("1. 노래명");
			System.out.println("2. 가수");
			System.out.println("3. 좋아요");
			
			System.out.print(">> ");
			input = Integer.parseInt(br.readLine());
			
			switch(input) {
			case 1 : str = "노래명을"; break;
			case 2 : str = "가수를"; break;
			case 3 : str = "좋아요 수를"; break;
			default : 
				System.out.println("유효하지 않습니다 다시 입력해 주세요"); 
				input = 0;
				break;
			}
			
		} while (input == 0);
		
		System.out.println(str + " 입력해 주세요");
		System.out.print(">> ");
		String updateDate = br.readLine();
		
		Song song2 = service.songUpdate(input, song, updateDate);
		
		System.out.println("------------------------------");
		System.out.println("노래명 : " + song2.getTitle());
		System.out.println("가수 : " + song2.getArtist());
		System.out.println("좋아요 : " + song2.getLike());
		System.out.println("위와 같이 수정되었습니다.");
		System.out.println("------------------------------");
		
	}
	
	
	public void songLyricsUpload() throws Exception{
		System.out.println("******* 7. 노래 가사 전체 업로드 *******");
		
		service.songLyricsUpload();
	}
}














