package com.ivantha.ihaveatheory.game.scene.location;

import com.ivantha.ihaveatheory.R;
import com.ivantha.ihaveatheory.game.choice.AcidLakeChoice;

public class ForestLakeScene extends LocationScene {

    public ForestLakeScene() {
        super(LocationScene.LocationSceneType.FOREST_LAKE_LOCATION_SCENE);

        dayBackground = R.drawable.forest_lake_background;
        nightBackground = R.drawable.forest_lake_background;

        addChoices();
    }

    @Override
    public void addChoices() {
        getChoices().add(new AcidLakeChoice());
    }
}
