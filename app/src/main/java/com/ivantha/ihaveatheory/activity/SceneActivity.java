package com.ivantha.ihaveatheory.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.ivantha.ihaveatheory.R;
import com.ivantha.ihaveatheory.global.Session;
import com.ivantha.ihaveatheory.model.PlaybleActivity;
import com.ivantha.ihaveatheory.widget.ForwardButton;
import com.ivantha.ihaveatheory.widget.LabelTextView;

public class SceneActivity extends AppCompatActivity implements PlaybleActivity {
    private LabelTextView introTextView;
    private ForwardButton confirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene);

        introTextView = (LabelTextView) findViewById(R.id.scene_intro_text_view);
        confirmButton = (ForwardButton) findViewById(R.id.scene_confirm_button);

        Intent intent = getIntent();
        String introText = intent.getStringExtra("introText");
        introTextView.setText(introText);
    }

    @Override
    public void setBackground() {
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.activity_dashboard);
        layout.setBackgroundResource(Session.currentSaveFile.getScenario().getDayBackground());
    }

    @Override
    public void setIcons() {

    }

    public void onClickConfirmButton(View view) {
        finish();
    }
}
