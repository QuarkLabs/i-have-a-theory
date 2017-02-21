package com.avoid.ihaveatheory.util;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.avoid.ihaveatheory.game.choice.Choice;
import com.avoid.ihaveatheory.view.ProgressActivity;
import com.avoid.ihaveatheory.view.StoryActivity;

public class Common {
    public static void showProgressBar(Context context, String title, String time) {
        Intent intent = new Intent(context, ProgressActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("time", time);
        context.startActivity(intent);
    }

    public static void showStory(Context context, String message, String ok_text) {
        Intent intent = new Intent(context, StoryActivity.class);
        intent.putExtra("title", message);
        intent.putExtra("time", ok_text);
        context.startActivity(intent);
    }

    public static void showChoices(Choice choice){
        Log.d(">>>>>>>>", "Implement the choices.");
    }
}
