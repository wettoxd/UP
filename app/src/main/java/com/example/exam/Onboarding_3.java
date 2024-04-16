package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboarding_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void sign_up(View view) {
        Intent intent;
        intent = new Intent(Onboarding_3.this, Sign_up.class);
        startActivity(intent);
    }

    public void log_in(View view) {
        Intent intent;
        intent = new Intent(Onboarding_3.this, Log_in.class);
        startActivity(intent);
    }

}