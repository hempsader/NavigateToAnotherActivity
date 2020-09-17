package com.example.navigatetoanotheractivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String SEND_KEY = "key";
    private static final int REQUEST_CODE_RESULT_BACK = 10;
    private EditText sendText;
    private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize widgets
        sendText = findViewById(R.id.editText_send_data);
        send = findViewById(R.id.button_send);

        //Initialize the Intent
        final Intent intent = new Intent(this, SecondActivity.class);
        
        //Navigate to SecondActivity when button is clicked
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Put data to intent in order to send it to next activity
                intent.putExtra(SEND_KEY,sendText.getText().toString());

                //Start next Activity/No data is passed back to this activity
                startActivity(intent);

            }
        });
    }

}