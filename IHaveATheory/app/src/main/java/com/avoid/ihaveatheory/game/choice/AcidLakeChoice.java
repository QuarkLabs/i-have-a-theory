package com.avoid.ihaveatheory.game.choice;

import android.os.Parcel;
import android.os.Parcelable;

import com.avoid.ihaveatheory.global.Session;

public class AcidLakeChoice extends Choice {

    public AcidLakeChoice() {
        setSituation("You see a lake with sparkly water. Just for fun you throw a limestone into the lake and a white precipitate occurs. Do you think it is safe to swim in the lake?");
        setChoiceA("Yeah. Go ahead.");
        setChoiceB("No! Don't!!");
    }

    public AcidLakeChoice(Parcel source) {
        setSituation(source.readString());
        setChoiceA(source.readString());
        setChoiceB(source.readString());
    }

    public static final Parcelable.Creator<AcidLakeChoice> CREATOR = new Creator<AcidLakeChoice>() {
        @Override
        public AcidLakeChoice createFromParcel(Parcel source) {
            return new AcidLakeChoice(source);
        }

        @Override
        public AcidLakeChoice[] newArray(int size) {
            return new AcidLakeChoice[0];
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
