package com.ivantha.ihaveatheory.model.item;


import com.ivantha.ihaveatheory.R;

public class Pouch extends Item {
    public Pouch() {
        itemType = ItemType.POUCH;
        name = R.string.item_pouch_name;
        description = R.string.item_pouch_des;
        image = R.drawable.default_icon_png;
    }
}
