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
}
