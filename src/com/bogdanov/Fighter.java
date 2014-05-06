package com.bogdanov;

public class Fighter {
	
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
