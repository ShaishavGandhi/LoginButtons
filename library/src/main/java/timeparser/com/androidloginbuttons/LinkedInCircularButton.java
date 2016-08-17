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
 * Created by Shaishav on 8/16/2016.
 */
public class LinkedInCircularButton extends BaseCircularButton {

    public LinkedInCircularButton(Context context) {
        super(context);
    }

    public LinkedInCircularButton(Context context, AttributeSet attrs) {
        super(context, attrs,R.color.linkedin,R.drawable.linkedin_logo);
    }

    public LinkedInCircularButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr,R.color.linkedin,R.drawable.linkedin_logo);
    }


}
