package com.hw.songList.model.service;

import java.util.List;

import com.hw.songList.model.dto.Song;

public interface SongListService {

	/** 좋아요 순으로 정렬된 노래들을 리턴하는 메소드
	 * @return 정렬된 노래 리스트
	 */
	List<Song> sortSongList();

	/** DAO에서 리턴받은 노래 리스트를 반환
	 * @param input
	 * @param str
	 * @return 일치하는 노래가 있으면 리스트 리턴, 없으면 null 리턴
	 */
	List<Song> searchSong(int input, String str);

	/** 입력받은 노래 제목으로 검색된 노래를 리턴
	 * @param str
	 * @return 검색된 노래가 있으면 리턴, 없으면 null 리턴
	 */
	String songLyrics(String str);

	/** 입력된 객체를 삭제하는 메서드
	 * @param title
	 * @return 객체가 있으면 Song 리턴, 없으면 null 리턴
	 */
	Song songDelete(Song song) throws Exception;

	/** 모든 노래의 가사를 업로드하는 메서드
	 */
	void songLyricsUpload() throws Exception;

	/** 입력된 제목과 가수를 가진 객체를 검색하는 메서드
	 * @param title 
	 */
	Song songExist(String title, String artist);

	/** 1이면 노래 제목을, 2면 가수를, 3이면 노래의 좋아요 숫자를 변경하는 메서드
	 * @param input
	 * @param song
	 * @param updateDate 
	 * @return
	 */
	Song songUpdate(int input, Song song, String updateDate) throws Exception;
	
	/** 입력받은 노래 데이터를 songList에 저장
	 * @param title
	 * @param artist
	 * @param like
	 * @return 노래명이 같은 객체가 가수명도 같을 경우 -1, 그렇지 않을 때, 가사를 찾았는데 없을 경우 0, 가사가 있으면 1을 리턴
	 */
	int songAdd(String title, String artist, int like) throws Exception;
	
}
