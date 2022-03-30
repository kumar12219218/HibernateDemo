package com.simplilearn.webapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Song1 {
	//id, name, singer
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String songName;
	
	@Column(name="singer")
	private String singer;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

}
