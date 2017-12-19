package com.avoid.ihaveatheory.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import com.ivantha.ihaveatheory.R;

public class BackButton extends Button {
    public BackButton(Context context) {
        super(context);
        applyCustomShape(context);
    }

    public BackButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomShape(context);
    }

    public BackButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomShape(context);
    }

    private void applyCustomShape(Context context){
        setBackgroundResource(R.drawable.app_back_button);
    }


}
