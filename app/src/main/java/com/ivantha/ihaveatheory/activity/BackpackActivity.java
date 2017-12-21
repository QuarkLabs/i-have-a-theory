package com.ivantha.ihaveatheory.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.ivantha.ihaveatheory.R;
import com.ivantha.ihaveatheory.exception.NonExistingObjectCallException;
import com.ivantha.ihaveatheory.global.Session;
import com.ivantha.ihaveatheory.model.BackpackTile;
import com.ivantha.ihaveatheory.model.PlaybleActivity;
import com.ivantha.ihaveatheory.widget.BackpackItemButton;
import com.ivantha.ihaveatheory.widget.BackpackTileLayout;

public class BackpackActivity extends AppCompatActivity implements PlaybleActivity {
    private LinearLayout col1LinearLayout = null;
    private LinearLayout col2LinearLayout = null;
    private LinearLayout col3LinearLayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backpack);

        col1LinearLayout = (LinearLayout) findViewById(R.id.backpack_col1_linear_layout);
        col2LinearLayout = (LinearLayout) findViewById(R.id.backpack_col2_linear_layout);
        col3LinearLayout = (LinearLayout) findViewById(R.id.backpack_col3_linear_layout);

        arrangeBackpack();
    }

    @Override
    public void setBackground() {
        RelativeLayout layout =(RelativeLayout)findViewById(R.id.activity_backpack);
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