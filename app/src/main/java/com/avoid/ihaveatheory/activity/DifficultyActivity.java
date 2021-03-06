package com.avoid.ihaveatheory.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.model.Backpack;
import com.avoid.ihaveatheory.model.Difficulty;

public class DifficultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);
    }

    public void onClickEasyButton(View view) {
        MainMenuActivity.playClickSound();
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
        Backpack backpack = new Backpack();
        Session.currentSaveFile.setBackpack(backpack);

        Session.currentSaveFile.setHunger(Session.currentSaveFile.getDifficulty().getMaX_HUNGER());
        Session.currentSaveFile.setThirst(Session.currentSaveFile.getDifficulty().getMaX_THIRST() / 5);
        Session.currentSaveFile.setHealth(Session.currentSaveFile.getDifficulty().getMaX_HEALTH() / 8 * 3);
        Session.currentSaveFile.setStamina(Session.currentSaveFile.getDifficulty().getMaX_STAMINA() / 2);
        Session.currentSaveFile.setHeat(Session.currentSaveFile.getDifficulty().getMaX_HEAT() / 5 * 3);
    }

    public void onClickBackButton(View view) {
        MainMenuActivity.playClickSound();
        startActivity(new Intent(DifficultyActivity.this, ScenarioActivity.class));
    }
}
