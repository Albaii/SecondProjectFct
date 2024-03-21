package com.fct.models;


import com.fct.impl.PlayerIMPL;

public class Mage extends Player implements PlayerIMPL {

	public Mage(int tag, String username) {
		super(tag, username);
	}
	
	public Mage() {
		
	}
	
	public void attack() {
		System.out.println("Mage is attacking");
		
	}

	public void defense() {
		System.out.println("Mage is defending");
		
	}

}
