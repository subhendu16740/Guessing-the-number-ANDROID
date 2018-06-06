package com.example.subhendudmohapatra.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void makeTOast(String string)
    {
        Toast.makeText(MainActivity.this,string, Toast.LENGTH_SHORT).show();
    }
    public void guess(View view) {
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());
        if (guessInt > randomNumber) {
           makeTOast("Lower");
        }
        else if(guessInt < randomNumber)
        {
            makeTOast("Higher");
        }
        else
        {
            makeTOast("YOu Guessed it right Great Try Again");
            Random rand = new Random();
            randomNumber = rand.nextInt(100)+1;
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();

        randomNumber = rand.nextInt(100) + 1;
    }
}
