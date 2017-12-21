package com.ivantha.ihaveatheory.util;

import android.content.Context;
import android.content.Intent;

import com.avoid.ihaveatheory.game.situation.Situation;
import com.ivantha.ihaveatheory.activity.ChoiceActivity;
import com.ivantha.ihaveatheory.activity.ProgressActivity;
import com.ivantha.ihaveatheory.activity.SituationActivity;
import com.ivantha.ihaveatheory.game.choice.Choice;
import com.ivantha.ihaveatheory.game.scene.Scene;

public class Controller {
    public static void showProgress(Context context, String title, String time) {
        Intent intent = new Intent(context, ProgressActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("time", time);
        context.startActivity(intent);
    }

    public static void showChoice(Context context, Choice choice) {
        Intent intent = new Intent(context, ChoiceActivity.class);
        intent.putExtra("choice", choice);
        context.startActivity(intent);
    }

    public static void showSituation(Context context, Situation situation){
        Intent intent = new Intent(context, SituationActivity.class);
        intent.putExtra("situation", situation);
        context.startActivity(intent);
    }


    public static void showScene(Context context, Scene scene){

    }
}