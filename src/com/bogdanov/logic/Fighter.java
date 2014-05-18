package com.bogdanov.logic;

public class Fighter {
	
	public static final String ENEMY = "enemy";
	public static final String FRIEND = "friend";
	
	private Armor currentArmor;
	private String warSide;
	
	public Fighter(Armor currentArmor, String warSide) {
		this.currentArmor = currentArmor;
	}
	
	public Armor getCurWeapon() {
		return this.currentArmor;
	}

	public String getWarSide() {
		return this.warSide;
	}

	public void setWarSide(String warSide) {
		this.warSide = warSide;
	}
	
}
