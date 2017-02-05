package com.avoid.ihaveatheory.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.model.PlaybleActivity;

public class BackpackActivity extends AppCompatActivity implements PlaybleActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backpack);
    }

    @Override
    public void setBackground() {
        RelativeLayout layout =(RelativeLayout)findViewById(R.id.activity_backpack);
        layout.setBackgroundResource(Session.currentSaveFile.getScenario().getDayBackground());
    }

    @Override
    public void setIcons() {

    }
}
