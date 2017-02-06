package com.avoid.ihaveatheory.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.model.PlaybleActivity;
import com.avoid.ihaveatheory.widget.BackpackItemButton;

public class BackpackActivity extends AppCompatActivity implements PlaybleActivity{

    private int drag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backpack);

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
