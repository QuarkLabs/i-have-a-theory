package com.avoid.ihaveatheory.util


import android.content.Context
import com.avoid.ihaveatheory.global.Session
import com.avoid.ihaveatheory.model.SaveFile
import java.io.*

class SaveFileHandler(private val context: Context) {
    private var fileOutputStream: FileOutputStream? = null
    private var objectOutputStream: ObjectOutputStream? = null

    private var fileInputStream: FileInputStream? = null
    private var objectInputStream: ObjectInputStream? = null

    fun newGame() {
        Session.currentSaveFile = SaveFile()
    }

    fun loadGame() {
        try {
            fileInputStream = context.openFileInput("saveFile")
            objectInputStream = ObjectInputStream(fileInputStream)

            Session.currentSaveFile = objectInputStream!!.readObject() as SaveFile

            objectInputStream!!.close()
            fileInputStream!!.close()
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        }

    }

    fun saveGame() {
        try {
            fileOutputStream = context.openFileOutput("saveFile", Context.MODE_PRIVATE)
            objectOutputStream = ObjectOutputStream(fileOutputStream)

            objectOutputStream!!.writeObject(Session.currentSaveFile)

            objectOutputStream!!.close()
            fileOutputStream!!.close()
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        }

    }

    fun saveExists(): Boolean {
        try {
            fileInputStream = context.openFileInput("saveFile")
            return fileInputStream != null
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
            return false
        }

    }
}
