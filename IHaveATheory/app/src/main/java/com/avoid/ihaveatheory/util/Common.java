package com.avoid.ihaveatheory.util;

import android.content.Context;
import android.content.Intent;

import com.avoid.ihaveatheory.game.choice.Situation;
import com.avoid.ihaveatheory.view.ChoiceActivity;
import com.avoid.ihaveatheory.view.ProgressActivity;

public class Common {
    public static void showProgressBar(Context context, String title, String time) {
        Intent intent = new Intent(context, ProgressActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("time", time);
        context.startActivity(intent);
    }

    public static void showSituation(Context context, Situation situation) {
        Intent intent = new Intent(context, ChoiceActivity.class);
        intent.putExtra("situation", situation);
        context.startActivity(intent);
    }
}