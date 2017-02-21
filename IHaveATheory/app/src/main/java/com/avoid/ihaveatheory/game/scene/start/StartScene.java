package com.avoid.ihaveatheory.game.scene.start;

import com.avoid.ihaveatheory.game.scene.Scene;

public abstract class StartScene implements Scene {
    int dayBackground;
    int nightBackground;

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
