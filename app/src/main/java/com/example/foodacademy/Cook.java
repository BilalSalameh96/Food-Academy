package com.example.foodacademy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Cook extends AppCompatActivity {

    ImageButton SALAD, BEEF, CHICKEN;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cook);

        SALAD = findViewById(R.id.salad);
        BEEF = findViewById(R.id.beef);
        CHICKEN = findViewById(R.id.chicken);

        SALAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cook.this, Salad.class);
                startActivity(intent);
            }
        });
        BEEF.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent1 = new Intent(Cook.this,Beef.class);
                startActivity(intent1);
            }

        });
        CHICKEN.setOnClickListener(new View.OnClickListener() {
                                       public void onClick(View view) {
                                           Intent intent2 = new Intent(Cook.this, Chicken.class);
                                           startActivity(intent2);
                                       }
                                   }
        );


    }

}