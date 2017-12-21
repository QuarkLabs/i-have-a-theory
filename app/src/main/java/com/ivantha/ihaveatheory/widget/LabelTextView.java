package com.ivantha.ihaveatheory.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.ivantha.ihaveatheory.global.Font;
import com.ivantha.ihaveatheory.util.FontCache;

public class LabelTextView extends TextView {
    public LabelTextView(Context context) {
        super(context);
        applyCustomShape(context);
        applyCustomFont(context);
    }

    public LabelTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomShape(context);
        applyCustomFont(context);
    }

    public LabelTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomShape(context);
        applyCustomFont(context);
    }

    private void applyCustomShape(Context context) {
//        setBackgroundColor(Color.WHITE);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface(Font.ACTION_MAN_BOLD_FONT, context);
        setTypeface(customFont);

        setTextColor(Color.WHITE);
    }
}
