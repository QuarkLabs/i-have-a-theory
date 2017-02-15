package com.avoid.ihaveatheory.model;

import com.avoid.ihaveatheory.game.scene.forest.StartScene;

public class Scenario {
    private int dayBackground;
    private int nightBackground;

    private double sceneIndex;

    public void setForestScenario(){
        StartScene startScene = new StartScene();

        sceneIndex = startScene.getSceneIndex();
        dayBackground = startScene.getDayBackground();
        nightBackground = startScene.getNightBackground();
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

    public double getSceneIndex() {
        return sceneIndex;
    }

    public void setSceneIndex(double sceneIndex) {
        this.sceneIndex = sceneIndex;
    }
}
