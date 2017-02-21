package com.avoid.ihaveatheory.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.game.choice.AcidLakeSituation;
import com.avoid.ihaveatheory.game.scene.Scene;
import com.avoid.ihaveatheory.game.scene.location.LakeScene;
import com.avoid.ihaveatheory.game.scene.location.LocationScene;
import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.model.PlaybleActivity;
import com.avoid.ihaveatheory.util.Common;
import com.avoid.ihaveatheory.widget.LabelTextView;
import com.avoid.ihaveatheory.widget.StatusBar;

public class DashboardActivity extends AppCompatActivity implements PlaybleActivity {
    StatusBar hungerProgressBar;
    StatusBar thirstProgressBar;
    StatusBar healthProgressBar;
    StatusBar staminaProgressBar;
    StatusBar heatProgressBar;

    LabelTextView hungerValueTextView;
    LabelTextView thirstValueTextView;
    LabelTextView healthValueTextView;
    LabelTextView staminaValueTextView;
    LabelTextView heatValueTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        setBackground();
        setIcons();

        hungerProgressBar = (StatusBar) findViewById(R.id.hunger_progress_bar);
        thirstProgressBar = (StatusBar) findViewById(R.id.thirst_progress_bar);
        healthProgressBar = (StatusBar) findViewById(R.id.health_progress_bar);
        staminaProgressBar = (StatusBar) findViewById(R.id.stamina_progress_bar);
        heatProgressBar = (StatusBar) findViewById(R.id.heat_progress_bar);

        hungerValueTextView = (LabelTextView) findViewById(R.id.hunger_value_text_view);
        thirstValueTextView = (LabelTextView) findViewById(R.id.thirst_value_text_view);
        healthValueTextView = (LabelTextView) findViewById(R.id.health_value_text_view);
        staminaValueTextView = (LabelTextView) findViewById(R.id.stamina_value_text_view);
        heatValueTextView = (LabelTextView) findViewById(R.id.heat_value_text_view);

        refreshStats();
    }

    @Override
    protected void onResume() {
        super.onResume();
        refreshStats();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Session.saveFileHandler.saveGame();
    }

    public void onClickGatherButton(View view) {
        MainMenuActivity.playClickSound();
        startActivity(new Intent(DashboardActivity.this, GatherActivity.class));
    }

    public void onClickCraftButton(View view) {
        MainMenuActivity.playClickSound();
        startActivity(new Intent(DashboardActivity.this, CraftActivity.class));
    }

    public void onClickBackpackButton(View view) {
        MainMenuActivity.playClickSound();
        startActivity(new Intent(DashboardActivity.this, BackpackActivity.class));
    }

    public void onClickShelterButton(View view) {
        MainMenuActivity.playClickSound();
        startActivity(new Intent(DashboardActivity.this, ShelterActivity.class));
    }

    public void onClickJournalButton(View view) {
        MainMenuActivity.playClickSound();
        startActivity(new Intent(DashboardActivity.this, JournalActivity.class));
    }

    public void onClickShopButton(View view) {
        MainMenuActivity.playClickSound();
        startActivity(new Intent(DashboardActivity.this, StoreActivity.class));
    }

    public void onClickMapButton(View view) {
        MainMenuActivity.playClickSound();
        startActivity(new Intent(DashboardActivity.this, MapActivity.class));
    }

    public void onClickExploreButton(View view) {

    }

    public void onClickCookingPotButton(View view) {
        MainMenuActivity.playClickSound();
        startActivity(new Intent(DashboardActivity.this, CookingPotActivity.class));
    }

    @Override
    public void setBackground() {
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.activity_dashboard);
        layout.setBackgroundResource(Session.currentSaveFile.getScenario().getDayBackground());
    }

    @Override
    public void setIcons() {

    }

    private void refreshStats() {
        refreshHunger();
        refreshThirst();
        refreshHealth();
        refreshStamina();
        refreshHeat();
    }

    private void refreshHunger(){
        hungerProgressBar.setMax(Session.currentSaveFile.getDifficulty().getMAX_HUNGER());
        hungerProgressBar.setProgress(Session.currentSaveFile.getHunger());
        hungerProgressBar.applyCustomDesign(DashboardActivity.this);
        hungerValueTextView.setText(String.valueOf(Session.currentSaveFile.getHunger()) + "/"
                + String.valueOf(Session.currentSaveFile.getDifficulty().getMAX_HUNGER()));
    }

    private void refreshThirst(){
        thirstProgressBar.setMax(Session.currentSaveFile.getDifficulty().getMAX_THIRST());
        thirstProgressBar.setProgress(Session.currentSaveFile.getThirst());
        thirstProgressBar.applyCustomDesign(DashboardActivity.this);
        thirstValueTextView.setText(String.valueOf(Session.currentSaveFile.getThirst()) + "/"
                + String.valueOf(Session.currentSaveFile.getDifficulty().getMAX_THIRST()));
    }

    private void refreshHealth(){
        healthProgressBar.setMax(Session.currentSaveFile.getDifficulty().getMAX_HEALTH());
        healthProgressBar.setProgress(Session.currentSaveFile.getHealth());
        healthProgressBar.applyCustomDesign(DashboardActivity.this);
        healthValueTextView.setText(String.valueOf(Session.currentSaveFile.getHealth()) + "/"
                + String.valueOf(Session.currentSaveFile.getDifficulty().getMAX_HEALTH()));
    }

    private void refreshStamina(){
        staminaProgressBar.setMax(Session.currentSaveFile.getDifficulty().getMAX_STAMINA());
        staminaProgressBar.setProgress(Session.currentSaveFile.getStamina());
        staminaProgressBar.applyCustomDesign(DashboardActivity.this);
        staminaValueTextView.setText(String.valueOf(Session.currentSaveFile.getStamina()) + "/"
                + String.valueOf(Session.currentSaveFile.getDifficulty().getMAX_STAMINA()));
    }

    private void refreshHeat(){
        heatProgressBar.setMax(Session.currentSaveFile.getDifficulty().getMAX_HEAT());
        heatProgressBar.setProgress(Session.currentSaveFile.getHeat());
        heatProgressBar.applyCustomDesign(DashboardActivity.this);
        heatValueTextView.setText(String.valueOf(Session.currentSaveFile.getHeat()) + "/"
                + String.valueOf(Session.currentSaveFile.getDifficulty().getMAX_HEAT()));
    }
}