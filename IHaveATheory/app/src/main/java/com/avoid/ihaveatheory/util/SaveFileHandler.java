package com.avoid.ihaveatheory.util;


import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.model.SaveFile;
import com.google.gson.Gson;

public class SaveFileHandler {
    private SharedPreferences preferences;
    private Gson gson;

    public SaveFileHandler(Context context) {
        preferences = context.getSharedPreferences("IHaveATheoryPrefs", 0);
        gson = new Gson();
    }

    public void newGame() {
        preferences.edit().remove("save_file").commit();
        Session.currentSaveFile = new SaveFile();
    }

    public void loadGame() {
        String json = preferences.getString("save_file", "");
        Session.currentSaveFile = gson.fromJson(json, SaveFile.class);
    }

    public void saveGame(){
        SharedPreferences.Editor prefsEditor = preferences.edit();
        String json = gson.toJson(Session.currentSaveFile);
        prefsEditor.putString("save_file", json);
        prefsEditor.commit();

        Log.d(">>>>>>>>>>>>>>>>",json);
    }

    public boolean saveExists(){
        String json = preferences.getString("save_file", "");

        return !json.equals("");
    }
}
