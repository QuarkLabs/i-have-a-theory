package com.avoid.ihaveatheory.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.util.SaveFileHandler;
import com.avoid.ihaveatheory.widget.MainButton;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        initialize();

        //Enable Continue button if a save file exists.
        if (Session.saveFileHandler.saveExists()) {
            MainButton continueMainButton = (MainButton) findViewById(R.id.continue_button);
            continueMainButton.setEnabled(true);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        Session.saveFileHandler.saveGame();
    }

    public void onClickContinueButton(View view) {
        Session.saveFileHandler.loadGame();

        startActivity(new Intent(MainMenuActivity.this, DashboardActivity.class));
    }

    public void onClickNewGameButton(View view) {
        Session.saveFileHandler.newGame();

        startActivity(new Intent(MainMenuActivity.this, ScenarioActivity.class));
    }

    public void onClickOptionsButton(View view) {
        Toast.makeText(getApplicationContext(), "This feature is not yet implemented.", Toast.LENGTH_LONG).show();
    }

    public void initialize(){
        Session.saveFileHandler = new SaveFileHandler(getApplicationContext());
    }
}
