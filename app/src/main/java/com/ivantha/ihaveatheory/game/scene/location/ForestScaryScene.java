package com.ivantha.ihaveatheory.game.scene.location;


import com.ivantha.ihaveatheory.R;

public class ForestScaryScene extends LocationScene {
    public ForestScaryScene() {
        super(LocationSceneType.FOREST_SCARY_LOCATION_SCENE);

        dayBackground = R.drawable.forest_scary_background;
        nightBackground = R.drawable.forest_scary_background;

        addChoices();
    }

    @Override
    public void addChoices() {

    }
}
