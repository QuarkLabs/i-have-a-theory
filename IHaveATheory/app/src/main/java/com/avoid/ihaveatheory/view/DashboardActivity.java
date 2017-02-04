package com.avoid.ihaveatheory.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.model.PlaybleActivity;
import com.avoid.ihaveatheory.widget.HexButton;

public class DashboardActivity extends AppCompatActivity implements PlaybleActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

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

        setBackground();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Session.saveFileHandler.saveGame();
    }

    public void onClickGatherButton(View view) {
    }

    public void onClickCraftButton(View view) {
    }

    public void onClickBackpackButton(View view) {
    }

    public void onClickShelterButton(View view) {
    }

    public void onClickJournalButton(View view) {
        Toast.makeText(getApplicationContext(), "This feature is not yet implemented.", Toast.LENGTH_LONG).show();
    }

    public void onClickShopButton(View view) {
        Toast.makeText(getApplicationContext(), "This feature is not yet implemented.", Toast.LENGTH_LONG).show();
    }

    public void onClickMapButton(View view) {
        Toast.makeText(getApplicationContext(), "This feature is not yet implemented.", Toast.LENGTH_LONG).show();
    }

    public void onClickExploreButton(View view) {
    }

    public void onClickCookingPotButton(View view) {
        Toast.makeText(getApplicationContext(), "This feature is not yet implemented.", Toast.LENGTH_LONG).show();
    }

    @Override
    public void setBackground() {
        RelativeLayout layout =(RelativeLayout)findViewById(R.id.activity_dashboard);
        layout.setBackgroundResource(Session.currentSaveFile.getScenario().getDayBackground());
    }
}