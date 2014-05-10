package com.bogdanov;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

public class Graphics extends View {
	
	private Bitmap mBitmap;
	private Canvas mCanvas;
	private Paint paint, mBitmapPaint;
	private float canvasSize;
	private Bitmap droidBitmap;
	
	private Field gField;
	
	public Graphics(Context context, AttributeSet attrs) {
		super(context, attrs);
		//Field gameField = new Field();
		canvasSize = (int)convertDpToPixel(300, context);
		
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
		canvas.drawBitmap(mBitmap, 0, 0, mBitmapPaint);
		canvas.drawBitmap(droidBitmap, 0, 0, null);
	}
	
	public float convertDpToPixel(float dp, Context context) {
		Resources resources = context.getResources();
		DisplayMetrics metrics = resources.getDisplayMetrics();
		return dp * (metrics.densityDpi/160f);
	}
	
	//TODO: make realization of methods below
	
	public void drawGameField(Field field) {
	//	RectF rect = new RectF(float left, float top, float right, float bottom);
		
	}
	
	public void drawCellOfField(Cell cell) {
		
	}
	
	//TODO: in initGUI() do initialization of all gum-dimensions (cellSize, cellDelta)
	public void initGUI() {
		
	}
	
}
