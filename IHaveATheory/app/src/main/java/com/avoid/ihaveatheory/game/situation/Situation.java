package com.avoid.ihaveatheory.game.situation;

import android.os.Parcelable;

public abstract class Situation implements Parcelable{
    String description;
    String okButtonText;

    public Situation(String description, String okButtonText) {
        this.description = description;
        this.okButtonText = okButtonText;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOkButtonText() {
        return okButtonText;
    }

    public void setOkButtonText(String okButtonText) {
        this.okButtonText = okButtonText;
    }
}
