package com.avoid.ihaveatheory.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.widget.HexButton;
import com.avoid.ihaveatheory.widget.draw.HexButtonDrawable;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        HexButton gatherButton = (HexButton) findViewById(R.id.gather_button);
        HexButton craftButton = (HexButton) findViewById(R.id.craft_button);
        HexButton backpackButton = (HexButton) findViewById(R.id.backpack_button);
        HexButton shopButton = (HexButton) findViewById(R.id.shop_button);
        HexButton mapButton = (HexButton) findViewById(R.id.map_button);
        HexButton exploreButton = (HexButton) findViewById(R.id.explore_button);
        HexButton cookingPotButton = (HexButton) findViewById(R.id.cooking_pot_button);
        HexButton shelterButton = (HexButton) findViewById(R.id.shelter_button);
        HexButton journalButton = (HexButton) findViewById(R.id.journal_button);

        gatherButton.setIcon(R.drawable.dashboard_gather);
        craftButton.setIcon(R.drawable.dashboard_craft);
        backpackButton.setIcon(R.drawable.dashboard_backpack);
        shopButton.setIcon(R.drawable.dashboard_shop);
        mapButton.setIcon(R.drawable.dashboard_map);
        exploreButton.setIcon(R.drawable.dashboard_explore);
        cookingPotButton.setIcon(R.drawable.dashboard_cooking_pot);
        shelterButton.setIcon(R.drawable.dashboard_shelter);
        journalButton.setIcon(R.drawable.dashboard_journal);
    }
}
