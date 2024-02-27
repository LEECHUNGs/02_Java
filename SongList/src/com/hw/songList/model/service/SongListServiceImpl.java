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
	public Song songLyrics(String str) {
		Song song = dao.songLyrics(str);
		
		return null;
	}
}
