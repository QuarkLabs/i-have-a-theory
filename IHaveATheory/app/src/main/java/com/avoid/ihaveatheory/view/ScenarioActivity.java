package com.avoid.ihaveatheory.view;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.global.Font;
import com.avoid.ihaveatheory.util.FontCache;

public class ScenarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario);

        Typeface acmanBoldFont = FontCache.getTypeface(Font.ACTION_MAN_BOLD_FONT, this);
        TextView forestTextView = (TextView) findViewById(R.id.forest_text_view);
        forestTextView.setTypeface(acmanBoldFont);
        TextView tundraTextView = (TextView) findViewById(R.id.tundra_text_view);
        tundraTextView.setTypeface(acmanBoldFont);
        TextView mountainsTextView = (TextView) findViewById(R.id.mountains_text_view);
        mountainsTextView.setTypeface(acmanBoldFont);
    }
}
