package com.avoid.ihaveatheory.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AbsoluteLayout;

import com.avoid.ihaveatheory.util.listener.BackpackDragListener;

public class BackpackMixLayout extends AbsoluteLayout {
    public BackpackMixLayout(Context context) {
        super(context);
        this.setOnDragListener(new BackpackDragListener());
    }

    public BackpackMixLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setOnDragListener(new BackpackDragListener());
    }

    public BackpackMixLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setOnDragListener(new BackpackDragListener());
    }
}
