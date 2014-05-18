package com.bogdanov.logic;

import java.util.Random;

public class Cell {
	
	public static final String FRIEND = "friend";
	public static final String ENEMY = "enemy";
	
	private Fighter fighter;
	
	private int cellSize;
	
	private int CoordX;
	private int CoordY;
	
	public void createFighter(String warSide) {
		Random rand = new Random();
		fighter = new Fighter(Armor.generateArmor(), rand.nextInt(2) == 0 ? FRIEND : ENEMY);
	}
	
	public Fighter getFighter() {
		return fighter;
	}

	public void setFighter(Fighter fighter) {
		this.fighter = fighter;
	}

	public int getCoordX() {
		return CoordX;
	}

	public void setCoordX(int coordX) {
		CoordX = coordX;
	}

	public int getCoordY() {
		return CoordY;
	}

	public void setCoordY(int coordY) {
		CoordY = coordY;
	}
	
}
