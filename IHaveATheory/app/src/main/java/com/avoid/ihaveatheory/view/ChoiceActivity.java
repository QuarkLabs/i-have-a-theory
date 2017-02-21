package com.avoid.ihaveatheory.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.avoid.ihaveatheory.R;
import com.avoid.ihaveatheory.game.choice.Situation;
import com.avoid.ihaveatheory.widget.ChoiceButton;
import com.avoid.ihaveatheory.widget.LabelTextView;

public class ChoiceActivity extends AppCompatActivity {
    private LabelTextView situationTextView;
    private ChoiceButton aChoiceButton;
    private ChoiceButton bChoiceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        Intent intent = getIntent();
        final Situation situation = intent.getParcelableExtra("situation");

        situationTextView = (LabelTextView) findViewById(R.id.situation_text_view);
        aChoiceButton = (ChoiceButton) findViewById(R.id.a_choice_button);
        bChoiceButton = (ChoiceButton) findViewById(R.id.b_choice_button);

        situationTextView.setText(situation.getSituation());
        aChoiceButton.setText(situation.getChoiceA());
        bChoiceButton.setText(situation.getChoiceB());

        aChoiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                situation.triggerChoiceA();
            }
        });

        bChoiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                situation.triggerChoiceB();
            }
        });
    }
}
