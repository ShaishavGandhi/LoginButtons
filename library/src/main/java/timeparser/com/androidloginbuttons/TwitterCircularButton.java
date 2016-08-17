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
public class TwitterCircularButton extends BaseCircularButton {

    public TwitterCircularButton(Context context) {
        super(context);
    }

    public TwitterCircularButton(Context context, AttributeSet attrs) {
        super(context, attrs,R.color.twitter,R.drawable.twitter_logo);
    }

    public TwitterCircularButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr,R.color.twitter,R.drawable.twitter_logo);
    }

    private void setStyle(int color){
        setBackgroundTintList(ColorStateList.valueOf((getResources().getColor(color))));
    }

}
