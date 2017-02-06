package com.avoid.ihaveatheory.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

import com.avoid.ihaveatheory.widget.draw.HexButtonDrawable;

public class BackpackItemButton extends ImageButton {
//    private BackpackItemButtonDrawable drawable;

    public BackpackItemButton(Context context) {
        super(context);
        applyCustomShape(context);
    }

    public BackpackItemButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomShape(context);
    }

    public BackpackItemButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomShape(context);
    }

    public void setIcon(int iconDrawable) {
//        drawable.setIcon(iconDrawable);
    }

    private void applyCustomShape(Context context){
//        drawable = new HexButtonDrawable(context);
//        setBackground(drawable);
    }
}
