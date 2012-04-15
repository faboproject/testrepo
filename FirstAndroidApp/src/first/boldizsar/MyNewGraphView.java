package first.boldizsar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

public class MyNewGraphView extends View {
	
	Bitmap greenBall;

	public MyNewGraphView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		greenBall = BitmapFactory.decodeResource(getResources(), R.drawable.green_ball);
	}

	/* (non-Javadoc)
	 * @see android.view.View#onDraw(android.graphics.Canvas)
	 */
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		canvas.drawColor(Color.CYAN);
		canvas.drawBitmap(greenBall, canvas.getWidth()/2-greenBall.getWidth()/2, canvas.getHeight()/2, null);
	}
	
	
}
