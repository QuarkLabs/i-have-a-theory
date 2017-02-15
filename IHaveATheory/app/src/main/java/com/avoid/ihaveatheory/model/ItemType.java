package com.avoid.ihaveatheory.model;

import com.avoid.ihaveatheory.R;

public enum ItemType {
    BOW(R.string.item_bow_name,
            R.string.item_bow_des,
            R.drawable.item_bow),

    ARROW(R.string.item_arrow_name,
            R.string.item_arrow_des,
            R.drawable.item_arrows),

    SNARE(R.string.item_snare_name,
            R.string.item_snare_des,
            R.drawable.item_snare),

    KNIFE(R.string.item_knife_name,
            R.string.item_knife_des,
            R.drawable.item_knife),

    SLIPPERS(R.string.item_slippers_name,
            R.string.item_slippers_des,
            R.drawable.item_slippers),

    HAT(R.string.item_hat_name,
            R.string.item_hat_des,
            R.drawable.item_hat),

    WALKING_STICK(R.string.item_walking_stick_name,
            R.string.item_walking_stick_des,
            R.drawable.item_walking_stick),

    SMALL_POUCH(R.string.item_small_pouch_name,
            R.string.item_small_pouch_des,
            R.drawable.default_icon_png),

    POUCH(R.string.item_pouch_name,
            R.string.item_pouch_des,
            R.drawable.item_pouch),

    BLANKET(R.string.item_blanket_name,
            R.string.item_blanket_des,
            R.drawable.item_blanket),

    HOOK(R.string.item_hook_name,
            R.string.item_hook_des,
            R.drawable.item_hook),

    ROPE(R.string.item_rope_name,
            R.string.item_rope_des,
            R.drawable.item_rope),

    WATER_BOTTLE(R.string.item_water_name,
            R.string.item_water_des,
            R.drawable.default_icon_png),

    BERRIES(R.string.item_berries_name,
            R.string.item_berries_des,
            R.drawable.default_icon_png),

    WOOD(R.string.item_wood_name,
            R.string.item_wood_des,
            R.drawable.default_icon_png),

    MEAT(R.string.item_meat_name,
            R.string.item_meat_des,
            R.drawable.default_icon_png);

    private int name;
    private int description;
    private int itemImage;

    ItemType(int name, int description, int itemImage) {
        this.name = name;
        this.description = description;
        this.itemImage = itemImage;
    }

    public int getName() {
        return name;
    }

    public int getDescription() {
        return description;
    }

    public int getItemImage() {
        return itemImage;
    }
}
