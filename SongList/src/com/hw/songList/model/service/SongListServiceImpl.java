package com.hw.songList.model.service;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.hw.songList.model.dao.SongListDAO;
import com.hw.songList.model.dao.SongListDAOImpl;
import com.hw.songList.model.dto.Song;

public class SongListServiceImpl implements SongListService{
	private SongListDAO dao = null;
	
	public SongListServiceImpl() throws ClassNotFoundException, IOException{
		dao = new SongListDAOImpl();
		
	}
	
	/* 노래 리스트를 좋아요 순으로 정렬 */
	@Override
	public List<Song> sortSongList() {
		List<Song> songList = dao.sortSongList();
		
		Collections.sort(songList, Comparator.comparing(Song::getLike).reversed());
		
		return songList;
	}

	@Override
	public List<Song> searchSong(int input, String str) {
		List<Song> searchSongList = dao.searchSong(input, str);
		
		return searchSongList;
	}

	@Override
	public String songLyrics(String str) {
		Song song = dao.songLyrics(str);
		
		if(song == null) return "해당 노래가 존재하지 않습니다.";
		
		if(song.getLyrics() != null) return song.getLyrics();
		else return "가사가 등록되지 않았습니다. 가사를 등록해 주세요.";
	}

	@Override
	public int songAdd(String title, String artist, int like) throws Exception{
		
		return dao.songAdd(title, artist, like);
	}

	@Override
	public Song songDelete(String title) throws Exception{
		
		return dao.songDelete(title);
	}
}
