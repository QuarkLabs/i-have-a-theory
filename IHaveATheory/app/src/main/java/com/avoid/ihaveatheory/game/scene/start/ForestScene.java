package com.avoid.ihaveatheory.game.scene.start;

import com.avoid.ihaveatheory.R;

public class ForestScene extends StartScene {
    public ForestScene() {
        dayBackground = R.drawable.forest_start_background;
        nightBackground = R.drawable.forest_start_background_night;
    }

    @Override
    public double getSceneIndex() {
        return 0;
    }

}
