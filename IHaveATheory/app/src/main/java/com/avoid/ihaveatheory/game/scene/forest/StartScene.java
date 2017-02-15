package com.avoid.ihaveatheory.game.scene.forest;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.game.scene.ForestScene;

public class StartScene extends ForestScene {
    private int dayBackground;
    private int nightBackground;

    public StartScene() {
        dayBackground = R.drawable.forest_background;
        nightBackground = R.drawable.forest_background_night;
    }

    @Override
    public double getSceneIndex() {
        return 0;
    }

    public int getDayBackground() {
        return dayBackground;
    }

    public void setDayBackground(int dayBackground) {
        this.dayBackground = dayBackground;
    }

    public int getNightBackground() {
        return nightBackground;
    }

    public void setNightBackground(int nightBackground) {
        this.nightBackground = nightBackground;
    }

}
