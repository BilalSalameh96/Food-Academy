package com.example.foodacademy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Chicken extends AppCompatActivity {
    ImageButton Chicken1 , Chicken2, Chicken3;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken);


        Chicken1 = findViewById(R.id.chicken1);
        Chicken2 = findViewById(R.id.chicken2);
        Chicken3 = findViewById(R.id.chicken3);

        Chicken1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chicken.this, Chicken1.class);
                startActivity(intent);
            }
        });
        Chicken2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Chicken.this, Chicken2.class);
                startActivity(intent1);
            }
        });
        Chicken3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Chicken.this, Chicken3.class);
                startActivity(intent1);
            }
        });
    }
}

