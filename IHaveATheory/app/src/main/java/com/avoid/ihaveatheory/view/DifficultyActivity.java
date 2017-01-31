package com.avoid.ihaveatheory.view;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.avoid.ihaveatheory.global.Font;
import com.avoid.ihaveatheory.util.FontCache;

public class DifficultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        Typeface acmanBoldFont = FontCache.getTypeface(Font.ACTION_MAN_BOLD_FONT, this);
        TextView forestTextView = findViewById(R.id.forest_text_view);
        forestTextView.setTypeface(acmanBoldFont);
        TextView tundraTextView = findViewById(R.id.turndra_text_view);
        tundraTextView.setTypeface(acmanBoldFont);
        TextView mountainsTextView = findViewById(R.id.mountains_text_view);
        mountainsTextView.setTypeface(acmanBoldFont);

    }
}
