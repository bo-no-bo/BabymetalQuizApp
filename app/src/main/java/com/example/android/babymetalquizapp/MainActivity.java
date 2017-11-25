package com.example.android.babymetalquizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method add one point for checking the three correct boxes.
     */
    public void verifyAnswer01(View view) {

        CheckBox check_answer01a = (CheckBox) findViewById(R.id.answer01a);
        boolean checkBox1a = check_answer01a.isChecked();
        CheckBox check_answer01c = (CheckBox) findViewById(R.id.answer01c);
        boolean checkBox1c = check_answer01c.isChecked();
        CheckBox check_answer01e = (CheckBox) findViewById(R.id.answer01e);
        boolean checkBox1d = check_answer01e.isChecked();
        if (checkBox1a && checkBox1c && checkBox1d) {
            score++;
        }
    }

    /**
     * This method add one point for checking the correct Radiobutton.
     */
    public void verifyAnswer02(View view) {
        RadioButton answerChecked02 = (RadioButton) findViewById(R.id.answer02c);
        boolean answer02 = answerChecked02.isChecked();
        if (answer02) {
            score++;
        }
    }

    /**
     * This method add one point for checking the correct Radiobutton.
     */
    public void verifyAnswer03(View view) {
        RadioButton answerChecked03 = (RadioButton) findViewById(R.id.answer03b);
        boolean answer03 = answerChecked03.isChecked();
        if (answer03) {
            score++;
        }
    }

    /**
     * This method add one point for checking the correct Radiobutton.
     */
    public void verifyAnswer04(View view) {
        // Is the button now checked?
        RadioButton answerChecked04 = (RadioButton) findViewById(R.id.answer04b);
        boolean answer04 = answerChecked04.isChecked();
        if (answer04) {
            score++;
        }
    }

    /**
     * This method add one point for checking the correct Radiobutton.
     */
    public void verifyAnswer05(View view) {
        RadioButton answerChecked05 = (RadioButton) findViewById(R.id.answer05d);
        boolean answer05 = answerChecked05.isChecked();
        if (answer05) {
            score++;
        }
    }

    /**
     * This method add one point for writing the correct answer.
     */
    public void verifyAnswer06(View view) {
        String answer06 = "Metal Resistance";
        TextView answer06Text = (TextView) findViewById(R.id.answer06txt);
        String textAnswer06 = answer06Text.getText().toString();
        if (answer06.equalsIgnoreCase(textAnswer06)) {
            score++;
        }
    }

    /**
     * Verifying all answers
     * Toast display the results and correct answers
     */
    public void giveScore(View view) {
        verifyAnswer01(view);
        verifyAnswer02(view);
        verifyAnswer03(view);
        verifyAnswer04(view);
        verifyAnswer05(view);
        verifyAnswer06(view);
        Toast.makeText(getApplicationContext(), "Your score is: " + score + "/6 !" + "\nAnswers:"
                + "\n1. Su-metal, Yuimetal, Moametal" + "\n2. Fox God" + "\n3. Kami Band"
                + "\n4. Black Babymetal" + "\n5. No more bullying" + "\n6. Metal Resistance", Toast.LENGTH_LONG).show();

        score = 0;

    }

}
