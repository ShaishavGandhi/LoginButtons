package com.shaishavgandhi.loginbuttons;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by Shaishav on 8/15/2016.
 */
public class TwitterButton extends BaseButton {

    public TwitterButton(Context context, AttributeSet attrs) {
        super(context,attrs,R.color.twitter,R.drawable.twitter_logo);
    }

    public TwitterButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs,defStyle,R.color.twitter,R.drawable.twitter_logo);
    }

    public TwitterButton(Context context) {
        super(context);
    }

}
