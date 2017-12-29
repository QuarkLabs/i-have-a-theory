package com.avoid.ihaveatheory.game

import org.jetbrains.annotations.Contract

class Gather {

    companion object {

        @get:Contract(pure = true)
        val instance = Gather()

        @JvmStatic
        fun findWater(): Int {
            return 5
        }

        @JvmStatic
        fun findBerries(): Int {
            return 10
        }

        @JvmStatic
        fun findWood(): Int {
            return 3
        }

        @JvmStatic
        fun findRabbits(): Int {
            return 1
        }

    }
}
