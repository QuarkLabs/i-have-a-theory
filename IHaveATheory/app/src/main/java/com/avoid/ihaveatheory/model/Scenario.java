package com.avoid.ihaveatheory.model;

import com.avoid.ihaveatheory.game.scene.start.ForestScene;

import java.io.Serializable;

public class Scenario implements Serializable{
    private int dayBackground;
    private int nightBackground;

    private double sceneIndex;

    public void setForestScenario(){
        ForestScene forestScene = new ForestScene();

        sceneIndex = forestScene.getSceneIndex();
        dayBackground = forestScene.getDayBackground();
        nightBackground = forestScene.getNightBackground();
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
