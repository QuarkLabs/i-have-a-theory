package com.avoid.ihaveatheory.game.scene.location;

import com.avoid.ihaveatheory.R;

public class LakeScene extends LocationScene {

    public LakeScene() {
        dayBackground = R.drawable.forest_lake_background;
        nightBackground = R.drawable.forest_lake_background;
    }

    @Override
    public double getSceneIndex() {
        return 1;
    }

}
