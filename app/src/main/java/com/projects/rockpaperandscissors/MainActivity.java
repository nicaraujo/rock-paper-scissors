package com.projects.rockpaperandscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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
        TextView txt = findViewById(R.id.textView2);
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
        if (option.equals("scissor") && optionApp.equals("paper") || option.equals("paper") && optionApp.equals("rock") || option.equals("rock") && optionApp.equals("scissor")) {
            txt.setText(R.string.app_text2);
        } else if (option.equals(optionApp)) {
            txt.setText(R.string.app_text4);
        } else {
            txt.setText(R.string.app_text3);
        }
    }
}