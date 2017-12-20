package com.ivantha.ihaveatheory.game.scene.location;


import com.ivantha.ihaveatheory.R;

public class ForestMossScene extends LocationScene {
    public ForestMossScene() {
        super(LocationSceneType.FOREST_MOSS_LOCATION_SCENE);

        dayBackground = R.drawable.forest_moss_background;
        nightBackground = R.drawable.forest_moss_background;

        addChoices();
    }

    @Override
    public void addChoices() {

    }
}
