package com.ivantha.ihaveatheory.activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.ivantha.ihaveatheory.R;
import com.ivantha.ihaveatheory.global.BackgroundMusic;
import com.ivantha.ihaveatheory.global.Session;
import com.ivantha.ihaveatheory.util.SaveFileHandler;
import com.ivantha.ihaveatheory.widget.MainButton;


public class MainMenuActivity extends AppCompatActivity {

    static MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Session.saveFileHandler = new SaveFileHandler(getApplicationContext());

        //Enable Continue button if a save file exists.
        if (Session.saveFileHandler.saveExists()) {
            MainButton continueMainButton = (MainButton) findViewById(R.id.continue_button);
            continueMainButton.setEnabled(true);
        }


        // Start Background Music
        Intent svc = new Intent(this, BackgroundMusic.class);
        startService(svc);

        //Button Click Sound
        mp = MediaPlayer.create(this, R.raw.app_button_click);
    }

    public void onClickContinueButton(View view) {
        Session.saveFileHandler.loadGame();
        playClickSound();
        startActivity(new Intent(MainMenuActivity.this, DashboardActivity.class));
    }

    public void onClickNewGameButton(View view) {
        Session.saveFileHandler.newGame();
        playClickSound();
        startActivity(new Intent(MainMenuActivity.this, ScenarioActivity.class));
    }

    public void onClickOptionsButton(View view) {
        playClickSound();
        Toast.makeText(getApplicationContext(), "This feature is not yet implemented.", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (this.isFinishing()) {
            stopService(new Intent(this, BackgroundMusic.class));
        }
    }

    public static void playClickSound() {
        mp.start();
    }
}
