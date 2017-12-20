package com.ivantha.ihaveatheory.model;

import com.ivantha.ihaveatheory.exception.ItemTypeMismatchException;
import com.ivantha.ihaveatheory.exception.NonExistingObjectCallException;
import com.ivantha.ihaveatheory.model.BackpackTile;
import com.ivantha.ihaveatheory.model.item.Item;
import com.ivantha.ihaveatheory.model.item.ItemType;
import com.ivantha.ihaveatheory.model.item.Meat;
import com.ivantha.ihaveatheory.model.item.WaterBottle;
import com.ivantha.ihaveatheory.model.item.Wood;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Backpack implements Serializable {
    private HashMap<ItemType, Integer> items = new HashMap<>();

    private ArrayList<BackpackTile> col1 = new ArrayList<>();
    private ArrayList<BackpackTile> col2 = new ArrayList<>();
    private ArrayList<BackpackTile> col3 = new ArrayList<>();

    public Backpack() {
        for (int i = 0; i < 6; i++) {
            col1.add(new BackpackTile());
            col2.add(new BackpackTile());
            col3.add(new BackpackTile());
        }

        // Add initial 5 meat
        items.put(ItemType.MEAT, 5);
        for (int i = 0; i < 5; i++) {
            try {
                col1.get(1).addItem(new Meat());
            } catch (ItemTypeMismatchException e) {
                e.printStackTrace();
            }
        }

        // Add initial 10 water bottles
        items.put(ItemType.WATER_BOTTLE, 10);
        for (int i = 0; i < 10; i++) {
            try {
                col2.get(0).addItem(new WaterBottle());
            } catch (ItemTypeMismatchException e) {
                e.printStackTrace();
            }
        }

        // Add initial 8 wood
        items.put(ItemType.WOOD, 8);
        for (int i = 0; i < 8; i++) {
            try {
                col3.get(2).addItem(new Wood());
            } catch (ItemTypeMismatchException e) {
                e.printStackTrace();
            }
        }
    }

    public void addItem(Item item, int qty) {
        if (isInBackpack(item.getItemType())) {
            items.put(item.getItemType(), items.get(item.getItemType()) + qty);
        } else {
            items.put(item.getItemType(), qty);

            //////////////////////// Must add item to the column

        }
    }

    public void removeItems(ItemType itemType, int qty) throws NonExistingObjectCallException {
        if (isInBackpack(itemType)) {
            int currentQty = items.get(itemType);
            int newQty = currentQty - qty;
            if (newQty < 0) {
                newQty = 0;
            }
            items.put(itemType, newQty);

            ///////////////// Must remove items from the column

        } else {
            throw new NonExistingObjectCallException();
        }
    }

    public boolean isInBackpack(ItemType itemType) {
        return items.containsKey(itemType);
    }

    public int getItemCount(ItemType itemType) {
        if (isInBackpack(itemType)) {
            return items.get(itemType);
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

