package com.example.diabetes_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Excercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excercise);
        View button4 = findViewById(R.id.button5);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent categoryIntent=new Intent(Excercise.this,MainActivity.class);
                startActivity(categoryIntent);
                finish();

            }});
}}