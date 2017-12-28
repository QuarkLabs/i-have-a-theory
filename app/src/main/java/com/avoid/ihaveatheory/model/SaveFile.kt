package com.avoid.ihaveatheory.model

import java.io.Serializable

class SaveFile : Serializable {

    var name = "default"
    var scenario: Scenario? = null
    var difficulty: Difficulty? = null

    var backpack: Backpack? = null

    var health = 0
        set(health) = if (health > difficulty!!.maX_HEALTH) {
            field = difficulty!!.maX_HEALTH
        } else if (health < 0) {
            field = 0
        } else {
            field = health
        }
    var stamina = 0
        set(stamina) = if (stamina > difficulty!!.maX_STAMINA) {
            field = difficulty!!.maX_STAMINA
        } else if (stamina < 0) {
            field = 0
        } else {
            field = stamina
        }
    var heat = 0
        set(heat) = if (heat > difficulty!!.maX_HEAT) {
            field = difficulty!!.maX_HEAT
        } else if (heat < 0) {
            field = 0
        } else {
            field = heat
        }
    var hunger = 0
        set(hunger) = if (hunger > difficulty!!.maX_HUNGER) {
            field = difficulty!!.maX_HUNGER
        } else if (hunger < 0) {
            field = 0
        } else {
            field = hunger
        }
    var thirst = 0
        set(thirst) = if (thirst > difficulty!!.maX_THIRST) {
            field = difficulty!!.maX_THIRST
        } else if (thirst < 0) {
            field = 0
        } else {
            field = thirst
        }

}
