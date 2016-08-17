package timeparser.com.androidloginbuttons;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;

/**
 * Created by Shaishav on 8/15/2016.
 */
public class FacebookCircularButton extends FloatingActionButton {

    private Bitmap mIcon;
    private Paint mPaint;
    private Rect mSrcRect;
    private int mIconPadding;
    private int mIconSize;

    public FacebookCircularButton(Context context) {
        super(context);
    }

    public FacebookCircularButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
        setStyle(R.color.facebook);

    }

    public FacebookCircularButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void setStyle(int color){
        setBackgroundTintList(ColorStateList.valueOf((getResources().getColor(color))));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int shift = (mIconSize + mIconPadding) / 2;

        canvas.save();
        canvas.translate(shift, 0);

        super.onDraw(canvas);

        if (mIcon != null) {
            float textWidth = 0;
            int left = (int)((getWidth() / 2f) - (textWidth / 2f) - mIconSize - mIconPadding);
            int top = getHeight()/2 - mIconSize/2;

            Rect destRect = new Rect(left, top, left + mIconSize, top + mIconSize);
            canvas.drawBitmap(mIcon, mSrcRect, destRect, mPaint);
        }

        canvas.restore();
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.IconButton);
        mIcon = Utils.drawableToBitmap(getResources().getDrawable(R.drawable.fb_logo));
        mIconSize = (int)Utils.convertDpToPixel(20,context);
        if(attrs.getAttributeValue("http://schemas.android.com/apk/res/android","text")!=null){
            mIconPadding = (int)Utils.convertDpToPixel(20,context);
        }

        for (int i = 0; i < array.getIndexCount(); ++i) {
            int attr = array.getIndex(i);
            if(attr == R.styleable.IconButton_iconPadding){
                mIconPadding = array.getDimensionPixelSize(attr, (int)Utils.convertDpToPixel(20,context));
            }
            mIconSize = array.getDimensionPixelSize(attr, (int)Utils.convertDpToPixel(20,context));
        }

        array.recycle();

        //If we didn't supply an icon in the XML
        if(mIcon != null){
            mPaint = new Paint();
            mSrcRect = new Rect(0, 0, mIcon.getWidth(), mIcon.getHeight());
        }
    }

}
