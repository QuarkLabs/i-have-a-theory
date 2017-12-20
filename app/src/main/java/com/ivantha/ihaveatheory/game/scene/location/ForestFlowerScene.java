package com.ivantha.ihaveatheory.game.scene.location;

import com.ivantha.ihaveatheory.R;

public class ForestFlowerScene extends LocationScene {
    public ForestFlowerScene() {
        super(LocationSceneType.FOREST_FLOWER_LOCATION_SCENE);

        dayBackground = R.drawable.forest_flower_background;
        nightBackground = R.drawable.forest_flower_background;

        addChoices();
    }

    @Override
    public void addChoices() {

    }
}
