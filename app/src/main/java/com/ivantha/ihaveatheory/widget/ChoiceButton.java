package com.ivantha.ihaveatheory.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

import com.ivantha.ihaveatheory.R;
import com.ivantha.ihaveatheory.global.Font;
import com.ivantha.ihaveatheory.util.FontCache;

public class ChoiceButton extends Button {
    public ChoiceButton(Context context) {
        super(context);
        applyCustomDesign();
        applyCustomFont(context);
    }

    public ChoiceButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomDesign();
        applyCustomFont(context);
    }

    public ChoiceButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomDesign();
        applyCustomFont(context);
    }

    private void applyCustomDesign() {
        setBackgroundResource(R.drawable.app_choice_button);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface(Font.KOMIKAX_FONT, context);
        setTypeface(customFont);

        setTextColor(Color.parseColor("#331F00"));
    }
}
