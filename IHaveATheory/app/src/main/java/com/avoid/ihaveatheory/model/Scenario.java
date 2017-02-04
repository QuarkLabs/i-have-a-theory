package com.avoid.ihaveatheory.model;

import com.avoid.ihaveatheory.R;

public class Scenario {
    private int dayBackground;
    private int nightBackground;

    public void setForestScenario(){
        dayBackground = R.drawable.forest_background;
        nightBackground = R.drawable.forest_background_night;
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
