package com.avoid.ihaveatheory.factory;

import com.avoid.ihaveatheory.game.scene.start.ForestScene;
import com.avoid.ihaveatheory.game.scene.start.MountainsScene;
import com.avoid.ihaveatheory.game.scene.start.StartScene;
import com.avoid.ihaveatheory.game.scene.start.StartScene.StartSceneType;
import com.avoid.ihaveatheory.game.scene.start.TundraScene;

public class SceneFactory {
    public static StartScene getStartScene(StartSceneType startSceneType) {
        StartScene startScene;
        switch (startSceneType) {
            case FOREST_START_SCENE:
                startScene = new ForestScene();
                break;
            case TUNDRA_START_SCENE:
                startScene = new TundraScene();
                break;
            case MOUNTAINS_START_SCENE:
                startScene = new MountainsScene();
                break;
            default:
                startScene = new ForestScene();
                break;
        }

        return startScene;
    }
}
