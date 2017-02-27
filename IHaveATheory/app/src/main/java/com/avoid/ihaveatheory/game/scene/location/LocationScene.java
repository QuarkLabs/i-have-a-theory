package com.avoid.ihaveatheory.game.scene.location;

import com.avoid.ihaveatheory.game.scene.Scene;

public abstract class LocationScene extends Scene {

    public enum LocationSceneType {
        FOREST_ARCH_LOCATION_SCENE,
        FOREST_BLUE_LOCATION_SCENE,
        FOREST_BRIDGE_LOCATION_SCENE,
        FOREST_DAWN_LOCATION_SCENE,
        FOREST_FLOWER_LOCATION_SCENE,
        FOREST_LAKE_LOCATION_SCENE,
        FOREST_MAGICAL_LOCATION_SCENE,
        FOREST_MOONLIGHT_LOCATION_SCENE,
        FOREST_MOSS_LOCATION_SCENE,
        FOREST_SCARY_LOCATION_SCENE
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
