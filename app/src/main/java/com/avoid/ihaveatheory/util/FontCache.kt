package com.avoid.ihaveatheory.util

import android.content.Context
import android.graphics.Typeface
import java.util.*

object FontCache {
    private val fontCache = Hashtable<String, Typeface>()

    @JvmStatic
    fun getTypeface(name: String, context: Context): Typeface? {
        var typeface: Typeface? = fontCache[name]
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.assets, name)
            } catch (e: Exception) {
                return null
            }

            fontCache[name] = typeface
        }
        return typeface
    }
}
