package com.avoid.ihaveatheory.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.global.Font;
import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.model.Scenario;
import com.avoid.ihaveatheory.util.FontCache;

public class ScenarioActivity extends AppCompatActivity {
    private boolean isForestClicked = false;
    private boolean isTundraClicked = false;
    private boolean isMountainsClicked = false;

    private ImageButton forestImageButton;
    private ImageButton tundraImageButton;
    private ImageButton mountainsImageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario);

        Typeface acmanBoldFont = FontCache.getTypeface(Font.INSTANCE.getKOMIKAX_FONT(), this);
        TextView forestTextView = (TextView) findViewById(R.id.forest_text_view);
        forestTextView.setTypeface(acmanBoldFont);
        TextView tundraTextView = (TextView) findViewById(R.id.tundra_text_view);
        tundraTextView.setTypeface(acmanBoldFont);
        TextView mountainsTextView = (TextView) findViewById(R.id.mountains_text_view);
        mountainsTextView.setTypeface(acmanBoldFont);

        forestImageButton = (ImageButton) findViewById(R.id.forest_image_button);
        tundraImageButton = (ImageButton) findViewById(R.id.tundra_image_button);
        mountainsImageButton = (ImageButton) findViewById(R.id.mountains_image_button);
    }

    public void onClickForestImageButton(View view) {
        MainMenuActivity.playClickSound();
        enableForest();
        disableTundra();
        disableMountains();
    }

    public void onClickTundraImageButton(View view) {
        MainMenuActivity.playClickSound();
        disableForest();
        enableTundra();
        disableMountains();
    }

    public void onClickMountainsImageButton(View view) {
        MainMenuActivity.playClickSound();
        disableForest();
        disableTundra();
        enableMountains();
    }

    private void enableForest() {
        if (!isForestClicked) {
            forestImageButton.setImageResource(R.drawable.scenario_forest);
//            forestImageButton.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.scenario_forest, null));
//            Picasso.with(this).load(R.drawable.scenario_forest).fit().into(forestImageButton);
            isForestClicked = true;
        }
    }

    private void disableForest() {
        if (isForestClicked) {
            forestImageButton.setImageResource(R.drawable.scenario_forest_gray);
//            forestImageButton.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.scenario_forest_gray, null));
//            Picasso.with(this).load(R.drawable.scenario_forest_gray).fit().into(forestImageButton);
            isForestClicked = false;
        }
    }

    private void enableTundra() {
        if (!isTundraClicked) {
            tundraImageButton.setImageResource(R.drawable.scenario_tundra);
//            tundraImageButton.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.scenario_tundra, null));
//            Picasso.with(this).load(R.drawable.scenario_tundra).fit().into(tundraImageButton);
            isTundraClicked = true;
        }
    }

    private void disableTundra() {
        if (isTundraClicked) {
            tundraImageButton.setImageResource(R.drawable.scenario_tundra_gray);
//            tundraImageButton.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.scenario_tundra_gray, null));
//            Picasso.with(this).load(R.drawable.scenario_tundra_gray).fit().into(tundraImageButton);
            isTundraClicked = false;
        }
    }

    private void enableMountains() {
        if (!isMountainsClicked) {
            mountainsImageButton.setImageResource(R.drawable.scenario_mountains);
//            mountainsImageButton.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.scenario_mountains, null));
//            Picasso.with(this).load(R.drawable.scenario_mountains).fit().into(mountainsImageButton);
            isMountainsClicked = true;
        }
    }

    private void disableMountains() {
        if (isMountainsClicked) {
            mountainsImageButton.setImageResource(R.drawable.scenario_mountains_gray);
//            mountainsImageButton.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.scenario_mountains_gray, null));
//            Picasso.with(this).load(R.drawable.scenario_mountains_gray).fit().into(mountainsImageButton);
            isMountainsClicked = false;
        }
    }

    public void onClickBackButton(View view) {
        MainMenuActivity.playClickSound();
        startActivity(new Intent(ScenarioActivity.this, MainMenuActivity.class));
    }

    public void onClickForwardButton(View view) {
        MainMenuActivity.playClickSound();
        Scenario scenario = new Scenario();
        if (isForestClicked) {
            scenario.setForestScenario();
        } else if (isTundraClicked) {
            Toast.makeText(getApplicationContext(), "This feature is not yet implemented.", Toast.LENGTH_LONG).show();
            return;
        } else if (isMountainsClicked) {
            Toast.makeText(getApplicationContext(), "This feature is not yet implemented.", Toast.LENGTH_LONG).show();
            return;
        } else {
            Toast.makeText(getApplicationContext(), "Please select a scenario.", Toast.LENGTH_LONG).show();
            return;
        }
        Session.currentSaveFile.setScenario(scenario);
        startActivity(new Intent(ScenarioActivity.this, DifficultyActivity.class));
    }
}
