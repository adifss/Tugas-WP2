package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

public class Ongoing extends AppCompatActivity {
    Button button10, button11, button13, button14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ongoing);

        button10 =(Button) findViewById(R.id.button10);
        button11 =(Button) findViewById(R.id.button11);
        button13 =(Button) findViewById(R.id.button13);
        button14 =(Button) findViewById(R.id.button14);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ongoing.this, Mierukochan.class);
                finish();
                startActivity(intent);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ongoing.this, PrideOfOrange.class);
                finish();
                startActivity(intent);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ongoing.this, TaktOpDestiny.class);
                finish();
                startActivity(intent);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ongoing.this, MushokuTensei.class);
                finish();
                startActivity(intent);
            }
        });
    }
}