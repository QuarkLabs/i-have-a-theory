package com.avoid.ihaveatheory.model

import java.io.Serializable

class Difficulty : Serializable {
    var maX_HEALTH: Int = 0
    var maX_STAMINA: Int = 0
    var maX_HEAT: Int = 0
    var maX_HUNGER: Int = 0
    var maX_THIRST: Int = 0

    fun setEasyDifficulty() {
        maX_HEALTH = 300
        maX_STAMINA = 300
        maX_HEAT = 300
        maX_HUNGER = 300
        maX_THIRST = 300
    }
}
