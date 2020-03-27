package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class secondactivity extends AppCompatActivity {

    EditText edit3;
    EditText edit4 ;
    EditText edit5;
    EditText edit6;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        edit3 = (EditText) findViewById(R.id.editText3);
        edit4= (EditText) findViewById(R.id.editText4);
        edit5=(EditText) findViewById(R.id.editText5);
        edit6=(EditText) findViewById(R.id.editText6);
        button2=(Button) findViewById(R.id. button2);
        button3= (Button) findViewById(R.id. button3);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null) {
            // String name = bundle.getString("name");
            //String studentID = bundle.getString("studentId");
            String userID = bundle.getString("user");
            edit4.setText(userID);
        }



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent courses= new Intent(secondactivity.this,thirdactivity.class);
                startActivity(courses);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent result= new Intent(secondactivity.this,Main2Activity.class);
                startActivity(result);
            }
        });




    }
}
