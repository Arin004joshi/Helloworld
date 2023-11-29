package com.mastercoding.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button bt;
    TextView tv;
    int clicker = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = findViewById(R.id.button1);
        tv = findViewById(R.id.textView2);


        tv.setText(String.valueOf(clicker));

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicker++;
                tv.setText(String.valueOf(clicker));
            }
        });

    }
}