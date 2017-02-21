package com.avoid.ihaveatheory.model.item;

import com.avoid.ihaveatheory.R;

public class Meat extends Item {
    public Meat() {
        itemType = ItemType.MEAT;
        name = R.string.item_meat_name;
        description = R.string.item_meat_des;
        image = R.drawable.default_icon_png;
    }
}
