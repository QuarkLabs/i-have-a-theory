package com.avoid.ihaveatheory.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.view.MainMenuActivity;

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
