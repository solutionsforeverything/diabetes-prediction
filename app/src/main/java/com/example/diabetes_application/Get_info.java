package com.example.diabetes_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.tensorflow.lite.Interpreter;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class Get_info extends AppCompatActivity {
    Interpreter interpreter;
    EditText e1,e2,e3,e4,e5,e6;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_info);

        try {
            interpreter = new Interpreter(loadModelFile(),null);
        } catch (IOException e) {
            e.printStackTrace();
        }
         e1=findViewById(R.id.AGE);
        e2=findViewById(R.id.email1);
         e3=findViewById(R.id.pass1);
         e4=findViewById(R.id.cpass1);
         e5=findViewById(R.id.addr1);
         e6=findViewById(R.id.phone1);
         t=findViewById(R.id.textView40);
        View button4 = findViewById(R.id.signin);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float f=doInterference(e6.getText().toString(),e4.getText().toString(),e5.getText().toString(),e3.getText().toString(),e2.getText().toString(),e1.getText().toString());
               t.setText(" f");

                 if(f==1.0) {
                    Intent categoryIntent = new Intent( Get_info.this,Positive_result.class);
                    startActivity(categoryIntent);
                    finish();
                }
                else
                {
                    Intent categoryIntent = new Intent(Get_info.this,Negative_Result.class);
                    startActivity(categoryIntent);
                    finish();
                }

            }
        });
    }
    private MappedByteBuffer loadModelFile() throws IOException
    {
        AssetFileDescriptor ass= this.getAssets().openFd("linear.tflite");
        FileInputStream fi=new FileInputStream(ass.getFileDescriptor());
        FileChannel fc=fi.getChannel();
        long so=ass.getStartOffset();
        long l=ass.getLength();
        return fc.map(FileChannel.MapMode.READ_ONLY,so,l);

    }
    public float doInterference(String val,String val1,String val2,String val3,String val4,String val5)
    {
        float[] input=new float[6];
     /*   input[0]=Float.parseFloat(val);
        input[1]=Float.parseFloat(val1);
        input[2]=Float.parseFloat(val2);
        input[3]=Float.parseFloat(val3);
        input[4]=Float.parseFloat(val4);
        input[5]=Float.parseFloat(val5);
        int[][] output=new int[1][1];*/
        input[0]=6;
        input[1]=148;
        input[2]=72;
        input[3]=120;
        input[4]= (float) 33.6;
        input[5]=50;
        float[][] output=new float[1][1];
        interpreter.run(input,output);
        return output[0][0];

    }

}