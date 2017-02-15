package com.avoid.ihaveatheory.game.scene;

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
