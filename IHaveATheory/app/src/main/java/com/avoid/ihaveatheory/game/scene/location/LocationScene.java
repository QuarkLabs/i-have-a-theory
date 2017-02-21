package com.avoid.ihaveatheory.game.scene.location;

import com.avoid.ihaveatheory.game.scene.Scene;

public abstract class LocationScene implements Scene {

    public enum LocationSceneType {
        LAKE_LOCATION_SCENE,
        MOONLIGHT_SCENE
    }

    private LocationSceneType locationSceneType;

    int dayBackground;
    int nightBackground;

    public LocationScene(LocationSceneType locationSceneType) {
        this.locationSceneType = locationSceneType;
    }

    public LocationSceneType getLocationSceneType() {
        return locationSceneType;
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
