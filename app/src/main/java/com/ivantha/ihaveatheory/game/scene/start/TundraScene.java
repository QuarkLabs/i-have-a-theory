package com.ivantha.ihaveatheory.game.scene.start;


import com.ivantha.ihaveatheory.R;

public class TundraScene extends StartScene {
    public TundraScene() {
        super(StartScene.StartSceneType.TUNDRA_START_SCENE);

        dayBackground = R.drawable.forest_start_background;
        nightBackground = R.drawable.forest_start_background_night;

        addChoices();
    }

    @Override
    public void addChoices() {

    }
}
