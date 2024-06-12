package com.example.foodacademy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class Beef extends AppCompatActivity {

    ImageButton Beef1 , Beef2, Beef3;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beef);


        Beef1 = findViewById(R.id.beef1);
        Beef2 = findViewById(R.id.beef2);
        Beef3 = findViewById(R.id.beef3);

        Beef1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Beef.this, Beef1.class);
                startActivity(intent);
            }
        });
        Beef2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Beef.this, Beef2.class);
                startActivity(intent1);
            }
        });
        Beef3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Beef.this, Beef3.class);
                startActivity(intent1);
            }
        });
    }
}
