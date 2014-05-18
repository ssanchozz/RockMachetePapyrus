package com.bogdanov.logic;

import java.util.Random;

public enum Armor {
	ROCK, MACHETE, PAPYRUS;
	
	public static Armor generateArmor() {
		Random rand = new Random();
		
		switch(rand.nextInt(3)) {
			case 0: return Armor.ROCK; 
			case 1: return Armor.MACHETE;
			case 2: return Armor.PAPYRUS;
		}
		
		return Armor.ROCK;
	}
}
