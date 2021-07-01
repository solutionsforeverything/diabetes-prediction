package com.example.diabetes_application;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class Diet_tips extends AppCompatActivity {
    static int d1=0,d2=0,d3=0,d4=0,d5=0,d6=0,d7=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_tips);
        View button4 = findViewById(R.id.button6);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent categoryIntent = new Intent(Diet_tips.this, MainActivity.class);
                startActivity(categoryIntent);
                finish();
            }});
            }


    public void day1(View view) {
        d1++;

        TextView t1=(TextView)(findViewById(R.id.textView13));
        TextView t2=(TextView)(findViewById(R.id.textView33));
        TextView t3=(TextView)(findViewById(R.id.textView55));
        if(d1%2!=0)
        {
            t1.setVisibility(VISIBLE);
            t2.setVisibility(VISIBLE);
            t3.setVisibility(VISIBLE);

        }
        else
        {
            t1.setVisibility(GONE);
            t2.setVisibility(GONE);
            t3.setVisibility(GONE);
        }
    }
    public void day2(View view) {
        d2++;

        TextView t1=(TextView)(findViewById(R.id.textView21));
        TextView t2=(TextView)(findViewById(R.id.textView34));
        TextView t3=(TextView)(findViewById(R.id.textView54));
        if(d2%2!=0)
        {
            t1.setVisibility(VISIBLE);
            t2.setVisibility(VISIBLE);
            t3.setVisibility(VISIBLE);

        }
        else
        {
            t1.setVisibility(GONE);
            t2.setVisibility(GONE);
            t3.setVisibility(GONE);
        }
    }
    public void day3(View view) {
        d3++;

        TextView t1=(TextView)(findViewById(R.id.textView26));
        TextView t2=(TextView)(findViewById(R.id.textView35));
        TextView t3=(TextView)(findViewById(R.id.textView53));
        if(d3%2!=0)
        {
            t1.setVisibility(VISIBLE);
            t2.setVisibility(VISIBLE);
            t3.setVisibility(VISIBLE);

        }
        else
        {
            t1.setVisibility(GONE);
            t2.setVisibility(GONE);
            t3.setVisibility(GONE);
        }
    }
    public void day4(View view) {
        d4++;

        TextView t1=(TextView)(findViewById(R.id.textView22));
        TextView t2=(TextView)(findViewById(R.id.textView36));
        TextView t3=(TextView)(findViewById(R.id.textView52));
        if(d4%2!=0)
        {
            t1.setVisibility(VISIBLE);
            t2.setVisibility(VISIBLE);
            t3.setVisibility(VISIBLE);

        }
        else
        {
            t1.setVisibility(GONE);
            t2.setVisibility(GONE);
            t3.setVisibility(GONE);
        }
    }
    public void day5(View view) {
        d5++;

        TextView t1=(TextView)(findViewById(R.id.textView23));
        TextView t2=(TextView)(findViewById(R.id.textView37));
        TextView t3=(TextView)(findViewById(R.id.textView51));
        if(d5%2!=0)
        {
            t1.setVisibility(VISIBLE);
            t2.setVisibility(VISIBLE);
            t3.setVisibility(VISIBLE);

        }
        else
        {
            t1.setVisibility(GONE);
            t2.setVisibility(GONE);
            t3.setVisibility(GONE);
        }
    }
    public void day6(View view) {
        d6++;

        TextView t1=(TextView)(findViewById(R.id.textView24));
        TextView t2=(TextView)(findViewById(R.id.textView38));
        TextView t3=(TextView)(findViewById(R.id.textView50));
        if(d6%2!=0)
        {
            t1.setVisibility(VISIBLE);
            t2.setVisibility(VISIBLE);
            t3.setVisibility(VISIBLE);

        }
        else
        {
            t1.setVisibility(GONE);
            t2.setVisibility(GONE);
            t3.setVisibility(GONE);
        }
    }
    public void day7(View view) {
        d7++;

        TextView t1=(TextView)(findViewById(R.id.textView25));
        TextView t2=(TextView)(findViewById(R.id.textView39));
        TextView t3=(TextView)(findViewById(R.id.textView49));
        if(d7%2!=0)
        {
            t1.setVisibility(VISIBLE);
            t2.setVisibility(VISIBLE);
            t3.setVisibility(VISIBLE);

        }
        else
        {
            t1.setVisibility(GONE);
            t2.setVisibility(GONE);
            t3.setVisibility(GONE);
        }
    }
}