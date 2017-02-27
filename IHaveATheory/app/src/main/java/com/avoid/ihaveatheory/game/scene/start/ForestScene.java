package com.avoid.ihaveatheory.game.scene.start;

import com.avoid.ihaveatheory.R;

public class ForestScene extends StartScene {
    public ForestScene() {
        super(StartSceneType.FOREST_START_SCENE);

        dayBackground = R.drawable.forest_start_background;
        nightBackground = R.drawable.forest_start_background_night;

        addChoices();
    }

    @Override
    public void addChoices() {

    }
}
