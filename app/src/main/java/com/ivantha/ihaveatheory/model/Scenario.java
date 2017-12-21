package com.ivantha.ihaveatheory.model;

import com.ivantha.ihaveatheory.game.scene.Scene;
import com.ivantha.ihaveatheory.game.scene.location.LocationScene;
import com.ivantha.ihaveatheory.game.scene.start.ForestScene;
import com.ivantha.ihaveatheory.game.scene.start.StartScene;

import java.io.Serializable;

public class Scenario implements Serializable{
    private int dayBackground;
    private int nightBackground;

    private Scene scene;

    public void setForestScenario(){
        ForestScene forestScene = new ForestScene();
        setScene(forestScene);
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

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;

        if (scene instanceof StartScene){
            dayBackground = ((StartScene)scene).getDayBackground();
            nightBackground = ((StartScene)scene).getNightBackground();
        }
        else if(scene instanceof LocationScene){
            dayBackground = ((LocationScene)scene).getDayBackground();
            nightBackground = ((LocationScene)scene).getNightBackground();
        }
    }
}
