package com.example.diabetes_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.os.Bundle;
import android.view.View;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent categoryIntent=new Intent(MainActivity.this,Get_info.class);
                startActivity(categoryIntent);
                finish();

            }
        });
    }


}