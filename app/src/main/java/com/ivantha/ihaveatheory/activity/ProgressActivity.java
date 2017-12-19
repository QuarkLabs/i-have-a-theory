package com.avoid.ihaveatheory.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.avoid.ihaveatheory.global.Session;
import com.avoid.ihaveatheory.model.PlaybleActivity;
import com.avoid.ihaveatheory.widget.LabelTextView;
import com.avoid.ihaveatheory.widget.TaskProgressBar;
import com.ivantha.ihaveatheory.R;

public class ProgressActivity extends AppCompatActivity implements PlaybleActivity{
    private TaskProgressBar workingProgressBar;
    private int progressStatusCounter = 0;

    private LabelTextView titleTextView;
    private LabelTextView timeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        workingProgressBar = (TaskProgressBar) findViewById(R.id.working_progress_bar);
        workingProgressBar.setMax(100);
        workingProgressBar.setProgress(0);

        titleTextView = (LabelTextView) findViewById(R.id.title_text_view);
        timeTextView = (LabelTextView) findViewById(R.id.time_text_view);

        String title = getIntent().getStringExtra("title");
        String time = getIntent().getStringExtra("time");

        titleTextView.setText(title);
        timeTextView.setText(time);

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
