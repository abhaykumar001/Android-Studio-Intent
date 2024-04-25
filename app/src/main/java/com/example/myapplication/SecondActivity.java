package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Receive the values passed from the first activity
        Intent intent = getIntent();
        String message = intent.getStringExtra("key");

        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}
