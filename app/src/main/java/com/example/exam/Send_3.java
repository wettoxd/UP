package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Send_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send3);
    }

    public void backtohome(View view) {
        Intent intent = new Intent(Send_3.this, Home_page.class);
        startActivity(intent);
    }


    public void gotopay(View view) {
        Intent intent = new Intent(Send_3.this, Delivery_succesful.class);
        startActivity(intent);
    }
}