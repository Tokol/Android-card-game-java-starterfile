package com.icms.cardgame;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    ImageView blackCardImageView, redCardImageView;
    Button restart;
    CardView resultCard;
    TextView resultMsg;
    int blackCardValue = 0, redCardValue = 0;

    enum cards {BLACK, RED};


    int cardFlip(cards player) {
        // Generating random number
        //1st import random class
        Random ran = new Random();
        // set a range by setting bound which is max value by default it start from 0
        // add the 1 so we get value between 1 to 13 otherwise we will get value between 0 to 12

        int flipValue = ran.nextInt(13) + 1;


        //checking value
        Log.d("RANDOM NUMBER", flipValue + " ");

        return flipValue;


    }


    void checkWin() {
        displayCard();

    }

    void displayCard() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        blackCardImageView = findViewById(R.id.blackCardImageView);
        redCardImageView = findViewById(R.id.redCardImageView);
        resultCard = findViewById(R.id.resultCard);
        resultMsg = findViewById(R.id.msg);
        restart = findViewById(R.id.restart);

    }
}