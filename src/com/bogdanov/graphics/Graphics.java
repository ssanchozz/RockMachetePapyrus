package com.bogdanov.graphics;

import com.bogdanov.R;
import com.bogdanov.R.drawable;
import com.bogdanov.logic.Cell;
import com.bogdanov.logic.Field;
import com.bogdanov.logic.GameLogic;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;

public class Graphics extends View {
	
	public static final int GAP_FACTOR = 10; 
	
	private Bitmap mBitmap;
	private Canvas mCanvas;
	private Paint paint, mBitmapPaint;
	private float canvasSize;
	private Bitmap droidBitmap;
	private GameLogic gl;
	
	private int cellSize;
	private int cellGap;
	
	private Field gField;
	
	public Graphics(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		gl = new GameLogic();
		gl.createField();
		
		canvasSize = (int)convertDpToPixel(300, context);
		
		cellGap = (int) Math.abs((canvasSize/Field.FIELD_WIDTH)*(GAP_FACTOR/100));
		cellSize = (int) (canvasSize/Field.FIELD_WIDTH - cellGap);
		
		Log.i("Field Width = ", String.valueOf(cellSize*Field.FIELD_WIDTH));
		
		mBitmap = Bitmap.createBitmap((int) canvasSize, (int) canvasSize, Bitmap.Config.ARGB_8888);
		droidBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.my_droid); 
		mCanvas = new Canvas(mBitmap);
		mBitmapPaint = new Paint(Paint.DITHER_FLAG);
		
		paint = new Paint();
		paint.setAntiAlias(true);
		paint.setDither(true);
		paint.setColor(0xffff0505);
		paint.setStrokeWidth(5f);
		paint.setStyle(Paint.Style.STROKE);
		paint.setStrokeJoin(Paint.Join.ROUND);
		paint.setStrokeCap(Paint.Cap.ROUND);
		
		for (int x=0; x<Field.FIELD_WIDTH + 1; x++)
			mCanvas.drawLine((float)x * canvasSize / Field.FIELD_WIDTH, 0, (float)x * canvasSize / Field.FIELD_WIDTH, canvasSize, paint);
		for (int y=0; y<Field.FIELD_HEIGHT + 1; y++)
			mCanvas.drawLine(0, (float)y * canvasSize / Field.FIELD_HEIGHT, canvasSize, (float)y * canvasSize / Field.FIELD_HEIGHT, paint);
		
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		//canvas.drawBitmap(mBitmap, 0, 0, mBitmapPaint);
		//canvas.drawBitmap(droidBitmap, 0, 0, null);
	//	RectF rect = new RectF(0,0,100,100);
	//	canvas.drawBitmap(droidBitmap, null, rect, null);
		Field field = gl.getGfield();
		
		for(int i=0; i<Field.FIELD_WIDTH; i++) {
			for(int j=0; j<Field.FIELD_HEIGHT; j++) {
				field.getFieldOfCells()[i][j].setCoordX(i*(cellSize + cellGap));
				field.getFieldOfCells()[i][j].setCoordY(j*(cellSize + cellGap));
			}
		}
		
		drawGameField(field, canvas);
	}
	
	public float convertDpToPixel(float dp, Context context) {
		Resources resources = context.getResources();
		DisplayMetrics metrics = resources.getDisplayMetrics();
		
		return dp * (metrics.densityDpi/160f);
	}
	
	//TODO: make realization of methods below
	
	public void drawGameField(Field field, Canvas canvas) {
	//	RectF rect = new RectF(float left, float top, float right, float bottom);
		field.setCellsDelta(cellSize + cellGap);
		for(int i=0; i<Field.FIELD_WIDTH; i++) {
			for(int j=0; j<Field.FIELD_HEIGHT; j++) {
				Cell curCell = field.getFieldOfCells()[i][j];
				RectF rect = new RectF(curCell.getCoordX(), curCell.getCoordY(), 
						curCell.getCoordX() + cellSize, curCell.getCoordY() + cellSize);
				canvas.drawBitmap(droidBitmap, null, rect, null);
			}
		}
		
	}
	
	public void drawCellOfField(Cell cell) {
		
	}
	
}
