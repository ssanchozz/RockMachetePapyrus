package com.bogdanov.logic;

public class Field {

	public static final int FIELD_WIDTH = 7;
	public static final int FIELD_HEIGHT = 7;
	public static final int FIGHTERS_LINES_COUNT = 2;
	
	private int betweenCellsDelta = 100;
	
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

	public int getCellsDelta() {
		return betweenCellsDelta;
	}

	public void setCellsDelta(int cellsDelta) {
		this.betweenCellsDelta = cellsDelta;
	}
	
}
