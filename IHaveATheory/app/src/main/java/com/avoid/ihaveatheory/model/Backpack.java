package com.avoid.ihaveatheory.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Backpack {
    private HashMap<ItemType, Item> items = new HashMap<>();

    private ArrayList<BackpackTile> col1 = new ArrayList<>();
    private ArrayList<BackpackTile> col2 = new ArrayList<>();
    private ArrayList<BackpackTile> col3 = new ArrayList<>();

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

        for (int i = 0; i < 6; i++){
            col1.add(new BackpackTile());
            col2.add(new BackpackTile());
            col3.add(new BackpackTile());
        }

        col1.get(1).setItem(meat);
        col2.get(0).setItem(waterBottles);
        col3.get(2).setItem(wood);
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

    public ArrayList<BackpackTile> getCol1() {
        return col1;
    }

    public ArrayList<BackpackTile> getCol2() {
        return col2;
    }

    public ArrayList<BackpackTile> getCol3() {
        return col3;
    }
}

