package com.avoid.ihaveatheory.game

import org.jetbrains.annotations.Contract

class Gather {

    fun findWater(): Int {
        return 5
    }

    fun findBerries(): Int {
        return 10
    }

    fun findWood(): Int {
        return 3
    }

    fun findRabbits(): Int {
        return 1
    }

    companion object {

        @get:Contract(pure = true)
        val instance = Gather()

    }
}
