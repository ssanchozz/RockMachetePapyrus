package com.bogdanov;

public class Field {
	
	public static final int FIELD_WIDTH = 7;
	public static final int FIELD_HEIGHT = 7;
	
	Cell[][] fieldOfCells = new Cell[FIELD_WIDTH][FIELD_HEIGHT];
	
	public Field() {
		for(int i=0; i<FIELD_WIDTH; i++) {
			for(int j=0; j<FIELD_HEIGHT; j++) {
				fieldOfCells[i][j] = new Cell();
			}
		}
	}
	
	public Cell[][] getFieldOfCells() {
		return fieldOfCells;
	}

	public void setFieldOfCells(Cell[][] fieldOfCells) {
		this.fieldOfCells = fieldOfCells;
	}

}
