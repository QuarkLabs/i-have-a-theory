package com.avoid.ihaveatheory.game;

public class Gather {
    private static final Gather instance = new Gather();

    private Gather() {

    }

    public static Gather getInstance() {
        return instance;
    }

    public int findWater() {
        return 5;
    }

    public int findBerries() {
        return 10;
    }

    public int findWood() {
        return 3;
    }

    public int findRabbits() {
        return 1;
    }
}
