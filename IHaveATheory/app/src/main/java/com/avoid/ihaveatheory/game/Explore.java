package com.avoid.ihaveatheory.game;

public class Explore {
    private static final Explore instance = new Explore();

    private Explore() {
    }

    public static Explore getInstance() {
        return instance;
    }


}
