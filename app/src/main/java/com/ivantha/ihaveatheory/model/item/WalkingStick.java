package com.ivantha.ihaveatheory.model.item;


import com.ivantha.ihaveatheory.R;

public class WalkingStick extends Item {
    public WalkingStick() {
        itemType = ItemType.WALKING_STICK;
        name = R.string.item_walking_stick_name;
        description = R.string.item_walking_stick_des;
        image = R.drawable.default_icon_png;
    }
}
