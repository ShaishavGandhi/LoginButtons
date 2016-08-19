package com.shaishavgandhi.loginbuttons;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by Shaishav on 8/16/2016.
 */
public class LinkedInButton extends BaseButton {

    public LinkedInButton(Context context, AttributeSet attrs) {
        super(context,attrs,R.color.linkedin,R.drawable.linkedin_logo);
    }

    public LinkedInButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs,defStyle,R.color.linkedin,R.drawable.linkedin_logo);
    }

    public LinkedInButton(Context context) {
        super(context);
    }

}
