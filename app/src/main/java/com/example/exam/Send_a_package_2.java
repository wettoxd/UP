package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Send_a_package_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_apackage2);
    }

    public void backtohome(View view) {
        Intent intent = new Intent(Send_a_package_2.this, Home_Fragment.class);
        startActivity(intent);
    }

    public void edit_order(View view) {
        Intent intent = new Intent(Send_a_package_2.this, Send_a_package.class);
        startActivity(intent);
    }

    public void gotopay(View view) {
        Intent intent = new Intent(Send_a_package_2.this, Transaction_succesful.class);
        startActivity(intent);
    }
}