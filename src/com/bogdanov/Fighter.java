package com.bogdanov;

public class Fighter {
	
	public static final String ENEMY = "enemy";
	public static final String FRIEND = "friend";
	
	private Weapon currentWeapon;
	private String warSide;
	
	public Fighter(Weapon currentWeapon, String warSide) {
		this.currentWeapon = currentWeapon;
	}
	
	public Weapon getCurWeapon() {
		return this.currentWeapon;
	}

	public String getWarSide() {
		return this.warSide;
	}

	public void setWarSide(String warSide) {
		this.warSide = warSide;
	}
	
}
