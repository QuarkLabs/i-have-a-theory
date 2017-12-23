package com.avoid.ihaveatheory.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.avoid.ihaveatheory.listener.BackpackDragListener;

public class BackpackActionLayout extends LinearLayout {
    public BackpackActionLayout(Context context) {
        super(context);
        this.setOnDragListener(new BackpackDragListener());
    }

    public BackpackActionLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setOnDragListener(new BackpackDragListener());
    }

    public BackpackActionLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setOnDragListener(new BackpackDragListener());
    }
}
