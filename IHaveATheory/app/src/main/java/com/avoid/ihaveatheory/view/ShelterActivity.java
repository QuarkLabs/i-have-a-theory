package com.avoid.ihaveatheory.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.model.PlaybleActivity;
import com.avoid.ihaveatheory.model.Scenario;
import com.avoid.ihaveatheory.widget.HexButton;

public class ShelterActivity extends AppCompatActivity implements PlaybleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter);

        HexButton restButton = (HexButton) findViewById(R.id.shelter_rest_button);
        restButton.setIcon(R.drawable.shelter_resting);

        HexButton sleepButton = (HexButton)findViewById(R.id.shelter_sleep_button);
        sleepButton.setIcon(R.drawable.shelter_sleeping);

        HexButton campButton = (HexButton)findViewById(R.id.shelter_camp_button);
        campButton.setIcon(R.drawable.shelter_camp);
    }

    @Override
    protected void onPause() {
        super.onPause();

        Session.saveFileHandler.saveGame();
    }

    @Override
    public void setBackground() {
        RelativeLayout layout =(RelativeLayout)findViewById(R.id.activity_shelter);
        layout.setBackgroundResource(Session.currentSaveFile.getScenario().getDayBackground());
    }

    @Override
    public void setIcons() {

    }

    public void onClickBackButton(View view) {
//        startActivity(new Intent(ShelterActivity.this, DashboardActivity.class));
        Log.d("x", String.valueOf(Session.currentSaveFile.getHunger()));
        finish();
    }

    public void onClickShelterRestButton(View view) {
        Session.currentSaveFile.setStamina(Session.currentSaveFile.getStamina() + 50);
        Session.currentSaveFile.setHunger(Session.currentSaveFile.getHunger() - 10);
        Session.currentSaveFile.setThirst(Session.currentSaveFile.getThirst() - 20);

        startActivity(new Intent(ShelterActivity.this, ProgressActivity.class));
    }

    public void onClickShelterSleepButton(View view) {
    }

    public void onClickShelterCampButton(View view) {
    }
}
