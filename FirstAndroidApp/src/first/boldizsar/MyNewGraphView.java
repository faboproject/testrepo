package first.boldizsar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;

public class MyNewGraphView extends View {
	
	Bitmap greenBall;
	float changingY;
	Typeface font;

	public MyNewGraphView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		greenBall = BitmapFactory.decodeResource(getResources(), R.drawable.green_ball);
		changingY = 0;
		font = Typeface.createFromAsset(context.getAssets(), "Arcade.ttf");
	}

	/* (non-Javadoc)
	 * @see android.view.View#onDraw(android.graphics.Canvas)
	 */
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		canvas.drawColor(Color.LTGRAY);
		
		Paint textPaint = new Paint();
		textPaint.setARGB(90, 10, 10, 10);
		textPaint.setTextAlign(Align.CENTER);
		textPaint.setTextSize(50);
		textPaint.setTypeface(font);
		canvas.drawText("FaboGraph", canvas.getWidth()/2, 200, textPaint);
		
		canvas.drawBitmap(greenBall, canvas.getWidth()/2-greenBall.getWidth()/2, changingY, null);
		if (changingY < canvas.getHeight()) {
			changingY += 15;
		} else {
			changingY = 0;
		}
		
		Rect middleRect = new Rect();
		middleRect.set(0, 100, canvas.getWidth(), 300);
		Paint ourColor = new Paint();
		ourColor.setARGB(60, 30, 30, 30);
		canvas.drawRect(middleRect, ourColor);
		
		invalidate();
	}
	
	
}
