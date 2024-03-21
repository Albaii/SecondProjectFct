package com.fct.models;

import com.fct.impl.PlayerIMPL;

public class Priest extends Player implements PlayerIMPL{
	

	public Priest(int tag, String username) {
		super(tag, username);
	}
	
	public Priest() {
		
	}

	public void attack() {
		System.out.println("Priest is attacking");
		
	}

	public void defense() {
		System.out.println("Priest is defending");
		
	}

}
