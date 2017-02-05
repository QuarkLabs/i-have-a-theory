package com.avoid.ihaveatheory.model;

public class SaveFile {
    //----------------------------------------------------------------------------------------------

    private String name = "default";
    private Scenario scenario = null;
    private Difficulty difficulty = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scenario getScenario() {
        return scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    //----------------------------------------------------------------------------------------------

    private Backpack backpack = null;

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    //----------------------------------------------------------------------------------------------

    private int health = 0;
    private int stamina = 0;
    private int heat = 0;
    private int hunger = 0;
    private int thirst = 0;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health > difficulty.getMAX_HEALTH()) {
            this.health = difficulty.getMAX_HEALTH();
        } else if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        if (stamina > difficulty.getMAX_STAMINA()) {
            this.stamina = difficulty.getMAX_STAMINA();
        } else if (stamina < 0) {
            this.stamina = 0;
        } else {
            this.stamina = stamina;
        }
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        if (heat > difficulty.getMAX_HEAT()) {
            this.heat = difficulty.getMAX_HEAT();
        } else if (heat < 0) {
            this.heat = 0;
        } else {
            this.heat = heat;
        }
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        if (hunger > difficulty.getMAX_HUNGER()) {
            this.hunger = difficulty.getMAX_HUNGER();
        } else if (hunger < 0) {
            this.hunger = 0;
        } else {
            this.hunger = hunger;
        }
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        if (thirst > difficulty.getMAX_THIRST()) {
            this.thirst = difficulty.getMAX_THIRST();
        } else if (thirst < 0) {
            this.thirst = 0;
        } else {
            this.thirst = thirst;
        }
    }

    //----------------------------------------------------------------------------------------------
}
