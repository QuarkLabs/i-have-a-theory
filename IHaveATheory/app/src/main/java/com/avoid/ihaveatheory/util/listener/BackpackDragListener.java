package com.avoid.ihaveatheory.util.listener;

import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;

public class BackpackDragListener implements View.OnDragListener {
    @Override
    public boolean onDrag(View v, DragEvent event) {
        switch (event.getAction()) {
            case DragEvent.ACTION_DRAG_STARTED:
                Log.d("Started", "Drag started");
                break;
            case DragEvent.ACTION_DRAG_ENTERED:
                Log.d("Entered", "Drag entered into " + v.toString());
                break;
            case DragEvent.ACTION_DRAG_EXITED:
                Log.d("Exited", "Drag exited from " + v.toString());
                break;
            case DragEvent.ACTION_DROP:
                Log.d("Dropped", "Drag dropped");

                View view = (View) event.getLocalState();  //Returns TextView in this example

                ViewGroup owner = (ViewGroup) view.getParent();  //Return the parent ViewGroup of TextView in this example

//                owner.removeView(view); //Removing TextView from LinearLayout in which it was present earlier

//                LinearLayout container = (LinearLayout) v;
//                container.addView(view);  //Adding TextView in dropped LinearLayout

                view.setVisibility(View.VISIBLE);  //Making TextView visible back
                break;
            case DragEvent.ACTION_DRAG_ENDED:
                Log.d("Ended", "Drag ended");
                break;
            default:
                Log.d("dddd", "xxxx");
                break;
        }

        return false;
    }
}
