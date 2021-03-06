package com.avoid.ihaveatheory.game.scene.location;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.game.choice.AcidLakeChoice;

public class ForestLakeScene extends LocationScene {

    public ForestLakeScene() {
        super(LocationSceneType.FOREST_LAKE_LOCATION_SCENE);

        dayBackground = R.drawable.forest_lake_background;
        nightBackground = R.drawable.forest_lake_background;

        addChoices();
    }

    @Override
    public void addChoices() {
        getChoices().add(new AcidLakeChoice());
    }
}
