package com.avoid.ihaveatheory.game.scene.location;

import com.avoid.ihaveatheory.R;

public class ForestDawnScene extends LocationScene {
    public ForestDawnScene() {
        super(LocationSceneType.FOREST_DAWN_LOCATION_SCENE);

        dayBackground = R.drawable.forest_dawn_background;
        nightBackground = R.drawable.forest_dawn_background;

        addChoices();
    }

    @Override
    public void addChoices() {

    }
}
