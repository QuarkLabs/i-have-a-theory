package com.ivantha.ihaveatheory.game;

import android.content.Context;

import com.ivantha.ihaveatheory.global.Session;
import com.ivantha.ihaveatheory.util.Controller;

import java.util.Random;

public class Explore {
    private enum ExploreType {
        CHOICE
//        SCENE,
//        SITUATION
    }

    private static final Explore instance = new Explore();

    private Explore() {
    }

    public static Explore getInstance() {
        return instance;
    }

    private ExploreType getExploreType() {
        Random random = new Random();
        int i = random.nextInt(3);

//        if (i == 0) {
//            return ExploreType.CHOICE;
//        } else if (i == 1) {
//            return ExploreType.SCENE;
//        } else {
//            return ExploreType.SITUATION;
//        }

        return ExploreType.CHOICE;
    }

    public void explore(Context context) {
        ExploreType exploreType = getExploreType();
        if (exploreType == ExploreType.CHOICE) {
            Controller.showChoice(context, Session.currentSaveFile.getScenario().getScene().getRandomChoice());
        }
//        } else if (exploreType == ExploreType.SCENE) {
//            Scene currentScene = Session.currentSaveFile.getScenario().getScene();
//            if (currentScene instanceof ForestScene){
//                Controller.showScene(context, new ForestLakeScene());
//            }
//        } else if (exploreType == ExploreType.SITUATION) {
//            Controller.showSituation(context, Session.currentSaveFile.getScenario().getScene().getRandomSituation());
//        }
    }
}