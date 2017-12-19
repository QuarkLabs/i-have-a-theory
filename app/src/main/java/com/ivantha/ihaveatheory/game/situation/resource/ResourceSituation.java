package com.avoid.ihaveatheory.game.situation.resource;

import com.avoid.ihaveatheory.game.situation.Situation;

public abstract class ResourceSituation extends Situation {

    public ResourceSituation(String description, String okButtonText) {
        super(description, okButtonText);
    }
}