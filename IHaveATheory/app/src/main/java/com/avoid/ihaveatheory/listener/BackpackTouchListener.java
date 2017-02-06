package com.avoid.ihaveatheory.listener;

import android.view.MotionEvent;
import android.view.View;

public class BackpackTouchListener implements View.OnTouchListener {
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN)  //If TextView just touches
        {
            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);  //For nice transition of shadow
            v.startDrag(null, shadowBuilder, v, 0);  //When Dragging Starts. First Parameter is Clip data & last must be 0 always
            v.setVisibility(View.INVISIBLE);
            return true;
        } else {
            return false;
        }



//        // Create a new ClipData.
//        // This is done in two steps to provide clarity. The convenience method
//        // ClipData.newPlainText() can create a plain text ClipData in one step.
//
//        // Create a new ClipData.Item from the ImageView object's tag
//        ClipData.Item item = new ClipData.Item(v.getTag());
//
//        // Create a new ClipData using the tag as a label, the plain text MIME type, and
//        // the already-created item. This will create a new ClipDescription object within the
//        // ClipData, and set its MIME type entry to "text/plain"
//        ClipData dragData = new ClipData(v.getTag(),ClipData.MIMETYPE_TEXT_PLAIN,item);
//
//        // Instantiates the drag shadow builder.
//        View.DragShadowBuilder myShadow = new MyDragShadowBuilder(imageView);
//
//        // Starts the drag
//
//        v.startDrag(dragData,  // the data to be dragged
//                myShadow,  // the drag shadow builder
//                null,      // no need to use local data
//                0          // flags (not currently used, set to 0)
//        );
//
//    }
    }
}
