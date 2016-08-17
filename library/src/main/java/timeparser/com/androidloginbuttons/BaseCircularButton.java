package timeparser.com.androidloginbuttons;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;

/**
 * Created by Shaishav on 8/17/2016.
 */
public class BaseCircularButton extends FloatingActionButton {

    private Bitmap mIcon;
    private Paint mPaint;
    private Rect mSrcRect;
    private int mIconSize;
    private boolean mTransparentBackground;

    public BaseCircularButton(Context context) {
        super(context);
    }

    public BaseCircularButton(Context context, AttributeSet attrs,int color,int logo) {
        super(context, attrs);
        init(context, attrs,logo);
        setStyle(color);
    }

    public BaseCircularButton(Context context, AttributeSet attrs, int defStyleAttr,int color,int logo) {
        super(context, attrs, defStyleAttr);
        init(context, attrs,logo);
        setStyle(color);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int shift = (mIconSize) / 2;

        canvas.save();
        canvas.translate(shift, 0);

        super.onDraw(canvas);

        if (mIcon != null) {
            float textWidth = 0;
            int left = (int)((getWidth() / 2f) - (textWidth / 2f) - mIconSize);
            int top = getHeight()/2 - mIconSize/2;

            Rect destRect = new Rect(left, top, left + mIconSize, top + mIconSize);
            canvas.drawBitmap(mIcon, mSrcRect, destRect, mPaint);
        }

        canvas.restore();
    }

    private void init(Context context, AttributeSet attrs,int logo) {
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.IconButton);
        mIcon = Utils.drawableToBitmap(getResources().getDrawable(logo));
        mIconSize = (int)Utils.convertDpToPixel(20,context);
        mTransparentBackground = false;

        for (int i = 0; i < array.getIndexCount(); ++i) {
            int attr = array.getIndex(i);
            if(attr == R.styleable.IconButton_iconSize){
                mIconSize = array.getDimensionPixelSize(attr, (int)Utils.convertDpToPixel(20,context));
            }
            if(attr == R.styleable.IconButton_transparentBackground){
                mTransparentBackground = true;
            }
        }

        array.recycle();

        //If we didn't supply an icon in the XML
        if(mIcon != null){
            mPaint = new Paint();
            mSrcRect = new Rect(0, 0, mIcon.getWidth(), mIcon.getHeight());
        }
    }

    private void setStyle(int color){
        setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(color)));
    }

}
