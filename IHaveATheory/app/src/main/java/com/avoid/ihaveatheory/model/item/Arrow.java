package com.avoid.ihaveatheory.model.item;

import com.avoid.ihaveatheory.R;

public class Arrow extends Item {
    public Arrow() {
        itemType = ItemType.ARROW;
        name = R.string.item_arrow_name;
        description = R.string.item_arrow_des;
        image = R.drawable.default_icon_png;
    }
}
