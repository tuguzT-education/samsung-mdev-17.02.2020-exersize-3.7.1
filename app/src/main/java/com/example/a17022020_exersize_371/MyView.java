package com.example.a17022020_exersize_371;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @SuppressLint("DrawAllocation")
    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStrokeWidth(4);

        canvas.drawColor(Color.rgb(129, 228, 254));

        paint.setColor(Color.rgb(0, 128, 0));
        canvas.drawRect(0, 1000, 2000, 2000, paint);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawLine(0, 1000, 2000, 1000, paint);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        paint.setColor(Color.rgb(128, 64, 0));
        canvas.drawRect(870, 1000, 930, 1200, paint);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(870, 1000, 930, 1200, paint);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        paint.setColor(Color.rgb(0, 200, 0));
        canvas.drawOval(new RectF(800, 700, 1000, 1100), paint);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawOval(new RectF(800, 700, 1000, 1100), paint);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        paint.setColor(Color.GRAY);
        canvas.drawRect(730, 1350, 780, 1450, paint);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(730, 1350, 780, 1450, paint);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        paint.setColor(Color.GRAY);
        canvas.drawRect(920, 1350, 970, 1450, paint);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(920, 1350, 970, 1450, paint);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        paint.setColor(Color.GRAY);
        canvas.drawRect(700, 1350, 1000, 1400, paint);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(700, 1350, 1000, 1400, paint);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        paint.setColor(Color.YELLOW);
        canvas.drawCircle(1080, 0, 200, paint);

        paint.setColor(Color.rgb(128, 64, 0));
        canvas.drawRect(100, 900, 600, 1400, paint);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(100, 900, 600, 1400, paint);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        paint.setColor(Color.rgb(128, 64, 0));
        Path path = new Path();
        path.moveTo(100, 900);
        path.lineTo(600, 900);
        path.lineTo(350, 600);
        path.lineTo(100, 900);
        canvas.drawPath(path, paint);

        paint.setColor(Color.BLACK);
        canvas.drawLine(100, 900, 350, 600, paint);
        canvas.drawLine(350, 600, 600, 900, paint);

        paint.setStyle(Paint.Style.STROKE);

        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(2);
        drawPattern45Circle(canvas,350, 780, 75, paint);
        paint.setStrokeWidth(5);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(350, 780, 75, paint);

        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(3);
        drawPattern90(canvas, new Rect(150, 1000, 300, 1200), paint);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);
        canvas.drawRect(150, 1000, 300, 1200, paint);

        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2);
        drawPattern45Rect(canvas, new Rect(350, 1000, 550, 1397), paint);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);
        canvas.drawRect(350, 1000, 550, 1397, paint);

        canvas.drawLine(100, 900, 600, 900, paint);
    }

    void drawPattern45Rect(final Canvas canvas, final Rect rect, final Paint paint) {
        for (int x = rect.right; x > rect.left - rect.height(); x -= 30) {
            int x1 = x, y1 = rect.top;
            while (x1 < rect.left) {
                x1++;
                y1++;
            }
            int x2 = x1, y2 = y1;
            while (x2 < rect.right && y2 < rect.bottom) {
                x2++;
                y2++;
            }
            canvas.drawLine(x1, y1, x2, y2, paint);
        }
    }

    void drawPattern45Circle(final Canvas canvas, final int centerX, final int centerY,
                             final int radius, final Paint paint) {
        for (int x = centerX + radius; x > centerX - 3 * radius; x -= 30) {
            int x1 = x, y1 = centerY - radius;
            while ((x1 - centerX) * (x1 - centerX) + (y1 - centerY) * (y1 - centerY) > radius * radius) {
                x1++;
                y1++;
            }
            int x2 = x1, y2 = y1;
            while ((x2 - centerX) * (x2 - centerX) + (y2 - centerY) * (y2 - centerY) < radius * radius) {
                x2++;
                y2++;
            }
            canvas.drawLine(x1, y1, x2, y2, paint);
        }
    }

    void drawPattern90(final Canvas canvas, final Rect rect, final Paint paint) {
        for (int x = rect.left; x < rect.right; x += 30) {
            canvas.drawLine(x, rect.top, x, rect.bottom, paint);
        }
        for (int y = rect.top; y < rect.bottom; y += 30) {
            canvas.drawLine(rect.left, y, rect.right, y, paint);
        }
    }
}
