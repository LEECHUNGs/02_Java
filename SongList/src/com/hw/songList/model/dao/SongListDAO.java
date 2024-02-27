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

	/** 노래 정보를 입력받아 저장하는 메서드
	 * @param like 
	 * @param artist 
	 * @param title 
	 * @return 노래명이 같은 객체가 가수명도 같을 경우 -1, 그렇지 않을 때, 가사를 찾았는데 없을 경우 0, 가사가 있으면 1을 리턴
	 */
	int songAdd(String title, String artist, int like) throws Exception;
	
	/** songList 안에 Song 객체를 저장하는 메서드
	 * @throws Exception
	 */
	void saveFile() throws Exception;

	/** 입력받은 노래 제목과 일치하는 객체를 삭제
	 * @param title
	 * @return 삭제된 객체 리턴, 검색된게 없으면 null 리턴
	 */
	Song songDelete(String title) throws Exception;
}
