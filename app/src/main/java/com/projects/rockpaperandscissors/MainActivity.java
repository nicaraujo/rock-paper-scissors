package com.projects.rockpaperandscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

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
        System.out.println(option);
    }
}