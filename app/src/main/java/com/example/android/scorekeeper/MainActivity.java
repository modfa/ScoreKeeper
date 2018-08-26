package com.example.android.scorekeeper;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.AlertDialog;

public class MainActivity extends AppCompatActivity {
    // Track the scores for Team South Africa
    int teamAScore =0;
    // Track the scores for Team India
    int teamBScore = 0;
    // Track the wickets for Team South Africa
    int teamAWicket = 0;
    // Track the wickets for Team India
    int teamBWicket = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Increase the score for Team South Africa by 1 Run.
     */
    public void addOneForTeamA(View view){
        teamAScore += 1;
        displayTeamAScore(teamAScore);
        }
    /**
     * Increase the score for Team South Africa by 2 Run.
     */
    public void addTwoForTeamA(View view){
        teamAScore += 2;
        displayTeamAScore(teamAScore);
        }
    /**
     * Increase the score for Team South Africa by 3 Run.
     */
    public void addThreeForTeamA(View view){
        teamAScore += 3;
        displayTeamAScore(teamAScore);
    }
    /**
     * Increase the score for Team South Africa by 4 Run.
     */
    public void addFourForTeamA(View view){
        teamAScore += 4;
        displayTeamAScore(teamAScore);
    }
    /**
     * Increase the score for Team South Africa by 6 Run.
     */
    public void addSixForTeamA(View view){
        teamAScore += 6;
        displayTeamAScore(teamAScore);
    }
    /**
     * Increase the wicket for Team South Africa by 1 each time.
     * Also when the Wickets become equals to 10 then it will pop-up the alert dialogue and show the total score of the team
     */
    public void wicketForTeamA(View view){
        teamAWicket += 1;
        displayTeamAWicket(teamAWicket);
        if (teamAWicket == 10){
            displayTeamAWicket(0);
            teamAWicket = 0;
            // Creating the Alert Dialogue
            AlertDialog alertDialog = new AlertDialog.Builder(
                    MainActivity.this).create();

            // Setting Dialog Title
            alertDialog.setTitle("South African Team Score : ");

            // Setting Dialog Message
            alertDialog.setMessage("Other Team Have To Chase : " + teamAScore + " Runs To Win The Match" );

            // Showing Alert Message
            alertDialog.show();
        }

    }
    /*
    Increase the Team South Africa by 1 run
     */
    public void wideRunForTeamA(View view){
        teamAScore += 1;
        displayTeamAScore(teamAScore);
    }
    /**
     * Displays the given score for Team South Africa.
     */
    public void displayTeamAScore(int score){
       TextView teamAScore = findViewById(R.id.team_a_score);
       teamAScore.setText(String.valueOf(score));
    }
    /**
     * Displays the given wickets for Team South Africa.
     */
    public void displayTeamAWicket(int score){
        TextView teamAWicket = findViewById(R.id.team_a_wicket);
        teamAWicket.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Team India by 1 Run.
     */
    public void addOneForTeamB(View view){
        teamBScore += 1;
        displayTeamBScore(teamBScore);
    }
    /**
     * Increase the score for Team India by 2 Run.
     */
    public void addTwoForTeamB(View view){
        teamBScore += 2;
        displayTeamBScore(teamBScore);
    }
    /**
     * Increase the score for Team India by 3 Run.
     */
    public void addThreeForTeamB(View view){
        teamBScore += 3;
        displayTeamBScore(teamBScore);
    }
    /**
     * Increase the score for Team India by 4 Run.
     */
    public void addFourForTeamB(View view){
        teamBScore += 4;
        displayTeamBScore(teamBScore);
    }
    /**
     * Increase the score for Team India by 6 Run.
     */
    public void addSixForTeamB(View view){
        teamBScore += 6;
        displayTeamBScore(teamBScore);
    }
    /**
     * Increase the wicket for Team india by 1 each time.
     * Also when the Wickets become equals to 10 then it will pop-up the alert dialogue and show the total score of the team
     */
    public void wicketForTeamB(View view){
        teamBWicket += 1;
        displayTeamBWicket(teamBWicket);
        if(teamBWicket == 10){
            displayTeamBWicket(0);
            teamBWicket = 0;
            AlertDialog alertDialog = new AlertDialog.Builder(
                    MainActivity.this).create();

            // Setting Dialog Title
            alertDialog.setTitle("Indian Team Score : ");

            // Setting Dialog Message
            alertDialog.setMessage("Other Team Have To Chase : " + teamBScore + " Runs To Win The Match" );

            // Showing Alert Message
            alertDialog.show();
        }
    }
    /*
    Increase the Team India Score by 1 run.
     */
    public void wideRunForTeamB(View view){
        teamBScore += 1;
        displayTeamBScore(teamBScore);
    }
    /**
     * Displays the given scores for Team India.
     */
    public void displayTeamBScore(int score){
        TextView teamAScore = findViewById(R.id.team_b_score);
        teamAScore.setText(String.valueOf(score));
    }
    /**
     * Displays the given wickets for Team India.
     */
    public void displayTeamBWicket(int score){
        TextView teamAWicket = findViewById(R.id.team_b_wicket);
        teamAWicket.setText(String.valueOf(score));
    }
    // Reset the scores and wickets for both the Teams to 0
    public void resetScore(View view){
        teamAScore = 0;
        teamBScore = 0;
        teamAWicket = 0;
        teamBWicket = 0;
        displayTeamAScore(teamAScore);
        displayTeamBScore(teamBScore);
        displayTeamAWicket(teamAWicket);
        displayTeamBWicket(teamBWicket);
    }
}
