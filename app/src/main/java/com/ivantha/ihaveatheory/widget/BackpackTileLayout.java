package com.ivantha.ihaveatheory.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

import com.ivantha.ihaveatheory.R;
import com.ivantha.ihaveatheory.listener.BackpackDragListener;

public class BackpackTileLayout extends FrameLayout {
    public BackpackTileLayout(Context context) {
        super(context);
        this.setOnDragListener(new BackpackDragListener());
        applyCustomDesign(context);
    }

    public BackpackTileLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setOnDragListener(new BackpackDragListener());
        applyCustomDesign(context);
    }

    public BackpackTileLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setOnDragListener(new BackpackDragListener());
        applyCustomDesign(context);
    }

    public void applyCustomDesign(Context context) {
        setBackgroundResource(R.drawable.backpack_rack_bg);
        int margin_px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 5,
                context.getResources().getDisplayMetrics());
        int size_px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 70,
                context.getResources().getDisplayMetrics());

        LayoutParams params = new LayoutParams(size_px, size_px);
        params.setMargins(margin_px, margin_px, margin_px, margin_px);
        this.setLayoutParams(params);
    }
}
