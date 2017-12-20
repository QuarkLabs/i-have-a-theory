package com.ivantha.ihaveatheory.model.item;


import com.ivantha.ihaveatheory.R;

public class Snare extends Item {
    public Snare() {
        itemType = ItemType.SNARE;
        name = R.string.item_snare_name;
        description = R.string.item_snare_des;
        image = R.drawable.default_icon_png;
    }
}
