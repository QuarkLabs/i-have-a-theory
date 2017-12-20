package com.ivantha.ihaveatheory.model.item;


import com.ivantha.ihaveatheory.R;

public class Knife extends Item {
    public Knife() {
        itemType = ItemType.KNIFE;
        name = R.string.item_knife_name;
        description = R.string.item_knife_des;
        image = R.drawable.default_icon_png;
    }
}