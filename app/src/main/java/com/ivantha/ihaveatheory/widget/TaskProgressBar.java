package com.avoid.ihaveatheory.widget;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.ProgressBar;

import com.ivantha.ihaveatheory.R;


public class TaskProgressBar extends ProgressBar {
    public TaskProgressBar(Context context) {
        super(context);
        applyCustomDesign(context);
    }

    public TaskProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomDesign(context);
    }

    public TaskProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomDesign(context);
    }

    private void applyCustomDesign(Context context){
        this.setProgressDrawable(ContextCompat.getDrawable(context, R.drawable.progress_progress_bar));
    }
}
