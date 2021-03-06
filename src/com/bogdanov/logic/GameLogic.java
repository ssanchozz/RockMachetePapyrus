package com.bogdanov.logic;

public class GameLogic {
	
	private Field gfield;
	private Cell[][] fieldOfCells;
	
	public void createField() {
		gfield = new Field();
		fieldOfCells = gfield.getFieldOfCells();
		
		for(int i=0; i<Field.FIELD_WIDTH; i++) {
			for(int j=0; j<Field.FIELD_HEIGHT; j++) {
				fieldOfCells[i][j].createFighter(getWarSide(i, j));
			}
		}
	}
	
	String getWarSide(int xCoord, int yCoord) {
		if (yCoord < Field.FIGHTERS_LINES_COUNT) {
			return Fighter.ENEMY;
		} else 
	    if (yCoord > fieldOfCells.length - Field.FIGHTERS_LINES_COUNT) {
	    	return Fighter.FRIEND;
	    }
		return null;
	}	

	public Field getGfield() {
		return gfield;
	}

	public void setGfield(Field gfield) {
		this.gfield = gfield;
	}	

}
