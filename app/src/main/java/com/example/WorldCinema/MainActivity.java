package com.example.WorldCinema;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Email;
    EditText Password;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = (EditText)findViewById(R.id.email);
        Password = (EditText)findViewById(R.id.password);
    }

    public void Login (View view){
        if (Email.getText().length() != 0 && Password.getText().length() != 0) {
            Intent intent = new Intent (this, MainScreen.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Заполните все поля.",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void Reg (View view){
        Intent intent = new Intent (this, Registration.class);
        startActivity(intent);

        Email.setText("");
        Password.setText("");
    }
}

