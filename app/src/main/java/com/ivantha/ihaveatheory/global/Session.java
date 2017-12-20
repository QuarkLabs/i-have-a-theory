package com.ivantha.ihaveatheory.global;

import com.ivantha.ihaveatheory.model.SaveFile;
import com.ivantha.ihaveatheory.model.Settings;
import com.ivantha.ihaveatheory.util.SaveFileHandler;
import com.ivantha.ihaveatheory.util.SettingsHandler;

public class Session {
    //Save files
    public static SaveFileHandler saveFileHandler = null;
    public static SaveFile currentSaveFile = null;

    //Settings
    private static SettingsHandler settingsHandler = null;
    public static Settings currentSettings = null;
}
