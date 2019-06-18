package com.example.extra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        message = findViewById(R.id.textview1);

        Intent i = getIntent();
        String welcome = i.getStringExtra("value");

        message.setText(welcome);
    }
}
