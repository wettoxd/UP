package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
    //метод для перехода на новую активити
    public void skip(View view) {
        Intent intent;
        intent = new Intent(MainActivity2.this, MainActivity4.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent;
        intent = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(intent);
    }

}