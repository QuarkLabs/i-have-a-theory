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
import com.avoid.ihaveatheory.widget.LabelTextView;
import com.avoid.ihaveatheory.widget.LinearProgressBar;

public class DashboardActivity extends AppCompatActivity implements PlaybleActivity {
    LinearProgressBar hungerProgressBar;
    LinearProgressBar thirstProgressBar;
    LinearProgressBar healthProgressBar;
    LinearProgressBar staminaProgressBar;
    LinearProgressBar heatProgressBar;

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

        hungerProgressBar = (LinearProgressBar) findViewById(R.id.hunger_progress_bar);
        thirstProgressBar = (LinearProgressBar) findViewById(R.id.thirst_progress_bar);
        healthProgressBar = (LinearProgressBar) findViewById(R.id.health_progress_bar);
        staminaProgressBar = (LinearProgressBar) findViewById(R.id.stamina_progress_bar);
        heatProgressBar = (LinearProgressBar) findViewById(R.id.heat_progress_bar);

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
        startActivity(new Intent(DashboardActivity.this, GatherActivity.class));
    }

    public void onClickCraftButton(View view) {
        startActivity(new Intent(DashboardActivity.this, CraftActivity.class));
    }

    public void onClickBackpackButton(View view) {
        startActivity(new Intent(DashboardActivity.this, BackpackActivity.class));
    }

    public void onClickShelterButton(View view) {
        startActivity(new Intent(DashboardActivity.this, ShelterActivity.class));
    }

    public void onClickJournalButton(View view) {
        startActivity(new Intent(DashboardActivity.this, JournalActivity.class));
    }

    public void onClickShopButton(View view) {
        startActivity(new Intent(DashboardActivity.this, StoreActivity.class));
    }

    public void onClickMapButton(View view) {
        startActivity(new Intent(DashboardActivity.this, MapActivity.class));
    }

    public void onClickExploreButton(View view) {

    }

    public void onClickCookingPotButton(View view) {
        startActivity(new Intent(DashboardActivity.this, CookingPotActivity.class));
    }

    @Override
    public void setBackground() {
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.activity_dashboard);
        layout.setBackgroundResource(Session.currentSaveFile.getScenario().getDayBackground());
    }

    @Override
    public void setIcons() {
        HexButton gatherButton = (HexButton) findViewById(R.id.gather_button);
        gatherButton.setIcon(R.drawable.dashboard_gather);

        HexButton craftButton = (HexButton) findViewById(R.id.craft_button);
        craftButton.setIcon(R.drawable.dashboard_craft);

        HexButton backpackButton = (HexButton) findViewById(R.id.backpack_button);
        backpackButton.setIcon(R.drawable.dashboard_backpack);

        HexButton shopButton = (HexButton) findViewById(R.id.shop_button);
        shopButton.setIcon(R.drawable.dashboard_shop);

        HexButton mapButton = (HexButton) findViewById(R.id.map_button);
        mapButton.setIcon(R.drawable.dashboard_map);

        HexButton exploreButton = (HexButton) findViewById(R.id.explore_button);
        exploreButton.setIcon(R.drawable.dashboard_explore);

        HexButton cookingPotButton = (HexButton) findViewById(R.id.cooking_pot_button);
        cookingPotButton.setIcon(R.drawable.dashboard_cooking_pot);

        HexButton shelterButton = (HexButton) findViewById(R.id.shelter_button);
        shelterButton.setIcon(R.drawable.dashboard_shelter);

        HexButton journalButton = (HexButton) findViewById(R.id.journal_button);
        journalButton.setIcon(R.drawable.dashboard_journal);
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
        hungerValueTextView.setText(String.valueOf(Session.currentSaveFile.getHunger()) + "/"
                + String.valueOf(Session.currentSaveFile.getDifficulty().getMAX_HUNGER()));
    }

    private void refreshThirst(){
        thirstProgressBar.setMax(Session.currentSaveFile.getDifficulty().getMAX_THIRST());
        thirstProgressBar.setProgress(Session.currentSaveFile.getThirst());
        thirstValueTextView.setText(String.valueOf(Session.currentSaveFile.getThirst()) + "/"
                + String.valueOf(Session.currentSaveFile.getDifficulty().getMAX_THIRST()));
    }

    private void refreshHealth(){
        healthProgressBar.setMax(Session.currentSaveFile.getDifficulty().getMAX_HEALTH());
        healthProgressBar.setProgress(Session.currentSaveFile.getHealth());
        healthValueTextView.setText(String.valueOf(Session.currentSaveFile.getHealth()) + "/"
                + String.valueOf(Session.currentSaveFile.getDifficulty().getMAX_HEALTH()));
    }

    private void refreshStamina(){
        staminaProgressBar.setMax(Session.currentSaveFile.getDifficulty().getMAX_STAMINA());
        staminaProgressBar.setProgress(Session.currentSaveFile.getStamina());
        staminaValueTextView.setText(String.valueOf(Session.currentSaveFile.getStamina()) + "/"
                + String.valueOf(Session.currentSaveFile.getDifficulty().getMAX_STAMINA()));
    }

    private void refreshHeat(){
        heatProgressBar.setMax(Session.currentSaveFile.getDifficulty().getMAX_HEAT());
        heatProgressBar.setProgress(Session.currentSaveFile.getHeat());
        heatValueTextView.setText(String.valueOf(Session.currentSaveFile.getHeat()) + "/"
                + String.valueOf(Session.currentSaveFile.getDifficulty().getMAX_HEAT()));
    }
}