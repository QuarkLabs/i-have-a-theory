package com.avoid.ihaveatheory.model;

public class Difficulty {
    private int MAX_HEALTH;
    private int MAX_STAMINA;
    private int MAX_HEAT;
    private int MAX_HUNGER;
    private int MAX_THIRST;

    public void setEasyDifficulty(){
        setMAX_HEALTH(300);
        setMAX_STAMINA(300);
        setMAX_HEAT(300);
        setMAX_HUNGER(300);
        setMAX_THIRST(300);
    }

    public int getMAX_HEALTH() {
        return MAX_HEALTH;
    }

    public void setMAX_HEALTH(int MAX_HEALTH) {
        this.MAX_HEALTH = MAX_HEALTH;
    }

    public int getMAX_STAMINA() {
        return MAX_STAMINA;
    }

    public void setMAX_STAMINA(int MAX_STAMINA) {
        this.MAX_STAMINA = MAX_STAMINA;
    }

    public int getMAX_HEAT() {
        return MAX_HEAT;
    }

    public void setMAX_HEAT(int MAX_HEAT) {
        this.MAX_HEAT = MAX_HEAT;
    }

    public int getMAX_HUNGER() {
        return MAX_HUNGER;
    }

    public void setMAX_HUNGER(int MAX_HUNGER) {
        this.MAX_HUNGER = MAX_HUNGER;
    }

    public int getMAX_THIRST() {
        return MAX_THIRST;
    }

    public void setMAX_THIRST(int MAX_THIRST) {
        this.MAX_THIRST = MAX_THIRST;
    }
}
