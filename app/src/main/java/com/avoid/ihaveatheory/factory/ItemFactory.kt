package com.avoid.ihaveatheory.factory

import com.avoid.ihaveatheory.model.item.*

object ItemFactory {

    @JvmStatic
    fun getItem(itemType: ItemType): Item {
        var item: Item? = null
        when (itemType) {
            ItemType.BOW -> item = Bow()
            ItemType.ARROW -> item = Arrow()
            ItemType.SNARE -> item = Snare()
            ItemType.KNIFE -> item = Snare()
            ItemType.SLIPPERS -> item = Slippers()
            ItemType.HAT -> item = Hat()
            ItemType.WALKING_STICK -> item = WalkingStick()
            ItemType.SMALL_POUCH -> item = SmallPouch()
            ItemType.POUCH -> item = Pouch()
            ItemType.BLANKET -> item = Blanket()
            ItemType.HOOK -> item = Hook()
            ItemType.ROPE -> item = Hook()
            ItemType.WATER_BOTTLE -> item = WaterBottle()
            ItemType.BERRIES -> item = Berries()
            ItemType.WOOD -> item = Wood()
            ItemType.MEAT -> item = Meat()
        }

        return item
    }
}
