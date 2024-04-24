package com.example.exam;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Log_in extends AppCompatActivity {

    private EditText emailEditText, passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        emailEditText = findViewById(R.id.editTextText3);
        passwordEditText = findViewById(R.id.editTextText4);
        loginButton = findViewById(R.id.button3);
        loginButton.setEnabled(false);

        // Установите слушателей на поля ввода
        emailEditText.addTextChangedListener(textWatcher);
        passwordEditText.addTextChangedListener(textWatcher);

    }

    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            // Проверяем, заполнены ли все поля
            if (emailEditText.getText().toString().trim().length() > 0 &&
                    passwordEditText.getText().toString().trim().length() > 0) {
                // Если все поля заполнены, делаем кнопку кликабельной и меняем её цвет на синий
                loginButton.setEnabled(true);
                loginButton.setBackgroundColor(Color.parseColor("#2F80ED"));
            } else {
                // Если не все поля заполнены, делаем кнопку некликабельной и возвращаем её цвет в исходное состояние
                loginButton.setEnabled(false);
                loginButton.setBackgroundColor(Color.parseColor("#A7A7A7"));
                loginButton.setTextColor(Color.parseColor("#FFFFFF"));
            }
        }
    };

    public void sign_up(View view) {
        Intent intent = new Intent(Log_in.this, Sign_up.class);
        startActivity(intent);
    }

    public void forgot_password(View view) {
        Intent intent = new Intent(Log_in.this, Forgot_password.class);
        startActivity(intent);
    }

    public void home_page(View view) {
        Intent intent = new Intent(Log_in.this, Home_page.class);
        startActivity(intent);
    }
}