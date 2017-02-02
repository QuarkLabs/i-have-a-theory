package com.avoid.ihaveatheory.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.widget.HexButton;

public class ShelterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter);

        HexButton restButton = (HexButton) findViewById(R.id.shelter_rest_button);
        restButton.setIcon(R.drawable.shelter_resting);
    }
}
