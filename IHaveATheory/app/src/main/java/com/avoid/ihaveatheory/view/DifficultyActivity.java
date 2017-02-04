package com.avoid.ihaveatheory.view;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.avoid.ihaveatheory.R;

import com.avoid.ihaveatheory.global.Font;
import com.avoid.ihaveatheory.util.FontCache;

public class DifficultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);
    }

    public void onClickEasyButton(View view) {
    }

    public void onClickMediumButton(View view) {
        Toast.makeText(getApplicationContext(), "This feature is not yet implemented.", Toast.LENGTH_LONG).show();
    }

    public void onClickHardButton(View view) {
        Toast.makeText(getApplicationContext(), "This feature is not yet implemented.", Toast.LENGTH_LONG).show();
    }
}
