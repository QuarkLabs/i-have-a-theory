package com.avoid.ihaveatheory.scenario;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.model.Scenario;

public class ForestScenario extends Scenario {

    @Override
    public int getDayBackground() {
        return R.drawable.forest_background;
    }

    @Override
    public int getNightBackground() {
        return R.drawable.forest_background_night;
    }
}
