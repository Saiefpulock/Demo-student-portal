package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   // private EditText editText1;
   // private Button showButton;
   // private TextView showText;


    EditText edit;
    EditText edit2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //editText1 = (EditText) findViewById(R.id.editText1);
       //showButton = (Button) findViewById(R.id.button1);
      // showText = (TextView) findViewById(R.id.textView1);

        edit=(EditText) findViewById(R.id.editText);
        edit2=(EditText) findViewById(R.id.editText2);
       button= (Button) findViewById(R.id.button);

       /* showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText1.getText().toString();
                showText.setText(value);
            }
        }); */

        ///my own
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userIDStr = edit.getText().toString();

                Intent login= new Intent(MainActivity.this,secondactivity.class);

                login.putExtra("user",userIDStr);
                startActivity(login);
            }
        });



    }

/*
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        showButton = (Button) findViewById(R.id.button1);
        showText = (TextView) findViewById(R.id.textView1);

        showButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String value = editText1.getText().toString();
        showText.setText(value);
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        showButton = (Button) findViewById(R.id.button1);
        showText = (TextView) findViewById(R.id.textView1);

    }

    public void showText(View v) {

        String value = editText1.getText().toString();
        showText.setText(value);
    }
*/

}