package com.avoid.ihaveatheory.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import com.avoid.ihaveatheory.R;

public class ForwardButton extends Button{
    public ForwardButton(Context context) {
        super(context);
        applyCustomShape(context);
    }

    public ForwardButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomShape(context);
    }

    public ForwardButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomShape(context);
    }

    private void applyCustomShape(Context context){
        setBackgroundResource(R.drawable.app_forward_button);
    }
}
