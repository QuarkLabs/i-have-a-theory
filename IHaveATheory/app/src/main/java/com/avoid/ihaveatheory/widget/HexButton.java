package com.avoid.ihaveatheory.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.Button;

import com.avoid.ihaveatheory.widget.draw.HexButtonDrawable;

public class HexButton extends Button{
    public HexButton(Context context) {
        super(context);
        applyCustomShape(context);
    }

    public HexButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomShape(context);
    }

    public HexButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomShape(context);
    }

    private void applyCustomShape(Context context){
        setBackground(new HexButtonDrawable(Color.GREEN, 6));
    }
}
