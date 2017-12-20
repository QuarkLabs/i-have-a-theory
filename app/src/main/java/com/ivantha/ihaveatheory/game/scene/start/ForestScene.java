package com.ivantha.ihaveatheory.game.scene.start;

import com.ivantha.ihaveatheory.R;
import com.ivantha.ihaveatheory.game.choice.AcidLakeChoice;

public class ForestScene extends StartScene {
    public ForestScene() {
        super(StartSceneType.FOREST_START_SCENE);

        dayBackground = R.drawable.forest_start_background;
        nightBackground = R.drawable.forest_start_background_night;

        addChoices();
    }

    @Override
    public void addChoices() {
        getChoices().add(new AcidLakeChoice());
    }
}
