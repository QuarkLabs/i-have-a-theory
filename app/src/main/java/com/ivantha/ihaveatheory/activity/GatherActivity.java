package com.ivantha.ihaveatheory.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.avoid.ihaveatheory.game.Gather;
import com.ivantha.ihaveatheory.R;
import com.ivantha.ihaveatheory.global.Session;
import com.ivantha.ihaveatheory.model.PlaybleActivity;
import com.ivantha.ihaveatheory.model.item.Berries;
import com.ivantha.ihaveatheory.model.item.Item;
import com.ivantha.ihaveatheory.model.item.Meat;
import com.ivantha.ihaveatheory.model.item.WaterBottle;
import com.ivantha.ihaveatheory.model.item.Wood;
import com.ivantha.ihaveatheory.util.Controller;

public class GatherActivity extends AppCompatActivity implements PlaybleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gather);
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
        Item waterBottle = new WaterBottle();
        Session.currentSaveFile.getBackpack().addItem(waterBottle, waterCount);

        Controller.showProgress(GatherActivity.this, "Collecting water....", "15 minutes");
    }

    public void onClickGatherBerriesButton(View view) {
        MainMenuActivity.playClickSound();
        int berryCount = Gather.getInstance().findBerries();
        Item berries = new Berries();
        Session.currentSaveFile.getBackpack().addItem(berries, berryCount);

        Controller.showProgress(GatherActivity.this, "Finding berries....", "30 minutes");
    }

    public void onClickGatherWoodButton(View view) {
        MainMenuActivity.playClickSound();
        int woodCount = Gather.getInstance().findWood();
        Item wood = new Wood();
        Session.currentSaveFile.getBackpack().addItem(wood, woodCount);

        Controller.showProgress(GatherActivity.this, "Gathering wood....", "30 minutes");
    }

    public void onClickHuntButton(View view) {
        MainMenuActivity.playClickSound();
        int rabbitCount = Gather.getInstance().findRabbits();
        Item meat = new Meat();
        Session.currentSaveFile.getBackpack().addItem(meat, rabbitCount);

        Controller.showProgress(GatherActivity.this, "Hunting....", "2 hours");
    }
}