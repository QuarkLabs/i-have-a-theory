package com.ivantha.ihaveatheory.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ivantha.ihaveatheory.R;
import com.ivantha.ihaveatheory.global.Session;


public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
    }

    @Override
    protected void onPause() {
        super.onPause();

        Session.saveFileHandler.saveGame();
    }
}
