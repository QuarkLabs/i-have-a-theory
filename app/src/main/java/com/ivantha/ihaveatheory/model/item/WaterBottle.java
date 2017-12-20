package com.ivantha.ihaveatheory.model.item;


import com.ivantha.ihaveatheory.R;

public class WaterBottle extends Item {
    public WaterBottle() {
        itemType = ItemType.WATER_BOTTLE;
        name = R.string.item_water_name;
        description = R.string.item_water_des;
        image = R.drawable.default_icon_png;
    }
}
