package com.avoid.ihaveatheory.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.widget.HexButton;
import com.avoid.ihaveatheory.widget.draw.HexButtonDrawable;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        HexButton backpackButton = (HexButton) findViewById(R.id.backpack_button);
        backpackButton.setIcon(R.drawable.dashboard_backpack);
    }
}
