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

public class NewPassword extends AppCompatActivity {

    private EditText passwordEditText;
    private EditText confirmPasswordEditText;
    private Button logInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password);

        passwordEditText = findViewById(R.id.editTextText4);
        confirmPasswordEditText = findViewById(R.id.editTextText5);
        logInButton = findViewById(R.id.button3);

        // Установите слушателей на поля ввода
        passwordEditText.addTextChangedListener(textWatcher);
        confirmPasswordEditText.addTextChangedListener(textWatcher);

        // Изначально кнопка не кликабельна
        logInButton.setEnabled(false);
    }

    private final TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            // Проверяем, заполнены ли все поля
            boolean allFieldsFilled = !passwordEditText.getText().toString().trim().isEmpty() &&
                    !confirmPasswordEditText.getText().toString().trim().isEmpty();

            if (allFieldsFilled) {
                // Если все поля заполнены, делаем кнопку кликабельной и меняем её цвет на синий
                logInButton.setEnabled(true);
                logInButton.setBackgroundColor(Color.parseColor("#2F80ED"));
            } else {
                // Если не все поля заполнены, делаем кнопку некликабельной и возвращаем её цвет в исходное состояние
                logInButton.setEnabled(false);
                logInButton.setBackgroundColor(Color.parseColor("#A7A7A7"));
                logInButton.setTextColor(Color.parseColor("#FFFFFF"));
            }
        }
    };

    public void log_in(View view) {
        // Здесь ваша логика перехода на экран входа
        Intent intent = new Intent(NewPassword.this, Log_in.class);
        startActivity(intent);
    }
}