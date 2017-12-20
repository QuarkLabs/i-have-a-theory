package com.ivantha.ihaveatheory.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ivantha.ihaveatheory.R;
import com.ivantha.ihaveatheory.game.choice.Choice;
import com.ivantha.ihaveatheory.widget.ChoiceButton;
import com.ivantha.ihaveatheory.widget.LabelTextView;

public class ChoiceActivity extends AppCompatActivity {
    private LabelTextView situationTextView;
    private ChoiceButton aChoiceButton;
    private ChoiceButton bChoiceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        Intent intent = getIntent();
        final Choice choice = intent.getParcelableExtra("choice");

        situationTextView = findViewById(R.id.situation_text_view);
        aChoiceButton = (ChoiceButton) findViewById(R.id.a_choice_button);
        bChoiceButton = (ChoiceButton) findViewById(R.id.b_choice_button);

        situationTextView.setText(choice.getSituation());
        aChoiceButton.setText(choice.getChoiceA());
        bChoiceButton.setText(choice.getChoiceB());

        aChoiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice.triggerChoiceA();
            }
        });

        bChoiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice.triggerChoiceB();
            }
        });
    }
}
