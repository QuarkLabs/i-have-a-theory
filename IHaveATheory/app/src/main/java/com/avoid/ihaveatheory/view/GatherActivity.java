package com.avoid.ihaveatheory.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.game.Gather;
import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.model.ItemType;
import com.avoid.ihaveatheory.model.PlaybleActivity;
import com.avoid.ihaveatheory.widget.HexButton;

public class GatherActivity extends AppCompatActivity implements PlaybleActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gather);

        HexButton collectWaterButton = (HexButton) findViewById(R.id.gather_water_button);
        collectWaterButton.setIcon(R.drawable.gather_water);

        HexButton findBerriesButton = (HexButton)findViewById(R.id.gather_berries_button);
        findBerriesButton.setIcon(R.drawable.gather_berry);

        HexButton gatherWoodButton = (HexButton)findViewById(R.id.gather_wood_button);
        gatherWoodButton.setIcon(R.drawable.gather_wood);

        HexButton huntButton = (HexButton)findViewById(R.id.gather_hunt_button);
        huntButton.setIcon(R.drawable.gather_hunt);
    }

    @Override
    public void setBackground() {
        RelativeLayout layout =(RelativeLayout)findViewById(R.id.activity_gather);
        layout.setBackgroundResource(Session.currentSaveFile.getScenario().getDayBackground());
    }

    @Override
    public void setIcons() {

    }


    public void onClickBackButton(View view) {
        MainMenuActivity.playClickSound();
        startActivity(new Intent(GatherActivity.this, DashboardActivity.class));
    }

    public void onClickGatherWaterButton(View view) {
        MainMenuActivity.playClickSound();
        int waterCount = Gather.getInstance().findWater();
        Session.currentSaveFile.getBackpack().addItem(ItemType.WATER_BOTTLE, waterCount);

        startActivity(new Intent(GatherActivity.this, ProgressActivity.class));
    }

    public void onClickGatherBerriesButton(View view) {
        MainMenuActivity.playClickSound();
        int berryCount = Gather.getInstance().findBerries();
        Session.currentSaveFile.getBackpack().addItem(ItemType.BERRIES, berryCount);

        startActivity(new Intent(GatherActivity.this, ProgressActivity.class));
    }

    public void onClickGatherWoodButton(View view) {
        MainMenuActivity.playClickSound();
        int woodCount = Gather.getInstance().findWood();
        Session.currentSaveFile.getBackpack().addItem(ItemType.WOOD, woodCount);

        startActivity(new Intent(GatherActivity.this, ProgressActivity.class));
    }

    public void onClickHuntButton(View view) {
        MainMenuActivity.playClickSound();
        int rabbitCount = Gather.getInstance().findRabbits();
        Session.currentSaveFile.getBackpack().addItem(ItemType.MEAT, rabbitCount);

        startActivity(new Intent(GatherActivity.this, ProgressActivity.class));
    }
}