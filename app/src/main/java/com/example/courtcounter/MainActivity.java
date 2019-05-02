package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int scoreB = 0;
    TextView scoreText;
    TextView scoreBText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreText = findViewById(R.id.score_text_view);
        scoreBText = findViewById(R.id.score_b_text_view);
        //initialize to 0
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void addThree(View view) {
        score += 3;
        displayForTeamA(score);
    }

    public void addThreeB(View view) {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    public void addTwo(View view) {
        score += 2;
        displayForTeamA(score);
    }

    public void addTwoB(View view) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    public void freeThrow(View view) {
        score += 1;
        displayForTeamA(score);
    }

    public void freeThrowB(View view) {
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_b_text_view);
        scoreView.setText(String.valueOf(score));
    }
}
