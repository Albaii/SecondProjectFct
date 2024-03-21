package com.fct.models;

import com.fct.impl.PlayerIMPL;

public class Rogue extends Player implements PlayerIMPL{

	public Rogue(int tag, String username) {
		super(tag, username);
	}
	
	public Rogue() {
		
	}

	public void attack() {
		System.out.println("Rogue is attacking");
		
	}

	public void defense() {
		System.out.println("Rogue is defending");
		
	}

}
