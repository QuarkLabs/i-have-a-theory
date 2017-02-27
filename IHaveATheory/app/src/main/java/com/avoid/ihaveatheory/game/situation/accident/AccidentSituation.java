package com.avoid.ihaveatheory.game.situation.accident;

import com.avoid.ihaveatheory.game.situation.Situation;

public abstract class AccidentSituation extends Situation {

    public AccidentSituation(String description, String okButtonText) {
        super(description, okButtonText);
    }
}
