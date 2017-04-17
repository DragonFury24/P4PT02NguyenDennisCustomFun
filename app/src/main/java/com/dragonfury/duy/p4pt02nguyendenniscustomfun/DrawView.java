package com.dragonfury.duy.p4pt02nguyendenniscustomfun;

import android.content.Context;
import android.graphics.*;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by 1383504 on 1/26/2017.
 */
public class DrawView extends View {
    public DrawView(Context context) {
        super(context);
    }

    Paint nam = new Paint();
    float x=0, y=0;
    RectF heartRectF0 = new RectF(0, 0, 350, 315);
    RectF heartRectF1 = new RectF(0, 0, 350, 315);
    RectF heartRectF2 = new RectF(0, 0, 350, 315);
    RectF heartbeatRectF0 = new RectF(0, 0, 350, 315);
    int heartBitmapInt0 = 0;
    int heartBitmapInt1 = 0;
    int heartBitmapInt2 = 0;
    int heartbeatInt0 = 0;
    Bitmap heartBitmap0 = BitmapFactory.decodeResource(getResources(), R.drawable.heart);
    Bitmap heartBitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.heart);
    Bitmap heartBitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.heart);
    Bitmap heartbeatBitmap0 = BitmapFactory.decodeResource(getResources(), R.drawable.heartbeat);
//selector =0
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //Dra Text
        nam.setTextSize(100);
        canvas.drawText("Tap the Hearts",(float).1*getWidth(), (float) .2*getHeight(), nam);
        //Draw Initial Hearts
        if (heartBitmapInt0 == 0) {
            canvas.drawBitmap(heartBitmap0, null, heartRectF0, null);
        }
        if (heartBitmapInt1 == 0) {
            canvas.drawBitmap(heartBitmap1, null, heartRectF1, null);
        }
        if (heartBitmapInt2 == 0) {
            canvas.drawBitmap(heartBitmap2, null, heartRectF2, null);
        }
        heartRectF1.offsetTo(getWidth()/2-200, 2*getHeight()/3);
        if (heartBitmapInt0 == 1 && heartBitmapInt1 == 1 && heartBitmapInt2 == 1){
            canvas.drawBitmap(heartbeatBitmap0, null, heartbeatRectF0, null);
        }
        //
        //if rectF contains x,y
            //selector =1


        //if selector ==0
            //do this
        //if selector ==1
            //do this


        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN){
            x = event.getX();
            y = event.getY();
            if (heartRectF0.contains(x, y)) {
                    heartBitmapInt0 = 1;
            }
            if (heartRectF1.contains(x, y)) {
                    heartBitmapInt1 = 1;
            }
            if (heartRectF2.contains(x, y)) {
                    heartBitmapInt2 = 1;
            }


        }
    //touch

        //record x,y
        return super.onTouchEvent(event);

    }
}
