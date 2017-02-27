package com.avoid.ihaveatheory.game.choice;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class Choice implements Parcelable{

    private String situation;
    private String choiceA;
    private String choiceB;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(situation);
        dest.writeString(choiceA);
        dest.writeString(choiceB);
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getChoiceA() {
        return choiceA;
    }

    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA;
    }

    public String getChoiceB() {
        return choiceB;
    }

    public void setChoiceB(String choiceB) {
        this.choiceB = choiceB;
    }

    public abstract void triggerChoiceA();

    public abstract void triggerChoiceB();
}
