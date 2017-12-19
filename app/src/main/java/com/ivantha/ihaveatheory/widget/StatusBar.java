package com.avoid.ihaveatheory.widget;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.ProgressBar;

import com.avoid.ihaveatheory.R;

public class StatusBar extends ProgressBar {
    public StatusBar(Context context) {
        super(context);
        applyCustomShape();
        applyCustomDesign(context);
    }

    public StatusBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomShape();
        applyCustomDesign(context);
    }

    public StatusBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomShape();
        applyCustomDesign(context);
    }

    private void applyCustomShape() {

    }

    public void applyCustomDesign(Context context) {
        int progress = getProgressPercentage();
        if (progress >= 75) {
            this.setProgressDrawable(ContextCompat.getDrawable(context, R.drawable.dashboard_status_bar_green));
        } else if (progress >= 50) {
            this.setProgressDrawable(ContextCompat.getDrawable(context, R.drawable.dashboard_status_bar_yellow));
        } else if (progress >= 25) {
            this.setProgressDrawable(ContextCompat.getDrawable(context, R.drawable.dashboard_status_bar_orange));
        } else {
            this.setProgressDrawable(ContextCompat.getDrawable(context, R.drawable.dashboard_status_bar_red));
        }
    }

    private int getProgressPercentage(){
        double progress = getProgress() * 100.0 / getMax() ;
        return (int) progress;
    }
}
