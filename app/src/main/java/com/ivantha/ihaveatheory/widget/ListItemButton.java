package com.ivantha.ihaveatheory.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

import com.avoid.ihaveatheory.global.Font;
import com.avoid.ihaveatheory.util.FontCache;
import com.ivantha.ihaveatheory.R;

public class ListItemButton extends Button {
    public ListItemButton(Context context) {
        super(context);
        applyCustomFont(context);
        applyCustomShape(context);
    }

    public ListItemButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context);
        applyCustomShape(context);
    }

    public ListItemButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomFont(context);
        applyCustomShape(context);
    }

    private void applyCustomFont(Context context){
        Typeface customFont = FontCache.getTypeface(Font.ACTION_MAN_BOLD_FONT, context);
        setTypeface(customFont);
        setTextSize(20);

        setTextColor(Color.parseColor("#331F00"));
    }

    private void applyCustomShape(Context context){
        setBackgroundResource(R.drawable.app_listitem_button);
    }
}
