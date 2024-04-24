package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Add_payment_method extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_payment_method);
    }

    public void backback(View view) {
        Intent intent = new Intent(Add_payment_method.this, Home_page.class);
        startActivity(intent);
    }
}