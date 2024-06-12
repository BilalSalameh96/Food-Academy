package com.example.foodacademy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityLogin extends AppCompatActivity {
ImageButton CKbt , RSTbt;
Button Whatsapp;
SharedPreferences sharedPreferences;
private static final String Shared_PREF_NAME = "mypref";
private static final String Key_NAME = "name";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        CKbt = findViewById(R.id.ckbt);
        RSTbt = findViewById(R.id.rstbt);
        Whatsapp=findViewById(R.id.whatsapp);


        CKbt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLogin.this, Cook.class);
                startActivity(intent);
            }
        });
        RSTbt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ActivityLogin.this, Restaurant.class);
                startActivity(intent1);
            }
        });

        Whatsapp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                sharedPreferences = getSharedPreferences(Shared_PREF_NAME,MODE_PRIVATE);
                String name = sharedPreferences.getString(Key_NAME,null);
                String wpurl= "https://wa.me/+96170082771?text=Hi,this is "+name;
                Intent intent2= new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse(wpurl));
                startActivity(intent2);
            }
        });
    }
}