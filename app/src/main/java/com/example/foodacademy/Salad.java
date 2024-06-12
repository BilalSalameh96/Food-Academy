package com.example.foodacademy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Salad extends AppCompatActivity {
    ImageButton Salad1 , Salad2, Salad3;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.salad);

        Salad1 = findViewById(R.id.salad1);
        Salad2 = findViewById(R.id.salad2);
        Salad3 = findViewById(R.id.salad3);

        Salad1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Salad.this, Salad1.class);
                startActivity(intent);
            }
        });
        Salad2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Salad.this, Salad2.class);
                startActivity(intent1);
            }
        });
        Salad3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Salad.this, Salad3.class);
                startActivity(intent1);
            }
        });
    }

}
