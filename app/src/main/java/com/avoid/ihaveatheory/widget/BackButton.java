package com.avoid.ihaveatheory.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import com.avoid.ihaveatheory.R;

public class BackButton extends Button {
    public BackButton(Context context) {
        super(context);
        applyCustomShape();
    }

    public BackButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomShape();
    }

    public BackButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomShape();
    }

    private void applyCustomShape(){
        setBackgroundResource(R.drawable.app_back_button);
    }
}
