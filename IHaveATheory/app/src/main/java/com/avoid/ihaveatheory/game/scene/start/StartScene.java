package com.avoid.ihaveatheory.game.scene.start;

import com.avoid.ihaveatheory.game.scene.Scene;

public abstract class StartScene implements Scene {

    public enum StartSceneType{
        FOREST_START_SCENE,
        TUNDRA_START_SCENE,
        MOUNTAINS_START_SCENE
    }

    private StartSceneType startSceneType;

    int dayBackground;
    int nightBackground;

    public StartScene(StartSceneType startSceneType) {
        this.startSceneType = startSceneType;
    }

    public StartSceneType getStartSceneType() {
        return startSceneType;
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
