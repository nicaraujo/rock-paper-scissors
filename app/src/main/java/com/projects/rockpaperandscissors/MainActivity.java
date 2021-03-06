package com.projects.rockpaperandscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void rockSelect(View view) {
        optionSelected("rock");
    }
    public void paperSelect(View view) {
        optionSelected("paper");
    }
    public void scissorSelect(View view) {
        optionSelected("scissor");
    }
    public void optionSelected(String option) {
        ImageView iw = findViewById(R.id.imageView);
        int n = new Random().nextInt(3);
        String[] options = {"rock", "paper", "scissor"};
        String optionApp = options[n];
        System.out.println(optionApp);
        switch (optionApp) {
            case "rock":
                iw.setImageResource(R.drawable.pedra);
                break;
            case "paper":
                iw.setImageResource(R.drawable.papel);
                break;
            case "scissor":
                iw.setImageResource(R.drawable.tesoura);
                break;
        }
    }
}