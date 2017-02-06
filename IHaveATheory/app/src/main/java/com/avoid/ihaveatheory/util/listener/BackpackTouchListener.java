package com.avoid.ihaveatheory.util.listener;

import android.view.MotionEvent;
import android.view.View;

public class BackpackTouchListener implements View.OnTouchListener {
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN)  //If TextView just touches
        {
            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);  //For nice transition of shadow
            v.startDrag(null, shadowBuilder, v, 0);  //When Dragging Starts. First Parameter is Clip data & last must be 0 always
//                    v.setVisibility(View.INVISIBLE);
            return true;
        }
        else return false;
    }
}
