package com.avoid.ihaveatheory.view;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.model.PlaybleActivity;

public class ProgressActivity extends AppCompatActivity implements PlaybleActivity{
    private ProgressBar workingProgressBar;
    private int progressStatusCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        workingProgressBar = (ProgressBar) findViewById(R.id.working_progress_bar);
        workingProgressBar.setMax(100);
        workingProgressBar.setProgress(0);


        final Handler progressHandler = new Handler();
        new Thread(new Runnable() {
            public void run() {
                while (progressStatusCounter < 100) {
                    progressStatusCounter += 2;
                    progressHandler.post(new Runnable() {
                        public void run() {
                            workingProgressBar.setProgress(progressStatusCounter);
                        }
                    });
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                finish();
            }
        }).start();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Session.saveFileHandler.saveGame();
    }

    @Override
    public void setBackground() {
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.activity_progress);
        layout.setBackgroundResource(Session.currentSaveFile.getScenario().getDayBackground());
    }

    @Override
    public void setIcons() {

    }
}
