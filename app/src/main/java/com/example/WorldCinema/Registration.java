package com.example.WorldCinema;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    EditText Name;
    EditText Surname;
    EditText Email;
    EditText Password1;
    EditText Password2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Name = (EditText)findViewById(R.id.Name);
        Surname = (EditText)findViewById(R.id.Surname);
        Email = (EditText)findViewById(R.id.Email);
        Password1 = (EditText)findViewById(R.id.Password);
        Password2 = (EditText)findViewById(R.id.PasswordRepeat);
    }

    public void Finish_Reg (View view){
        if (Name.getText().length() != 0 && Surname.getText().length() != 0 &&
                Email.getText().length() != 0 && Password1.getText().length() != 0 &&
                Password2.getText().length() != 0) {
            if (Password1.getText().toString().equals(Password2.getText().toString())) {
                Intent intent = new Intent(this, MainScreen.class);
                startActivity(intent);
                Name.setText("");
                Surname.setText("");
                Email.setText("");
                Password1.setText("");
                Password2.setText("");
            }
        } else {
            Toast.makeText(getApplicationContext(), "Заполните все поля.",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void Return (View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);

        Name.setText("");
        Surname.setText("");
        Email.setText("");
        Password1.setText("");
        Password2.setText("");
    }
}