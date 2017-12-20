package com.ivantha.ihaveatheory.game.scene.location;


import com.ivantha.ihaveatheory.R;

public class ForestMoonlightScene extends LocationScene {

    public ForestMoonlightScene() {
        super(LocationSceneType.FOREST_MOONLIGHT_LOCATION_SCENE);

        dayBackground = R.drawable.forest_moonlight_background;
        nightBackground = R.drawable.forest_moonlight_background;

        addChoices();
    }

    @Override
    public void addChoices() {

    }
}
