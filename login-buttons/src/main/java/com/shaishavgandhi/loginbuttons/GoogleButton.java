package com.shaishavgandhi.loginbuttons;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;

public final class GoogleButton extends BaseButton {
    private final Paint linePaint = new Paint();

    public GoogleButton(Context context, AttributeSet attrs) {
        super(context, attrs, android.R.color.white, R.drawable.google_logo);
        setDefaults();
    }

    public GoogleButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle, android.R.color.white, R.drawable.google_logo);
        setDefaults();
    }

    public GoogleButton(Context context) {
        super(context);
        setDefaults();
    }

    private void setDefaults() {
        setTextColor(Color.parseColor("#FF586979"));
        setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        setTypeface(Typeface.DEFAULT);

        linePaint.setColor(Color.parseColor("#EBECED"));
        linePaint.setStrokeWidth(Utils.convertDpToPixel(1, getContext()));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int iconSize = (int) Utils.convertDpToPixel(getmIconSize(), getContext());

        int top = getHeight() / 2 - iconSize / 2;
        int bottom = getHeight() / 2 + iconSize / 2;

        canvas.save();

        canvas.translate(iconSize + getPaddingLeft(), 0);
        canvas.drawLine(0, top, 0, bottom, linePaint);

        canvas.restore();
    }
}