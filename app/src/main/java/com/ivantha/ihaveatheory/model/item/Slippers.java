package com.ivantha.ihaveatheory.model.item;

import com.ivantha.ihaveatheory.R;

public class Slippers extends Item {
    public Slippers() {
        itemType = ItemType.SLIPPERS;
        name = R.string.item_slippers_name;
        description = R.string.item_slippers_des;
        image = R.drawable.default_icon_png;
    }
}
