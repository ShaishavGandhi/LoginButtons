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
public class FacebookCircularButton extends BaseCircularButton {

    public FacebookCircularButton(Context context) {
        super(context);
    }

    public FacebookCircularButton(Context context, AttributeSet attrs) {
        super(context, attrs,R.color.facebook,R.drawable.fb_logo);

    }

    public FacebookCircularButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr,R.color.facebook,R.drawable.fb_logo);
    }


}
