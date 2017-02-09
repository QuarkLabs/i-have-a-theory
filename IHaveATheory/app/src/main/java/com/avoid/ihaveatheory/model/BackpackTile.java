package com.avoid.ihaveatheory.model;

public class BackpackTile {
    private Item item = null;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void removeItem() {
        item = null;
    }

    public boolean isEmpty(){
        return item == null;
    }
}
