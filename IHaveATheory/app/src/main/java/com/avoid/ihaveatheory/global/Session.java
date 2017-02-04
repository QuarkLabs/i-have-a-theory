package com.avoid.ihaveatheory.global;

import com.avoid.ihaveatheory.model.SaveFile;
import com.avoid.ihaveatheory.model.Settings;
import com.avoid.ihaveatheory.util.SaveFileHandler;
import com.avoid.ihaveatheory.util.SettingsHandler;

public class Session {
    //Save files
    public static SaveFileHandler saveFileHandler = null;
    public static SaveFile currentSaveFile = null;

    //Settings
    private static SettingsHandler settingsHandler = null;
    public static Settings currentSettings = null;
}
