package com.avoid.ihaveatheory.model;

import java.util.HashMap;

public class Backpack {
    private HashMap<ItemType, Item> items = new HashMap<>();

    public HashMap<ItemType, Item> getItems() {
        return items;
    }

    public void setItems(HashMap<ItemType, Item> items) {
        this.items = items;
    }

    public void addItem(ItemType itemType, int qty){

    }

    public void removeItem(ItemType itemType, int qty){

    }
}

