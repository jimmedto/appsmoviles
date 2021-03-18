package com.example.example2_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    String myString;
    TextView txtManager;
    Intent intentReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtManager = findViewById(R.id.textView2);
        intentReceiver = getIntent();
        txtManager.setText(intentReceiver.getStringExtra("myExtra"));

    }
}