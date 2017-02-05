package com.avoid.ihaveatheory.model;

import java.util.HashMap;

public class Backpack {
    private HashMap<ItemType, Item> items = new HashMap<>();

    public Backpack() {
        Item meat = new Item(ItemType.MEAT);
        meat.setQty(5);

        Item waterBottles = new Item(ItemType.WATER_BOTTLE);
        waterBottles.setQty(10);

        Item wood = new Item(ItemType.WOOD);
        wood.setQty(8);

        items.put(ItemType.MEAT, meat);
        items.put(ItemType.WATER_BOTTLE, waterBottles);
        items.put(ItemType.WOOD, wood);
    }

    public void addItem(ItemType itemType, int qty) {
        if (isInBackpack(itemType)) {
            items.get(itemType).setQty(items.get(itemType).getQty() + qty);
        } else {
            Item item = new Item(itemType);
            item.setQty(qty);
            items.put(itemType, item);
        }
    }

    public void removeItem(ItemType itemType, int qty) {
        if (isInBackpack(itemType)) {
            int currentQty = items.get(itemType).getQty();
            int newQty = currentQty - qty;
            if (newQty < 0) {
                newQty = 0;
            }
            items.get(itemType).setQty(newQty);
        }
    }

    public boolean isInBackpack(ItemType itemType) {
        return items.containsKey(itemType);
    }

    public int getItemCount(ItemType itemType) {
        if (isInBackpack(itemType)) {
            return items.get(itemType).getQty();
        } else {
            return 0;
        }
    }
}

