package com.example.registerloginexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sosbtn extends AppCompatActivity {

    EditText et_id2;
    Button btn_112;
    Button btn_119;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sosbtn);


        et_id2 = findViewById(R.id.et_id2);
        btn_112 = findViewById(R.id.btn_112);
        btn_119 = findViewById(R.id.btn_119);

        btn_112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}