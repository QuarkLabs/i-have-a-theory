package com.avoid.ihaveatheory.game.scene.location;

import com.avoid.ihaveatheory.R;

public class ForestMagicalScene extends LocationScene {
    public ForestMagicalScene() {
        super(LocationSceneType.FOREST_MAGICAL_LOCATION_SCENE);

        dayBackground = R.drawable.forest_magical_background;
        nightBackground = R.drawable.forest_magical_background;

        addChoices();
    }

    @Override
    public void addChoices() {

    }
}
