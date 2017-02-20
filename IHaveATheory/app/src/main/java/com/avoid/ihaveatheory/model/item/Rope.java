package com.avoid.ihaveatheory.model.item;

import com.avoid.ihaveatheory.R;

public class Rope extends Item {
    public Rope() {
        itemType = ItemType.ROPE;
        name = R.string.item_rope_name;
        description = R.string.item_rope_des;
        image = R.drawable.default_icon_png;
    }
}
