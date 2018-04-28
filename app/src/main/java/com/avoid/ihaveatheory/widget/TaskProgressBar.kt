package com.avoid.ihaveatheory.widget

import android.content.Context
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import android.widget.ProgressBar

import com.avoid.ihaveatheory.R

class TaskProgressBar : ProgressBar {
    constructor(context: Context) : super(context) {
        applyCustomDesign(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        applyCustomDesign(context)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        applyCustomDesign(context)
    }

    private fun applyCustomDesign(context: Context) {
        this.progressDrawable = ContextCompat.getDrawable(context, R.drawable.progress_progress_bar)
    }
}
