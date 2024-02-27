package com.hw.songList.model.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.hw.songList.model.dto.Song;

public interface SongListDAO {
	
	/** 입력된 파일을 읽어오는 메소드
	 * @param txt
	 * @return 입력된 파일이 존재하면 파일 내용을 리턴, 없다면 null을 리턴
	 */
	String lyricsInput(String txt) throws FileNotFoundException, IOException;

	/** songList를 리턴하는 메소드
	 * @return songList
	 */
	List<Song> sortSongList();

	/** input 값에 따라 각각 노래의 제목, 가수명, 가사 속에 일치하는 문자열이 있는 노래 리스트를 반환
	 * @param str 
	 * @param input 
	 * @return 검색된 노래가 있으면 리스트 리턴, 없으면 null 리턴
	 */
	List<Song> searchSong(int input, String str);

	/** 입력된 검색어와 일치하는 제목의 Song 객체를 리턴하는 메서드
	 * @param str
	 * @return 일치하는 Song 객체, 없다면 null
	 */
	Song songLyrics(String str);
}
