package timeparser.com.androidloginbuttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Shaishav on 8/16/2016.
 */
public class BaseButton extends Button {

    private Bitmap mIcon;
    private Paint mPaint;
    private Rect mSrcRect;
    private int mIconPadding;
    private int mIconSize;
    private int mRoundedCornerRadius;
    private boolean mIconCenterAligned;
    private boolean mRoundedCorner;

    public BaseButton(Context context) {
        super(context);
    }

    public BaseButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseButton(Context context, AttributeSet attrs, int defStyleAttr,int color,int logo) {
        super(context, attrs, defStyleAttr);
        init(context,attrs,logo);
        setStyle(color,context);
    }

    public BaseButton(Context context, AttributeSet attrs, int color, int logo){
        super(context,attrs);
        init(context, attrs,logo);
        setStyle(color,context);

    }

    private void setStyle(int color, Context context){
        if(mRoundedCorner){
            setBackgroundResource(R.drawable.round_corner);
            GradientDrawable drawable = (GradientDrawable)getBackground().mutate();
            drawable.setColor(getResources().getColor(color));
            drawable.setCornerRadius(mRoundedCornerRadius);
            drawable.invalidateSelf();
        }
        else
            setBackgroundColor(getResources().getColor(color));

        setPadding((int)Utils.convertDpToPixel(30,context),0,(int)Utils.convertDpToPixel(30,context),0);

        setTextColor(Color.WHITE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int shift = (mIconSize + mIconPadding) / 2;

        canvas.save();
        canvas.translate(shift, 0);

        super.onDraw(canvas);

        if (mIcon != null) {
            float textWidth = getPaint().measureText((String)getText());
            int left = (int)((getWidth() / 2f) - (textWidth / 2f) - mIconSize - mIconPadding);
            int top = getHeight()/2 - mIconSize/2;

            if(!mIconCenterAligned)
                left = 0;

            Rect destRect = new Rect(left, top, left + mIconSize, top + mIconSize);
            canvas.drawBitmap(mIcon, mSrcRect, destRect, mPaint);
        }

        canvas.restore();
    }

    private void init(Context context, AttributeSet attrs, int logo) {
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.IconButton);
        mIcon = Utils.drawableToBitmap(getResources().getDrawable(logo));
        mIconSize = (int)Utils.convertDpToPixel(20,context);
        mIconCenterAligned = true;
        mRoundedCorner = false;
        mRoundedCornerRadius = (int)Utils.convertDpToPixel(40,context);

        if(attrs.getAttributeValue("http://schemas.android.com/apk/res/android","text")!=null){
            mIconPadding = (int)Utils.convertDpToPixel(20,context);
        }

        for (int i = 0; i < array.getIndexCount(); ++i) {
            int attr = array.getIndex(i);
            if(attr == R.styleable.IconButton_iconPadding){
                mIconPadding = array.getDimensionPixelSize(attr, (int)Utils.convertDpToPixel(20,context));
            }
            if(attr == R.styleable.IconButton_iconCenterAligned){
                mIconCenterAligned = array.getBoolean(attr,true);
            }
            if(attr == R.styleable.IconButton_iconSize) {
                mIconSize = array.getDimensionPixelSize(attr, (int) Utils.convertDpToPixel(20, context));
            }
            if(attr == R.styleable.IconButton_roundedCorner){
                mRoundedCorner = array.getBoolean(attr,false);
            }
            if(attr == R.styleable.IconButton_roundedCornerRadius){
                mRoundedCornerRadius = array.getDimensionPixelSize(attr,(int)Utils.convertDpToPixel(40,context));
            }
        }

        array.recycle();

        //If we didn't supply an icon in the XML
        if(mIcon != null){
            mPaint = new Paint();
            mSrcRect = new Rect(0, 0, mIcon.getWidth(), mIcon.getHeight());
        }
    }
}
