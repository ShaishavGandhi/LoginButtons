package timeparser.com.loginbuttons;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Shaishav on 8/16/2016.
 */
public class GooglePlusSlantButton extends Button {

    public GooglePlusSlantButton(Context context) {
        super(context);
    }

    public GooglePlusSlantButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTextColor(Color.BLUE);

    }

    public GooglePlusSlantButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas c){
        c.save();
        super.onDraw(c);


//        Paint mInnerPaint = new Paint();
//        mInnerPaint.setAntiAlias(true);
//        mInnerPaint.setColor(getResources().getColor(R.color.google));
//        mInnerPaint.setStyle(Paint.Style.FILL);
//        mInnerPaint.setStrokeJoin(Paint.Join.ROUND);
//
//
//        Path path = new Path();
//        path.moveTo(getWidth(),0);
//        path.lineTo(1*getWidth()/4, 0);
//        path.lineTo(0, getHeight());
//        path.lineTo(getWidth(),getHeight());
//        path.lineTo(getWidth(), 0);
//        c.drawPath(path, mInnerPaint);
//
//        c.restore();
//
//        setText("Sign in with Google");

    }

}
