package com.avoid.ihaveatheory.view;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.model.PlaybleActivity;
import com.avoid.ihaveatheory.widget.BackButton;
import com.avoid.ihaveatheory.widget.BackpackFrameLayout;
import com.avoid.ihaveatheory.widget.BackpackItemButton;
import com.avoid.ihaveatheory.widget.BackpackMixLayout;

public class BackpackActivity extends AppCompatActivity implements PlaybleActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backpack);

        BackpackFrameLayout bread_bfl = (BackpackFrameLayout) findViewById(R.id.item_10_frame_layout);
        BackpackFrameLayout bread_bf2 = (BackpackFrameLayout) findViewById(R.id.item_12_frame_layout);

        BackpackItemButton bread = (BackpackItemButton) findViewById(R.id.bread_image_button);
        BackpackItemButton fire = (BackpackItemButton) findViewById(R.id.fire_image_button);
        bread.setIcon(R.drawable.food);
        fire.setIcon(R.drawable.store_fire);

    }

    @Override
    public void setBackground() {
        RelativeLayout layout =(RelativeLayout)findViewById(R.id.activity_backpack);
        layout.setBackgroundResource(Session.currentSaveFile.getScenario().getDayBackground());
    }

    @Override
    public void setIcons() {

    }

    public void onClickBackButton(View view) {
        finish();
    }
}
