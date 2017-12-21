package com.ivantha.ihaveatheory.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.ivantha.ihaveatheory.R;
import com.ivantha.ihaveatheory.global.Session;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

    @Override
    protected void onPause() {
        super.onPause();

        //Save game
        Session.saveFileHandler.saveGame();
    }
}
