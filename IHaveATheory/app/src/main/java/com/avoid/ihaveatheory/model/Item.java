package com.avoid.ihaveatheory.model;

public class Item {
    private ItemType itemType = null;
    private int qty = 0;

    public Item(ItemType itemType) {
        this.itemType = itemType;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
