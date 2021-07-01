package com.example.diabetes_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Positive_result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_positive_result);
        View button4 = findViewById(R.id.button);
        View button5 = findViewById(R.id.button2);
        View button6 = findViewById(R.id.button3);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent categoryIntent=new Intent(Positive_result.this,Excercise.class);
                startActivity(categoryIntent);
                finish();

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent categoryIntent=new Intent(Positive_result.this,Diet_tips.class);
                startActivity(categoryIntent);
                finish();

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent categoryIntent=new Intent(Positive_result.this,MainActivity.class);
                startActivity(categoryIntent);
                finish();

            }
        });
    }
}