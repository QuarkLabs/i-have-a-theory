package com.avoid.ihaveatheory.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.model.Difficulty;

public class DifficultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);
    }

    public void onClickEasyButton(View view) {
        Difficulty difficulty = new Difficulty();
        difficulty.setEasyDifficulty();
        Session.currentSaveFile.setDifficulty(difficulty);

        initializeGame();

        startActivity(new Intent(DifficultyActivity.this, DashboardActivity.class));
    }

    public void onClickMediumButton(View view) {
        Toast.makeText(getApplicationContext(), "This feature is not yet implemented.", Toast.LENGTH_LONG).show();
    }

    public void onClickHardButton(View view) {
        Toast.makeText(getApplicationContext(), "This feature is not yet implemented.", Toast.LENGTH_LONG).show();
    }

    private void initializeGame(){
        Session.currentSaveFile.setHealth(Session.currentSaveFile.getDifficulty().getMAX_HEALTH());
        Session.currentSaveFile.setStamina(Session.currentSaveFile.getDifficulty().getMAX_STAMINA());
        Session.currentSaveFile.setHeat(Session.currentSaveFile.getDifficulty().getMAX_HEAT());
        Session.currentSaveFile.setHunger(Session.currentSaveFile.getDifficulty().getMAX_HUNGER());
        Session.currentSaveFile.setThirst(Session.currentSaveFile.getDifficulty().getMAX_THIRST());
    }

    public void onClickBackButton(View view) {
        startActivity(new Intent(DifficultyActivity.this, ScenarioActivity.class));
    }
}
