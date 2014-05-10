package com.bogdanov;

public class Cell {
	
	public static final String FRIEND = "friend";
	public static final String ENEMY = "enemy";
	
	private Fighter fighter;
	
	private int cellSize;
	
	private int CoordX;
	private int Coordy;

	public void createFighter(Weapon weapon, String warSide) {
		if (warSide != null) {
			fighter = new Fighter(new Weapon("Machete"), FRIEND);
		}	
		//TODO: create types of Weapon
	}
	
	public Fighter getFighter() {
		return fighter;
	}

	public void setFighter(Fighter fighter) {
		this.fighter = fighter;
	}
	
}
