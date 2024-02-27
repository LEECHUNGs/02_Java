package com.hw.songList.model.dto;

import java.io.Serializable;

public class Song implements Serializable{
	
	private String title; // 노래 제목
	private String artist; // 가수
	private int like; // 좋아요 수
	private String lyrics; // 노래 가사
	
	public Song() {}

	public Song(String title, String artist, int like, String lyrics) {
		super();
		this.title = title;
		this.artist = artist;
		this.like = like;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}	
}
