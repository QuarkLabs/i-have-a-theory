package com.avoid.ihaveatheory.model.item

import java.io.Serializable

abstract class Item : Serializable {
    var itemType: ItemType
    var name: Int = 0
    var description: Int = 0
    var image: Int = 0

    constructor(itemType: ItemType, name: Int, description: Int, image: Int) {
        this.itemType = itemType
        this.name = name
        this.description = description
        this.image = image
    }
}
