package com.avoid.ihaveatheory.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.avoid.ihaveatheory.listener.BackpackDragListener;

public class BackpackFrameLayout extends FrameLayout {
    public BackpackFrameLayout(Context context) {
        super(context);
        this.setOnDragListener(new BackpackDragListener());
    }

    public BackpackFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setOnDragListener(new BackpackDragListener());
    }

    public BackpackFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setOnDragListener(new BackpackDragListener());
    }
}
