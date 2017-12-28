package com.avoid.ihaveatheory.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.global.Font;
import com.avoid.ihaveatheory.util.FontCache;

public class MainButton extends Button {
    public MainButton(Context context) {
        super(context);
        applyCustomFont(context);
        applyCustomShape(context);
        applyFontColor(context);
    }

    public MainButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context);
        applyCustomShape(context);
        applyFontColor(context);
    }

    public MainButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomFont(context);
        applyCustomShape(context);
        applyFontColor(context);
    }

    private void applyCustomFont(Context context){
        Typeface customFont = FontCache.getTypeface(Font.INSTANCE.getKOMIKAX_FONT(), context);
        setTypeface(customFont);
        setTextSize(20);

        setTextColor(Color.parseColor("#331F00"));
    }

    private void applyCustomShape(Context context){
        setBackgroundResource(R.drawable.app_main_button);
    }

    private void applyFontColor(Context context){
//        ContextCompat.getColor(context, R.color.button_white);

//        ContextCompat.getDrawable(context, R.drawable.button_white);


//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            setTextColor(context.getResources().getColor(R.color.button_white, context.getTheme()));
//        }else {
//            setTextColor(context.getResources().getColor(R.color.button_white));
//        }
    }
}
