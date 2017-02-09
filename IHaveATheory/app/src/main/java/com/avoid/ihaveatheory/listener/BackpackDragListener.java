package com.avoid.ihaveatheory.listener;

import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;

import com.avoid.ihaveatheory.widget.BackpackItemButton;

public class BackpackDragListener implements View.OnDragListener {
    @Override
    public boolean onDrag(View v, DragEvent event) {
        switch (event.getAction()) {
            case DragEvent.ACTION_DRAG_STARTED:
                break;
            case DragEvent.ACTION_DRAG_ENTERED:
                break;
            case DragEvent.ACTION_DRAG_EXITED:
                break;
            case DragEvent.ACTION_DROP:
                BackpackItemButton itemButton = (BackpackItemButton) event.getLocalState();

                ViewGroup owner = (ViewGroup) itemButton.getParent();
                owner.removeView(itemButton);

                ViewGroup vg = ((ViewGroup)v);
                vg.addView(itemButton, itemButton.getWidth(), itemButton.getHeight());

                itemButton.setVisibility(View.VISIBLE);

                return true;
            case DragEvent.ACTION_DRAG_ENDED:
                break;
            default:
                break;
        }

        return true;
    }
}
