package com.avoid.ihaveatheory.widget

import android.content.Context
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import android.widget.ProgressBar

import com.avoid.ihaveatheory.R

class StatusBar : ProgressBar {

    private val progressPercentage: Int
        get() {
            val progress = progress * 100.0 / max
            return progress.toInt()
        }

    constructor(context: Context) : super(context) {
        applyCustomShape()
        applyCustomDesign(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        applyCustomShape()
        applyCustomDesign(context)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        applyCustomShape()
        applyCustomDesign(context)
    }

    private fun applyCustomShape() {

    }

    fun applyCustomDesign(context: Context) {
        val progress = progressPercentage
        if (progress >= 75) {
            this.progressDrawable = ContextCompat.getDrawable(context, R.drawable.dashboard_status_bar_green)
        } else if (progress >= 50) {
            this.progressDrawable = ContextCompat.getDrawable(context, R.drawable.dashboard_status_bar_yellow)
        } else if (progress >= 25) {
            this.progressDrawable = ContextCompat.getDrawable(context, R.drawable.dashboard_status_bar_orange)
        } else {
            this.progressDrawable = ContextCompat.getDrawable(context, R.drawable.dashboard_status_bar_red)
        }
    }
}
