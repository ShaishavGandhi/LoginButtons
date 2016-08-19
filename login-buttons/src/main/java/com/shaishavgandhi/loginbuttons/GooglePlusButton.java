package com.shaishavgandhi.loginbuttons;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by Shaishav on 8/15/2016.
 */
public class GooglePlusButton extends BaseButton {


    public GooglePlusButton(Context context, AttributeSet attrs) {
        super(context,attrs,R.color.google,R.drawable.google_logo);

    }

    public GooglePlusButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs,defStyle,R.color.google,R.drawable.google_logo);

    }

    public GooglePlusButton(Context context) {
        super(context);
    }


}
