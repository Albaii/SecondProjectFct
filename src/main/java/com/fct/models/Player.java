package com.fct.models;

import com.fct.impl.PlayerIMPL;

public class Player {

	private int tag;
	private String username;
	
	PlayerIMPL playerOne;

	public void setPlayer(PlayerIMPL player) {
		this.playerOne = player;
	}
	
	public void play() {
		System.out.println("Bievenido");
		playerOne.attack();
	}

	public Player(int tag, String username) {
		this.tag = tag;
		this.username = username;
	}

	public Player() {
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
