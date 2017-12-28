package com.avoid.ihaveatheory.model

import com.avoid.ihaveatheory.game.scene.Scene
import com.avoid.ihaveatheory.game.scene.location.LocationScene
import com.avoid.ihaveatheory.game.scene.start.ForestScene
import com.avoid.ihaveatheory.game.scene.start.StartScene

import java.io.Serializable

class Scenario : Serializable {
    var dayBackground: Int = 0
    var nightBackground: Int = 0

    var scene: Scene? = null
        set(scene) {
            field = scene

            if (scene is StartScene) {
                dayBackground = scene.dayBackground
                nightBackground = scene.nightBackground
            } else if (scene is LocationScene) {
                dayBackground = scene.dayBackground
                nightBackground = scene.nightBackground
            }
        }

    fun setForestScenario() {
        val forestScene = ForestScene()
        scene = forestScene
    }
}
