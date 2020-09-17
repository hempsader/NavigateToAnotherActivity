package com.example.navigatetoanotheractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView textViewDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Initialise the Textview
        textViewDisplay = findViewById(R.id.textView_display);

        Bundle intent = getIntent().getExtras();
        String data = intent.getString(MainActivity.SEND_KEY);
        textViewDisplay.setText(data);
    }
}