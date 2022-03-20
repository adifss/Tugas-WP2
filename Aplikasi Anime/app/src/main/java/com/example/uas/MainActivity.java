package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button, button15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        button15 = (Button)findViewById(R.id.button15);

        button.setOnClickListener(v -> {
            Intent intent =new Intent(getApplicationContext(),MenuUtama.class);
            startActivity(intent);
        });

        button15.setOnClickListener(v -> {
            Intent intent =new Intent(getApplicationContext(),SignUp.class);
            startActivity(intent);
        });
    }
}