package com.avoid.ihaveatheory.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.model.PlaybleActivity;

public class CraftActivity extends AppCompatActivity implements PlaybleActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_craft);
    }

    @Override
    public void setBackground() {
        RelativeLayout layout =(RelativeLayout)findViewById(R.id.activity_crafting);
        layout.setBackgroundResource(Session.currentSaveFile.getScenario().getDayBackground());
    }

    @Override
    public void setIcons() {

    }

    public void onClickBackButton(View view) {
        startActivity(new Intent(CraftActivity.this, DashboardActivity.class));
    }

    public void onClickCraftBowButton(View view) {
    }

    public void onClickCraftArrowButton(View view) {
    }

    public void onClickCraftSnareButton(View view) {
    }

    public void onClickCraftKnifeButton(View view) {
    }

    public void onClickCraftSlippersButton(View view) {
    }

    public void onClickCraftHatButton(View view) {
    }

    public void onClickCraftWalkingStickButton(View view) {
    }

    public void onClickCraftSmallPouchButton(View view) {
    }

    public void onClickCraftPouchButton(View view) {
    }

    public void onClickCraftBlanketButton(View view) {
    }

    public void onClickCraftHookButton(View view) {
    }

    public void onClickCraftRopeButton(View view) {
    }
}
