package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboarding_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void skip(View view) {
        Intent intent;
        intent = new Intent(Onboarding_1.this, Onboarding_3.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent;
        intent = new Intent(Onboarding_1.this, Onboarding_2.class);
        startActivity(intent);
    }

}