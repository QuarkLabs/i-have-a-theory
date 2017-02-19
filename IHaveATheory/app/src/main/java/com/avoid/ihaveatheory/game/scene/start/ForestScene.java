package com.avoid.ihaveatheory.game.scene.start;

import com.avoid.ihaveatheory.R;

public class ForestScene extends StartScene {

    private int dayBackground;
    private int nightBackground;

    public ForestScene() {
        dayBackground = R.drawable.forest_start_background;
        nightBackground = R.drawable.forest_start_background_night;
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
