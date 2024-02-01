package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText eusername,epassword;
    Button esubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eusername = findViewById(R.id.username);
        epassword = findViewById(R.id.password);
        esubmit = findViewById(R.id.submit);

        esubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = eusername.getText().toString();
                String password = epassword.getText().toString();

                if (username.equals("Darshan") && password.equals("Darshan")) {
                    // Successful login
                    startWelcomeActivity();
                } else {
                    // Invalid credentials
                    Toast.makeText(MainActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
    private void startWelcomeActivity() {
        Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
        intent.putExtra("Username", eusername.getText().toString());
        startActivity(intent);
    }
}