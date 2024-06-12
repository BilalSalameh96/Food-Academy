package com.example.foodacademy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CustomerDB extends AppCompatActivity {
    EditText Username, Password;
    Button  Save, Login;
    DBHelper dbHelper;

    SharedPreferences sharedPreferences;
    private static final String Shared_PREF_NAME = "mypref";
    private static final String Key_NAME = "name";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = findViewById(R.id.username);
        Password = findViewById(R.id.password);
        Save = findViewById(R.id.save);
        Login = findViewById(R.id.login);
        dbHelper = new DBHelper(this);
        sharedPreferences = getSharedPreferences(Shared_PREF_NAME,MODE_PRIVATE);
        String name = sharedPreferences.getString(Key_NAME,null);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user, pwd;
                user = Username.getText().toString();
                pwd = Password.getText().toString();

                if (user.isEmpty() || pwd.isEmpty()) {
                    Toast.makeText(CustomerDB.this, "Please fill the fields", Toast.LENGTH_LONG).show();
                } else if (dbHelper.checkUser(user, pwd)) {

                        SharedPreferences.Editor editor =sharedPreferences.edit();
                        editor.putString(Key_NAME,Username.getText().toString());
                        editor.apply();

                        Intent intent = new Intent(CustomerDB.this, ActivityLogin.class);
                        startActivity(intent);
                }
                else {
                        Toast.makeText(CustomerDB.this, "Not Exist, Please Create New Account", Toast.LENGTH_LONG).show();
                }

            }
        });

        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user, pwd;
                user = Username.getText().toString();
                pwd = Password.getText().toString();

                if (user.isEmpty() || pwd.isEmpty()) {
                    Toast.makeText(CustomerDB.this, "Please fill the fields", Toast.LENGTH_LONG).show();
                }
                else if (dbHelper.checkUsername(user)) {
                        Toast.makeText(CustomerDB.this, "Account Already Exists", Toast.LENGTH_LONG).show();
                        return;
                    }
                else {
                     boolean registeredSuccess = dbHelper.insertData(user, pwd);
                    Toast.makeText(CustomerDB.this, "Account Registered Successfully", Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}