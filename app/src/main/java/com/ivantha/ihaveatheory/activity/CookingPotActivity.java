package com.ivantha.ihaveatheory.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.ivantha.ihaveatheory.R;
import com.ivantha.ihaveatheory.global.Session;
import com.ivantha.ihaveatheory.model.PlaybleActivity;

public class CookingPotActivity extends AppCompatActivity implements PlaybleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooking_pot);
    }

    @Override
    public void setBackground() {
        RelativeLayout layout =(RelativeLayout)findViewById(R.id.activity_cooking_pot);
        layout.setBackgroundResource(Session.currentSaveFile.getScenario().getDayBackground());
    }

    @Override
    public void setIcons() {

    }
}
