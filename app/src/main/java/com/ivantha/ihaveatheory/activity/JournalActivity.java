package com.ivantha.ihaveatheory.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.model.PlaybleActivity;
import com.ivantha.ihaveatheory.R;

public class JournalActivity extends AppCompatActivity implements PlaybleActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal);
    }

    @Override
    protected void onPause() {
        super.onPause();

        Session.saveFileHandler.saveGame();
    }

    @Override
    public void setBackground() {
        RelativeLayout layout =(RelativeLayout)findViewById(R.id.activity_journal);
        layout.setBackgroundResource(Session.currentSaveFile.getScenario().getDayBackground());
    }

    @Override
    public void setIcons() {

    }
}