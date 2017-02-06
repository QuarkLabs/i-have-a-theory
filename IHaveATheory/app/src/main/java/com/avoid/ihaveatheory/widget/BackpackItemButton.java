package com.avoid.ihaveatheory.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

import com.avoid.ihaveatheory.listener.BackpackDragListener;
import com.avoid.ihaveatheory.listener.BackpackTouchListener;
import com.avoid.ihaveatheory.widget.draw.HexButtonDrawable;

public class BackpackItemButton extends ImageButton {
    private HexButtonDrawable drawable;

    public BackpackItemButton(Context context) {
        super(context);
        this.setOnTouchListener(new BackpackTouchListener());
        this.setOnDragListener(new BackpackDragListener());
        applyCustomShape(context);
    }

    public BackpackItemButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setOnTouchListener(new BackpackTouchListener());
        applyCustomShape(context);
    }

    public BackpackItemButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setOnTouchListener(new BackpackTouchListener());
        applyCustomShape(context);
    }

    public void setIcon(int iconDrawable) {
        drawable.setIcon(iconDrawable);
    }

    private void applyCustomShape(Context context) {
        drawable = new HexButtonDrawable(context);
        setBackground(drawable);
    }
}
