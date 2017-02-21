package com.avoid.ihaveatheory.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.model.PlaybleActivity;

public class StoryActivity extends AppCompatActivity implements PlaybleActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
    }

    @Override
    public void setBackground() {

    }

    @Override
    public void setIcons() {

    }
}
