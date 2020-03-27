package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class thirdactivity extends AppCompatActivity {

    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;
    TextView text7;
    TextView text8;
    TextView text9;
    TextView text10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);

        text1=(TextView)findViewById(R.id.textView2);
        text2=(TextView)findViewById(R.id.textView3);
        text3=(TextView)findViewById(R.id.textView4);
        text4=(TextView)findViewById(R.id.textView5);
        text5=(TextView)findViewById(R.id.textView6);
        text6=(TextView)findViewById(R.id.textView7);
        text7=(TextView)findViewById(R.id.textView8);
        text8=(TextView)findViewById(R.id.textView9);
        text9=(TextView)findViewById(R.id.textView10);
        text10=(TextView)findViewById(R.id.textView);







    }
}
