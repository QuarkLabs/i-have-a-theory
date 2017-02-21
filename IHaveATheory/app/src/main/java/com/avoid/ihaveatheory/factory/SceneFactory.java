package com.avoid.ihaveatheory.factory;

import com.avoid.ihaveatheory.game.scene.Scene;

public class SceneFactory {
    private static final SceneFactory instance = new SceneFactory();

    private SceneFactory() {
    }

    public static SceneFactory getInstance() {
        return instance;
    }

    public Scene getScene(double sceneIndex){
        return new Scene() {
            @Override
            public double getSceneIndex() {
                return 0;
            }
        };
    }
}
