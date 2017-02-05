package com.avoid.ihaveatheory.model;

public class Item {
    private ItemType itemType = null;

    public Item(ItemType itemType) {
        this.itemType = itemType;
    }

    public ItemType getItemType() {
        return itemType;
    }
}
