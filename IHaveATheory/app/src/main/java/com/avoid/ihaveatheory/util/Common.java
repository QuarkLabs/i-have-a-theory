package com.avoid.ihaveatheory.util;

import android.content.Context;
import android.content.Intent;

import com.avoid.ihaveatheory.game.choice.Choice;
import com.avoid.ihaveatheory.activity.ChoiceActivity;
import com.avoid.ihaveatheory.activity.ProgressActivity;
import com.avoid.ihaveatheory.activity.StoryActivity;

public class Common {
    public static void showProgressBar(Context context, String title, String time) {
        Intent intent = new Intent(context, ProgressActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("time", time);
        context.startActivity(intent);
    }

    public static void showSituation(Context context, Choice choice) {
        Intent intent = new Intent(context, ChoiceActivity.class);
        intent.putExtra("choice", choice);
        context.startActivity(intent);
    }

    public static void showStory(Context context, String message, String okText) {
        Intent intent = new Intent(context, StoryActivity.class);
        intent.putExtra("message", message);
        intent.putExtra("okText", okText);
        context.startActivity(intent);
    }
}