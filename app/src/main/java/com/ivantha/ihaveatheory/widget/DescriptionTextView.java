package com.ivantha.ihaveatheory.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.avoid.ihaveatheory.global.Font;
import com.avoid.ihaveatheory.util.FontCache;

public class DescriptionTextView extends TextView {
    public DescriptionTextView(Context context) {
        super(context);
        applyCustomFont(context);
    }

    public DescriptionTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context);
    }

    public DescriptionTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface(Font.ACTION_MAN_BOLD_FONT, context);
        setTypeface(customFont);

        setTextColor(Color.WHITE);
    }
}
