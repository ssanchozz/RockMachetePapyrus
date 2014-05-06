package com.bogdanov;

public class Cell {
	
	public static final String FRIEND = "friend";
	public static final String ENEMY = "enemy";
	private Fighter fighter;

	public Cell() {
		createFighter();
	}
	
	public void createFighter() {
		fighter = new Fighter(new Weapon("Machete"), FRIEND);
		//TODO: create types of Weapon
	}
	
	public Fighter getFighter() {
		return fighter;
	}

	public void setFighter(Fighter fighter) {
		this.fighter = fighter;
	}
	
}
