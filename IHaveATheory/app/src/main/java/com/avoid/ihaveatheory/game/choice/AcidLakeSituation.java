package com.avoid.ihaveatheory.game.choice;

import android.os.Parcel;
import android.os.Parcelable;

import com.avoid.ihaveatheory.global.Session;

public class AcidLakeSituation extends Situation {

    public AcidLakeSituation() {
        setSituation("You see a lake with sparkly water. Just for fun you throw a limestone into the lake and a white precipitate occurs. Do you think it is safe to swim in the lake?");
        setChoiceA("Yeah. Go ahead.");
        setChoiceB("No! Don't!!");
    }

    public AcidLakeSituation(Parcel source) {
        setSituation(source.readString());
        setChoiceA(source.readString());
        setChoiceB(source.readString());
    }

    public static final Parcelable.Creator<AcidLakeSituation> CREATOR = new Creator<AcidLakeSituation>() {
        @Override
        public AcidLakeSituation createFromParcel(Parcel source) {
            return new AcidLakeSituation(source);
        }

        @Override
        public AcidLakeSituation[] newArray(int size) {
            return new AcidLakeSituation[0];
        }
    };

    @Override
    public void triggerChoiceA() {
        Session.currentSaveFile.setHealth(Session.currentSaveFile.getHealth() - 1000);
        //Story screen saying that you died
    }

    @Override
    public void triggerChoiceB() {
        //Story screen saying that you survived because of your wits.
    }
}
