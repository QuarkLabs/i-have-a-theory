package com.avoid.ihaveatheory.model;

import com.avoid.ihaveatheory.exception.ItemTypeMismatchException;
import com.avoid.ihaveatheory.exception.NonExistingObjectCallException;
import com.avoid.ihaveatheory.model.item.Item;
import com.avoid.ihaveatheory.model.item.ItemType;

import java.io.Serializable;
import java.util.ArrayList;

public class BackpackTile implements Serializable {
    private ArrayList<Item> itemArrayList = null;

    public BackpackTile() {
        itemArrayList = new ArrayList<>();
    }

    public ArrayList<Item> getItemArrayList() {
        return itemArrayList;
    }

    public Item getItem() throws NonExistingObjectCallException {
        if (!isEmpty()) {
            return itemArrayList.get(0);
        } else {
            throw new NonExistingObjectCallException();
        }
    }

    public void addItem(Item item) throws ItemTypeMismatchException {
        if (isEmpty() || (!isEmpty() && item.getItemType() == item.getItemType())) {
            itemArrayList.add(item);
        } else {
            throw new ItemTypeMismatchException();
        }
    }

    public int getQty() {
        return itemArrayList.size();
    }

    public ItemType getItemType() throws NonExistingObjectCallException {
        if (!isEmpty()) {
            return itemArrayList.get(0).getItemType();
        } else {
            throw new NonExistingObjectCallException();
        }
    }

    public void removeOneItem() throws NonExistingObjectCallException {
        if (!isEmpty()) {
            itemArrayList.remove(0);
        } else {
            throw new NonExistingObjectCallException();
        }
    }

    public void removeAllItems() throws NonExistingObjectCallException {
        if (!isEmpty()) {
            itemArrayList.clear();
        } else {
            throw new NonExistingObjectCallException();
        }
    }

    public boolean isEmpty() {
        return getQty() == 0;
    }
}
