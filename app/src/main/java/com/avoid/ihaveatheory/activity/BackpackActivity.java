package com.avoid.ihaveatheory.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.exception.NonExistingObjectCallException;
import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.model.BackpackTile;
import com.avoid.ihaveatheory.model.PlayableActivity;
import com.avoid.ihaveatheory.widget.BackpackItemButton;
import com.avoid.ihaveatheory.widget.BackpackTileLayout;

public class BackpackActivity extends AppCompatActivity implements PlayableActivity {
    private LinearLayout col1LinearLayout = null;
    private LinearLayout col2LinearLayout = null;
    private LinearLayout col3LinearLayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backpack);

        col1LinearLayout = findViewById(R.id.backpack_col1_linear_layout);
        col2LinearLayout = findViewById(R.id.backpack_col2_linear_layout);
        col3LinearLayout = findViewById(R.id.backpack_col3_linear_layout);

        arrangeBackpack();
    }

    @Override
    public void setBackground() {
        RelativeLayout layout = findViewById(R.id.activity_backpack);
        layout.setBackgroundResource(Session.currentSaveFile.getScenario().getDayBackground());
    }

    @Override
    public void setIcons() {

    }

    public void onClickBackButton(View view) {
        finish();
    }

    public void arrangeBackpack(){
        for(BackpackTile tile: Session.currentSaveFile.getBackpack().getCol1()){
            BackpackTileLayout tileLayout = new BackpackTileLayout(BackpackActivity.this);
            if(!tile.isEmpty()){
                BackpackItemButton itemButton = new BackpackItemButton(BackpackActivity.this);
                try {
                    itemButton.setIcon(tile.getItem().getImage());
                } catch (NonExistingObjectCallException e) {
                    e.printStackTrace();
                }
                tileLayout.addView(itemButton);
            }
            col1LinearLayout.addView(tileLayout);
        }

        for(BackpackTile tile: Session.currentSaveFile.getBackpack().getCol2()){
            BackpackTileLayout tileLayout = new BackpackTileLayout(BackpackActivity.this);
            if(!tile.isEmpty()){
                BackpackItemButton itemButton = new BackpackItemButton(BackpackActivity.this);
                try {
                    itemButton.setIcon(tile.getItem().getImage());
                } catch (NonExistingObjectCallException e) {
                    e.printStackTrace();
                }
                tileLayout.addView(itemButton);
            }
            col2LinearLayout.addView(tileLayout);
        }

        for(BackpackTile tile: Session.currentSaveFile.getBackpack().getCol3()){
            BackpackTileLayout tileLayout = new BackpackTileLayout(BackpackActivity.this);
            if(!tile.isEmpty()){
                BackpackItemButton itemButton = new BackpackItemButton(BackpackActivity.this);
                try {
                    itemButton.setIcon(tile.getItem().getImage());
                } catch (NonExistingObjectCallException e) {
                    e.printStackTrace();
                }
                tileLayout.addView(itemButton);
            }
            col3LinearLayout.addView(tileLayout);
        }
    }

    public void onClickMakeButton(View view) {
    }
}