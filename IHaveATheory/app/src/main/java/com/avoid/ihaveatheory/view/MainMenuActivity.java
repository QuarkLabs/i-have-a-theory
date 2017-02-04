package com.avoid.ihaveatheory.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.util.SaveFileParser;
import com.avoid.ihaveatheory.widget.MainButton;

import java.io.File;
import java.io.IOException;

public class MainMenuActivity extends AppCompatActivity {
    private File saveFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        saveFile = new File(MainMenuActivity.this.getFilesDir(), "save_file.xml");

        if (saveFile.exists()) {
            MainButton continueMainButton = (MainButton) findViewById(R.id.continue_button);
            continueMainButton.setEnabled(true);
        }
    }

    public void onClickContinueButton(View view) {
        parseSaveFile();
    }

    public void onClickNewGameButton(View view) {
        if (saveFile.exists()) {
            saveFile.delete();
        }

        try {
            saveFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        parseSaveFile();
    }

    public void onClickOptionsButton(View view) {
        Toast.makeText(getApplicationContext(), "This feature is not yet implemented.", Toast.LENGTH_LONG).show();
    }

    private void parseSaveFile() {
        SaveFileParser saveFileParse = new SaveFileParser();
        saveFileParse.parse(save_in);

        
    }
}
