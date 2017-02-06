package com.avoid.ihaveatheory.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.model.PlaybleActivity;
import com.avoid.ihaveatheory.widget.HexButton;

public class ShelterActivity extends AppCompatActivity implements PlaybleActivity {
    HexButton restButton;
    HexButton sleepButton;
    HexButton campButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter);

        restButton = (HexButton) findViewById(R.id.shelter_rest_button);
        sleepButton = (HexButton) findViewById(R.id.shelter_sleep_button);
        campButton = (HexButton) findViewById(R.id.shelter_camp_button);

        setBackground();
        setIcons();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Session.saveFileHandler.saveGame();
    }

    @Override
    public void setBackground() {
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.activity_shelter);
        layout.setBackgroundResource(Session.currentSaveFile.getScenario().getDayBackground());
    }

    @Override
    public void setIcons() {
        restButton.setIcon(R.drawable.shelter_resting);
        sleepButton.setIcon(R.drawable.shelter_sleeping);
        campButton.setIcon(R.drawable.shelter_camp);
    }

    public void onClickBackButton(View view) {
        finish();
    }

    public void onClickShelterRestButton(View view) {
        MainMenuActivity.playClickSound();
        Session.currentSaveFile.setStamina(Session.currentSaveFile.getStamina() + 50);
        Session.currentSaveFile.setHunger(Session.currentSaveFile.getHunger() - 10);
        Session.currentSaveFile.setThirst(Session.currentSaveFile.getThirst() - 20);

        startActivity(new Intent(ShelterActivity.this, ProgressActivity.class));
    }

    public void onClickShelterSleepButton(View view) {
        MainMenuActivity.playClickSound();
        Session.currentSaveFile.setStamina(Session.currentSaveFile.getStamina() + 100);
        Session.currentSaveFile.setHunger(Session.currentSaveFile.getHunger() - 20);
        Session.currentSaveFile.setThirst(Session.currentSaveFile.getThirst() - 35);

        startActivity(new Intent(ShelterActivity.this, ProgressActivity.class));
    }

    public void onClickShelterCampButton(View view) {
        MainMenuActivity.playClickSound();
        Session.currentSaveFile.setStamina(Session.currentSaveFile.getStamina() - 100);
        Session.currentSaveFile.setHunger(Session.currentSaveFile.getHunger() - 50);
        Session.currentSaveFile.setThirst(Session.currentSaveFile.getThirst() - 100);

        startActivity(new Intent(ShelterActivity.this, ProgressActivity.class));
    }
}
