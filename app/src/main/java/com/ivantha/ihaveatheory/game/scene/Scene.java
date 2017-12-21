package com.ivantha.ihaveatheory.game.scene;

import com.avoid.ihaveatheory.game.situation.Situation;
import com.ivantha.ihaveatheory.game.choice.Choice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public abstract class Scene implements Serializable{
    ArrayList<Choice> choices = new ArrayList<>();
    ArrayList<Situation> situations = new ArrayList<>();

    public ArrayList<Choice> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<Choice> choices) {
        this.choices = choices;
    }

    public ArrayList<Situation> getSituations() {
        return situations;
    }

    public void setSituations(ArrayList<Situation> situations) {
        this.situations = situations;
    }

    public abstract void addChoices();

    public Choice getRandomChoice(){
        Random random = new Random();
        int index = random.nextInt(getChoices().size());
        return getChoices().get(index);
    }

    public Situation getRandomSituation(){
        Random random = new Random();
        int index = random.nextInt(getSituations().size());
        return getSituations().get(index);
    }
}
