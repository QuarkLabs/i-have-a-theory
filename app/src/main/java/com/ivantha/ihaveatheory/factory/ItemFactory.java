package com.ivantha.ihaveatheory.factory;

import com.ivantha.ihaveatheory.model.item.Arrow;
import com.ivantha.ihaveatheory.model.item.Berries;
import com.ivantha.ihaveatheory.model.item.Blanket;
import com.ivantha.ihaveatheory.model.item.Bow;
import com.ivantha.ihaveatheory.model.item.Hat;
import com.ivantha.ihaveatheory.model.item.Hook;
import com.ivantha.ihaveatheory.model.item.Item;
import com.ivantha.ihaveatheory.model.item.ItemType;
import com.ivantha.ihaveatheory.model.item.Meat;
import com.ivantha.ihaveatheory.model.item.Pouch;
import com.ivantha.ihaveatheory.model.item.Slippers;
import com.ivantha.ihaveatheory.model.item.SmallPouch;
import com.ivantha.ihaveatheory.model.item.Snare;
import com.ivantha.ihaveatheory.model.item.WalkingStick;
import com.ivantha.ihaveatheory.model.item.WaterBottle;
import com.ivantha.ihaveatheory.model.item.Wood;

public class ItemFactory {
    public static Item getItem(ItemType itemType){
        Item item;
        switch (itemType){
            case BOW:
                item = new Bow();
                break;
            case ARROW:
                item = new Arrow();
                break;
            case SNARE:
                item = new Snare();
                break;
            case KNIFE:
                item = new Snare();
                break;
            case SLIPPERS:
                item = new Slippers();
                break;
            case HAT:
                item = new Hat();
                break;
            case WALKING_STICK:
                item = new WalkingStick();
                break;
            case SMALL_POUCH:
                item = new SmallPouch();
                break;
            case POUCH:
                item = new Pouch();
                break;
            case BLANKET:
                item = new Blanket();
                break;
            case HOOK:
                item = new Hook();
                break;
            case ROPE:
                item = new Hook();
                break;
            case WATER_BOTTLE:
                item = new WaterBottle();
                break;
            case BERRIES:
                item = new Berries();
                break;
            case WOOD:
                item = new Wood();
                break;
            case MEAT:
                item = new Meat();
                break;
            default:
                item = new Item() {};
        }

        return item;
    }
}
