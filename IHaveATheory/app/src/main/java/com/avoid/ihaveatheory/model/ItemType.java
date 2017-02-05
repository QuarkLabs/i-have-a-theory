package com.avoid.ihaveatheory.model;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.util.MyApp;

public enum ItemType {
    BOW(MyApp.context.getResources().getString(R.string.item_bow_name),
            MyApp.context.getResources().getString(R.string.item_bow_des),
            100),

    ARROW(MyApp.context.getResources().getString(R.string.item_arrow_name),
            MyApp.context.getResources().getString(R.string.item_arrow_des),
            100),

    SNARE(MyApp.context.getResources().getString(R.string.item_snare_name),
            MyApp.context.getResources().getString(R.string.item_snare_des),
            100),

    KNIFE(MyApp.context.getResources().getString(R.string.item_knife_name),
            MyApp.context.getResources().getString(R.string.item_knife_des),
            100),

    SLIPPERS(MyApp.context.getResources().getString(R.string.item_slippers_name),
            MyApp.context.getResources().getString(R.string.item_slippers_des),
            100),

    HAT(MyApp.context.getResources().getString(R.string.item_hat_name),
            MyApp.context.getResources().getString(R.string.item_hat_des),
            100),

    WALKING_STICK(MyApp.context.getResources().getString(R.string.item_walking_stick_name),
            MyApp.context.getResources().getString(R.string.item_walking_stick_des),
            100),

    SAMLL_POUCH(MyApp.context.getResources().getString(R.string.item_small_pouch_name),
            MyApp.context.getResources().getString(R.string.item_small_pouch_des),
            100),

    POUCH(MyApp.context.getResources().getString(R.string.item_pouch_name),
            MyApp.context.getResources().getString(R.string.item_pouch_des),
            100),

    BLANKET(MyApp.context.getResources().getString(R.string.item_blanket_name),
            MyApp.context.getResources().getString(R.string.item_blanket_des),
            100),

    HOOK(MyApp.context.getResources().getString(R.string.item_hook_name),
            MyApp.context.getResources().getString(R.string.item_hook_des),
            100),

    ROPE(MyApp.context.getResources().getString(R.string.item_rope_name),
            MyApp.context.getResources().getString(R.string.item_rope_des),
            100);

    private String name;
    private String description;
    private int craftTime;

    ItemType(String name, String description, int craftTime) {
        this.name = name;
        this.description = description;
        this.craftTime = craftTime;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCraftTime() {
        return craftTime;
    }
}
