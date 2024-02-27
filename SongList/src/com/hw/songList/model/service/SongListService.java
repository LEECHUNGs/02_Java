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
	Song songLyrics(String str);
	
	
}
