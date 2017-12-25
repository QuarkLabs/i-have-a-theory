package com.avoid.ihaveatheory.util

import android.content.Context
import android.content.Intent
import com.avoid.ihaveatheory.activity.ChoiceActivity
import com.avoid.ihaveatheory.activity.ProgressActivity
import com.avoid.ihaveatheory.activity.SituationActivity
import com.avoid.ihaveatheory.game.choice.Choice
import com.avoid.ihaveatheory.game.scene.Scene
import com.avoid.ihaveatheory.game.situation.Situation

object Controller {
    fun showProgress(context: Context, title: String, time: String) {
        val intent = Intent(context, ProgressActivity::class.java)
        intent.putExtra("title", title)
        intent.putExtra("time", time)
        context.startActivity(intent)
    }

    fun showChoice(context: Context, choice: Choice) {
        val intent = Intent(context, ChoiceActivity::class.java)
        intent.putExtra("choice", choice)
        context.startActivity(intent)
    }

    fun showSituation(context: Context, situation: Situation) {
        val intent = Intent(context, SituationActivity::class.java)
        intent.putExtra("situation", situation)
        context.startActivity(intent)
    }


    fun showScene(context: Context, scene: Scene) {

    }
}