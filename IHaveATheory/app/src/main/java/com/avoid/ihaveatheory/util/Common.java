package com.avoid.ihaveatheory.util;

import android.content.Context;
import android.content.Intent;

import com.avoid.ihaveatheory.view.ProgressActivity;

public class Common {
    public static void showProgressBar(Context context, String title, String time){
        Intent intent = new Intent(context, ProgressActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("time", time);
        context.startActivity(intent);
    }
}
