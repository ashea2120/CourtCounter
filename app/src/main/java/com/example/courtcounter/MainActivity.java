package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;
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

    public void addThreeTeamA(View view) {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    public void addThreeTeamB(View view) {
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    public void addTwoTeamA(View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    public void addTwoTeamB(View view) {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }

    public void freeThrowTeamA(View view) {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }

    public void freeThrowTeamB(View view) {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given teamAScore for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_b_text_view);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view) {
        teamBScore = 0;
        teamAScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);

    }
}
