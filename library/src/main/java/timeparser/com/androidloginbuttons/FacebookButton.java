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
 * Created by Shaishav on 8/15/2016.
 */
public class FacebookButton extends BaseButton {

    public FacebookButton(Context context, AttributeSet attrs) {
        super(context,attrs,R.color.facebook,R.drawable.fb_logo);
    }

    public FacebookButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs,defStyle,R.color.facebook,R.drawable.fb_logo);
    }

    public FacebookButton(Context context) {
        super(context);
    }

}
