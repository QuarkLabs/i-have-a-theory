package com.avoid.ihaveatheory.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.model.PlaybleActivity;

public class StoryActivity extends AppCompatActivity implements PlaybleActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        String message = getIntent().getStringExtra("message");
        String ok_text = getIntent().getStringExtra("okText");

        TextView storyTextView = (TextView) findViewById(R.id.story_text_view);
        Button okButton = (Button) findViewById(R.id.ok_button);

        storyTextView.setText(message);
        okButton.setText(ok_text);
    }

    @Override
    public void setBackground() {

    }

    @Override
    public void setIcons() {

    }
}
