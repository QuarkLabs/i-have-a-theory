package com.ivantha.ihaveatheory.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.ivantha.ihaveatheory.R;
import com.ivantha.ihaveatheory.factory.ItemFactory;
import com.ivantha.ihaveatheory.global.Session;
import com.ivantha.ihaveatheory.model.PlaybleActivity;
import com.ivantha.ihaveatheory.model.item.Item;
import com.ivantha.ihaveatheory.model.item.ItemType;
import com.ivantha.ihaveatheory.widget.DescriptionTextView;

public class CraftActivity extends AppCompatActivity implements PlaybleActivity {
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
        Item item = ItemFactory.getItem(itemType);
        itemImageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(), item.getImage(), null));
        itemNameTextView.setText(getResources().getString(item.getName()));
        itemDesTextView.setText(getResources().getString(item.getDescription()));

        setSelectedItemType(itemType);
    }
}
