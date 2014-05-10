package com.bogdanov;

public class Weapon {
	
	public static final String MACHETE = "machete";
	
	private String weaponType;
	
	public Weapon (String weaponType) {
		this.weaponType = weaponType;
	}
	
	public String getWeaponType() {
		return this.weaponType;
	}
	
}
