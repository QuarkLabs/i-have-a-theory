package com.avoid.ihaveatheory.game.scene.location;

import com.avoid.ihaveatheory.R;

public class MoonlightScene extends LocationScene {

    public MoonlightScene() {
        dayBackground = R.drawable.forest_lake_background;
        nightBackground = R.drawable.forest_lake_background;
    }

    @Override
    public double getSceneIndex() {
        return 2;
    }

}
