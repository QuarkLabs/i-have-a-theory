package com.avoid.ihaveatheory.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.avoid.ihaveatheory.global.Session;
import com.ivantha.ihaveatheory.R;

public class LeaderboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);
    }

    @Override
    protected void onPause() {
        super.onPause();

        Session.saveFileHandler.saveGame();
    }
}
