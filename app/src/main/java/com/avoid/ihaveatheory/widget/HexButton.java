package com.avoid.ihaveatheory.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

import com.avoid.ihaveatheory.global.Font;
import com.avoid.ihaveatheory.util.FontCache;
import com.avoid.ihaveatheory.widget.draw.HexButtonDrawable;

public class HexButton extends Button{
    private HexButtonDrawable drawable;

    public HexButton(Context context) {
        super(context);
        applyCustomShape(context);
        applyCustomFont(context);
    }

    public HexButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomShape(context);
        applyCustomFont(context);
    }

    public HexButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomShape(context);
        applyCustomFont(context);
    }

    public void setIcon(int iconDrawable) {
        drawable.setIcon(iconDrawable);
    }

    private void applyCustomShape(Context context){
        drawable = new HexButtonDrawable(context);
        setBackground(drawable);
    }

    private void applyCustomFont(Context context){
        Typeface customFont = FontCache.getTypeface(Font.INSTANCE.getKOMIKAX_FONT(), context);
        setTypeface(customFont);

        setTextColor(Color.WHITE);
    }
}
