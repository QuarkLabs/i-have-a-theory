package com.avoid.ihaveatheory.game.choice

import android.os.Parcel
import android.os.Parcelable

abstract class Choice : Parcelable {

    var situation: String? = null
    var choiceA: String? = null
    var choiceB: String? = null

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(situation)
        dest.writeString(choiceA)
        dest.writeString(choiceB)
    }

    abstract fun triggerChoiceA()

    abstract fun triggerChoiceB()
}
