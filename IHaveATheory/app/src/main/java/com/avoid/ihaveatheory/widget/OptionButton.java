package com.avoid.ihaveatheory.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

import com.avoid.ihaveatheory.global.Font;
import com.avoid.ihaveatheory.util.FontCache;

public class OptionButton extends Button {
    public OptionButton(Context context) {
        super(context);
        applyCustomFont(context);
    }

    public OptionButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context);
    }

    public OptionButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface(Font.KOMIKAX_FONT, context);
        setTypeface(customFont);

        setTextColor(Color.BLACK);
    }
}