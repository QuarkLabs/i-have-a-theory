package com.avoid.ihaveatheory.model

import com.avoid.ihaveatheory.exception.ItemTypeMismatchException
import com.avoid.ihaveatheory.exception.NonExistingObjectCallException
import com.avoid.ihaveatheory.model.item.Item
import com.avoid.ihaveatheory.model.item.ItemType

import java.io.Serializable
import java.util.ArrayList

class BackpackTile : Serializable {
    var itemArrayList: ArrayList<Item>? = null

    val item: Item
        @Throws(NonExistingObjectCallException::class)
        get() = if (!isEmpty) {
            itemArrayList!![0]
        } else {
            throw NonExistingObjectCallException()
        }

    val qty: Int
        get() = itemArrayList!!.size

    val itemType: ItemType
        @Throws(NonExistingObjectCallException::class)
        get() = if (!isEmpty) {
            itemArrayList!![0].itemType
        } else {
            throw NonExistingObjectCallException()
        }

    val isEmpty: Boolean
        get() = qty == 0

    init {
        itemArrayList = ArrayList()
    }

    @Throws(ItemTypeMismatchException::class)
    fun addItem(item: Item) {
        if (isEmpty || !isEmpty && item.itemType === item.itemType) {
            itemArrayList!!.add(item)
        } else {
            throw ItemTypeMismatchException()
        }
    }

    @Throws(NonExistingObjectCallException::class)
    fun removeOneItem() {
        if (!isEmpty) {
            itemArrayList!!.removeAt(0)
        } else {
            throw NonExistingObjectCallException()
        }
    }

    @Throws(NonExistingObjectCallException::class)
    fun removeAllItems() {
        if (!isEmpty) {
            itemArrayList!!.clear()
        } else {
            throw NonExistingObjectCallException()
        }
    }
}
