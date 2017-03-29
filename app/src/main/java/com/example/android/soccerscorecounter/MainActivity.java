package com.example.android.soccerscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.x;
import static android.R.id.edit;
import static android.R.id.inputExtractEditText;
import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {
    int scoreFCPorto = 0;
    int foulsFCPorto = 0;
    int freeKicksFCPorto = 0;
    int cornerKicksFCPorto = 0;
    int scoreBenfica = 0;
    int foulsBenfica = 0;
    int freeKicksBenfica = 0;
    int cornerKicksBenfica = 0;
    private String numberFoulsPorto;
    private String numberFreeKicksPorto;
    private String numberCornerKicksPorto;
    private String numberFoulsBenfica;
    private String numberFreeKicksBenfica;
    private String numberCornerKicksBenfica;

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This method is called when the GOAL! button is pressed, and adds 1 to the score of FC Porto
    public void goalForPorto(View v) {
        scoreFCPorto = scoreFCPorto + 1;
        displayScoreFCPorto(scoreFCPorto);
    }
    //This method is called when the Foul! button is pressed, and adds 1 to the number of Fouls of FC Porto
    public void foulForPorto(View v) {
        foulsFCPorto = foulsFCPorto + 1;
        String numberFoulsPorto = "Fouls: " + foulsFCPorto;
        displayFoulsFCPorto(numberFoulsPorto);
    }
    //This method is called when the Free Kick! button is pressed, and adds 1 to the number of Free Kicks of FC Porto
    public void freeKickForPorto(View v) {
        freeKicksFCPorto = freeKicksFCPorto + 1;
        numberFreeKicksPorto = "Free Kicks: " + freeKicksFCPorto;
        displayFreeKicksFCPorto(numberFreeKicksPorto);
    }
    //This method is called when the Corner Kick! button is pressed, and adds 1 to the number of Corner Kicks of FC Porto
    public void cornerKickForPorto(View v) {
        cornerKicksFCPorto = cornerKicksFCPorto + 1;
        numberCornerKicksPorto = "Corner Kicks: " + cornerKicksFCPorto;
        displayCornerKicksFCPorto(numberCornerKicksPorto);
    }
    //This method is called to display the score of FC Porto
    public void displayScoreFCPorto(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_fcporto);
        scoreView.setText(String.valueOf(score));
    }
    //This method is called to display the number of Fouls of FC Porto
    public void displayFoulsFCPorto(String score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_of_porto);
        scoreView.setText(String.valueOf(score));
    }
    //This method is called to display the number of Free Kicks of FC Porto
    public void displayFreeKicksFCPorto(String score) {
        TextView scoreView = (TextView) findViewById(R.id.free_kicks_of_porto);
        scoreView.setText(String.valueOf(score));
    }
    //This method is called to display the number of Corner Kicks of FC Porto
    public void displayCornerKicksFCPorto(String score) {
        TextView scoreView = (TextView) findViewById(R.id.corner_kicks_of_porto);
        scoreView.setText(String.valueOf(score));
    }
    //This method is called when the GOAL! button is pressed, and adds 1 to the score of Benfica
    public void goalForBenfica(View v) {
        scoreBenfica = scoreBenfica + 1;
        displayScoreBenfica(scoreBenfica);
    }
    //This method is called when the Foul! button is pressed, and adds 1 to the number of Fouls of Benfica
    public void foulForBenfica(View v) {
        foulsBenfica= foulsBenfica +1;
        numberFoulsBenfica = "Fouls: " + foulsBenfica;
        displayFoulsBenfica(numberFoulsBenfica);
    }
    //This method is called when the Free Kick! button is pressed, and adds 1 to the number of Free Kicks of Benfica
    public void freeKickForBenfica(View v) {
        freeKicksBenfica = freeKicksBenfica + 1;
        numberFreeKicksBenfica = "Free Kicks: " + freeKicksBenfica;
        displayFreeKicksBenfica(numberFreeKicksBenfica);
    }
    //This method is called when the Corner Kick! button is pressed, and adds 1 to the number of Corner Kicks of Benfica
    public void cornerKickForBenfica(View v) {
        cornerKicksBenfica = cornerKicksBenfica + 1;
        numberCornerKicksBenfica = "Corner Kicks: " + cornerKicksBenfica;
        displayCornerKicksBenfica(numberCornerKicksBenfica);
    }
    //This method is called to display the score of Benfica
    public void displayScoreBenfica(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_benfica);
        scoreView.setText(String.valueOf(score));
    }
    //This method is called to display the number of Fouls of Benfica
    public void displayFoulsBenfica(String score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_of_benfica);
        scoreView.setText(String.valueOf(score));
        scoreView.getText();
    }
    //This method is called to display the number of Free Kicks of Benfica
    public void displayFreeKicksBenfica(String score) {
        TextView scoreView = (TextView) findViewById(R.id.free_kicks_of_benfica);
        scoreView.setText(String.valueOf(score));
    }
    //This method is called to display the number of Corner Kicks of Benfica
    public void displayCornerKicksBenfica(String score) {
        TextView scoreView = (TextView) findViewById(R.id.corner_kicks_of_benfica);
        scoreView.setText(String.valueOf(score));
    }
    public void resetAllCounters(View v) {
        scoreFCPorto = 0;
        foulsFCPorto = 0;
        freeKicksFCPorto = 0;
        cornerKicksFCPorto = 0;
        scoreBenfica = 0;
        foulsBenfica = 0;
        freeKicksBenfica = 0;
        cornerKicksBenfica = 0;
        displayScoreFCPorto(scoreFCPorto);
        numberFoulsPorto = "Fouls: " + foulsFCPorto;
        displayFoulsFCPorto(numberFoulsPorto);
        numberFreeKicksPorto = "Free Kicks: " + freeKicksFCPorto;
        displayFreeKicksFCPorto(numberFreeKicksPorto);
        numberCornerKicksPorto = "Corner Kicks: " + cornerKicksFCPorto;
        displayCornerKicksFCPorto(numberCornerKicksPorto);
        displayScoreBenfica(scoreBenfica);
        numberFoulsBenfica = "Fouls: " + foulsBenfica;
        displayFoulsBenfica(numberFoulsBenfica);
        numberFreeKicksBenfica = "Free Kicks: " + freeKicksBenfica;
        displayFreeKicksBenfica(numberFreeKicksBenfica);
        numberCornerKicksBenfica = "Corner Kicks: " + cornerKicksBenfica;
        displayCornerKicksBenfica(numberCornerKicksBenfica);
    }
}