package com.hw.songList.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.hw.songList.model.dto.Song;

public class SongListDAOImpl implements SongListDAO{
	private final String FOLDER_PATH = "../../songListData";
	private final String FILE_PATH = "../../songListData/SongList.dat";
	
	// 입/출력 기반 스트림
	private FileInputStream fis = null;
	
	// 입/출력 보조 스트림
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	
	private List<Song> songList;
	
	public SongListDAOImpl() throws FileNotFoundException, IOException, ClassNotFoundException{
		File file = new File(FILE_PATH);
		
		if(file.exists()) {
			try {
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
				
				songList = (ArrayList<Song>)ois.readObject();
				
			} finally {
				
				if(ois != null) ois.close();
			}	
		}
		else {
			File directory = new File(FOLDER_PATH);
			if(!directory.exists()) directory.mkdirs(); // 폴더 없으면 생성
			
			songList = new ArrayList<Song>();
			
			String a = lyricsInput("사랑은 늘 도망가");
			songList.add(new Song("사랑은 늘 도망가", "임영웅", 20, lyricsInput("사랑은 늘 도망가")));
			songList.add(new Song("사랑은 은하수 다방에서", "10cm", 17, lyricsInput("사랑은 은하수 다방에서")));
			songList.add(new Song("폰서트", "10cm", 18, lyricsInput("폰서트")));
			songList.add(new Song("후라이의 꿈", "AKMU", 25, lyricsInput("후라이의 꿈")));
			
			try {
				oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
				oos.writeObject(songList); 
				
			} finally {
				
				if(ois != null) oos.close(); 
			}
			
			System.out.println("SongList 파일 생성 완료");
		}
	}

	@Override
	public String lyricsInput(String txt) throws FileNotFoundException, IOException{
		StringBuilder sb = new StringBuilder();
		
		sb.append(FOLDER_PATH);
		sb.append("/");
		sb.append(txt);
		sb.append(".txt");
		
		File file = new File(sb.toString());
		
		if(!file.exists()) {
			return null;
			
		}
			
		fis = new FileInputStream(file);
		
		String result = new String(fis.readAllBytes());
		
		return result;
	}

	@Override
	public List<Song> sortSongList() {
		return songList;
		
	}

	@Override
	public List<Song> searchSong(int input, String str) {
		List<Song> searchSongList = new ArrayList<Song>();
		String searchStr = null;
		for(Song song : songList) {
			switch(input) {
			case 1 : searchStr = song.getTitle(); break;
			case 2 : searchStr = song.getArtist(); break;
			case 3 : searchStr = song.getLyrics(); break;
			
			}
			
			if(searchStr == null) continue;
			
			if(searchStr.indexOf(str) != -1) {
				searchSongList.add(song);
				
			}
		}
		
		if(searchSongList.size() == 0) return null;
		
		return searchSongList;
	}

	@Override
	public Song songLyrics(String str) {
		Song searchSong = null;
		
		for(Song song : songList) {
			if(str.equals(song.getTitle())) {
				searchSong = song;
				break;
				
			}
		}
		
		return searchSong;
	}

	@Override
	public int songAdd(String title, String artist, int like) throws Exception{
		
		for(Song s : songList) {
			if(title.equals(s.getTitle()) && artist.equals(s.getArtist())) {
				return -1;
				
			}
		}
		
		String lyrics = null;
		if((lyrics = lyricsInput(title)) != null) {
			Song song = new Song(title, artist, like, lyricsInput(title));			
			songList.add(song);
			
			saveFile();
			
			return 1;
		}
		else {
			Song song = new Song(title, artist, like, null);						
			songList.add(song);
			
			saveFile();
			
			return 0;
		}
	}
	
	@Override
	public void saveFile() throws Exception{
		try {
			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			oos.writeObject(songList); 
			
		} finally {
			
			oos.close();
		}
		
	}

	@Override
	public Song songDelete(Song song) throws Exception{
		songList.remove(song);
		
		saveFile();
		
		return song;
	}

	@Override
	public void songLyricsUpload() throws Exception{
		for(Song s : songList) {
			
			s.setLyrics(lyricsInput(s.getTitle()));
		}
		
		saveFile();
		
		System.out.println("업로드 완료");
	}

	@Override
	public Song songExist(String title, String artist) {
		for(Song s : songList) {
			if(title.equals(s.getTitle()) && artist.equals(s.getArtist())) {
				
				return s;
			}
			
		}
		
		return null;
	}

	@Override
	public Song updateTitle(Song song, String updateDate) throws Exception{
		
		song.setTitle(updateDate);
		
		saveFile();
		
		return song;
	}

	@Override
	public Song  updateArtist(Song song, String updateDate) throws Exception{
		
		song.setArtist(updateDate);
		
		saveFile();
		
		return song;
	}

	@Override
	public Song updateLike(Song song, int like) throws Exception{
		
		song.setLike(like);
		
		saveFile();
		
		return song;
	}
	
	
	
}
