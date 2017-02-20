package com.avoid.ihaveatheory.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.model.PlaybleActivity;
import com.avoid.ihaveatheory.model.item.ItemType;
import com.avoid.ihaveatheory.widget.DescriptionTextView;

public class CraftActivity extends AppCompatActivity implements PlaybleActivity{
    private ImageView itemImageView;
    private DescriptionTextView itemNameTextView;
    private DescriptionTextView itemDesTextView;

    private ItemType selectedItemType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_craft);

        itemImageView = (ImageView)findViewById(R.id.item_image_view);
        itemNameTextView = (DescriptionTextView) findViewById(R.id.item_name_text_view);
        itemDesTextView = (DescriptionTextView) findViewById(R.id.item_des_text_view);
    }

    @Override
    public void setBackground() {
        RelativeLayout layout =(RelativeLayout)findViewById(R.id.activity_crafting);
        layout.setBackgroundResource(Session.currentSaveFile.getScenario().getDayBackground());
    }

    @Override
    public void setIcons() {

    }

    public void onClickMakeButton(View view) {
        MainMenuActivity.playClickSound();
    }

    public void onClickBackButton(View view) {
        MainMenuActivity.playClickSound();
        startActivity(new Intent(CraftActivity.this, DashboardActivity.class));
    }

    public void onClickCraftBowButton(View view) {
        changeItem(ItemType.BOW);
    }

    public void onClickCraftArrowButton(View view) {
        changeItem(ItemType.ARROW);
    }

    public void onClickCraftSnareButton(View view) {
        changeItem(ItemType.SNARE);
    }

    public void onClickCraftKnifeButton(View view) {
        changeItem(ItemType.KNIFE);
    }

    public void onClickCraftSlippersButton(View view) {
        changeItem(ItemType.SLIPPERS);
    }

    public void onClickCraftHatButton(View view) {
        changeItem(ItemType.HAT);
    }

    public void onClickCraftWalkingStickButton(View view) {
        changeItem(ItemType.WALKING_STICK);
    }

    public void onClickCraftSmallPouchButton(View view) {
        changeItem(ItemType.SMALL_POUCH);
    }

    public void onClickCraftPouchButton(View view) {
        changeItem(ItemType.POUCH);
    }

    public void onClickCraftBlanketButton(View view) {
        changeItem(ItemType.BLANKET);
    }

    public void onClickCraftHookButton(View view) {
        changeItem(ItemType.HOOK);
    }

    public void onClickCraftRopeButton(View view) {
        changeItem(ItemType.ROPE);
    }

    public ItemType getSelectedItemType() {
        return selectedItemType;
    }

    public void setSelectedItemType(ItemType selectedItemType) {
        this.selectedItemType = selectedItemType;
    }

    public void changeItem(ItemType itemType){
//        itemImageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(), itemType.getItemImage(), null));
//        itemNameTextView.setText(getResources().getString(itemType.getName()));
//        itemDesTextView.setText(getResources().getString(itemType.getDescription()));

        setSelectedItemType(itemType);
    }
}
