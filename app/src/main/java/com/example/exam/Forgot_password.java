package com.example.exam;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Forgot_password extends AppCompatActivity {

    private EditText emailEditText;
    private Button sendOtpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        emailEditText = findViewById(R.id.editTextText3);
        sendOtpButton = findViewById(R.id.button3);
        sendOtpButton.setEnabled(false);
        // Установите слушателя на поле ввода
        emailEditText.addTextChangedListener(textWatcher);

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
            // Проверяем, заполнено ли поле
            if (emailEditText.getText().toString().trim().length() > 0) {
                // Если поле заполнено, делаем кнопку кликабельной и меняем её цвет на синий
                sendOtpButton.setEnabled(true);
                sendOtpButton.setBackgroundColor(Color.parseColor("#2F80ED"));
            } else {
                // Если поле не заполнено, делаем кнопку некликабельной и возвращаем её цвет в исходное состояние
                sendOtpButton.setEnabled(false);
                sendOtpButton.setBackgroundColor(Color.parseColor("#A7A7A7"));
                sendOtpButton.setTextColor(Color.parseColor("#FFFFFF"));
            }
        }
    };

    public void log_in(View view) {
        Intent intent = new Intent(Forgot_password.this, Log_in.class);
        startActivity(intent);
    }

    public void send_Otp(View view) {
        Intent intent = new Intent(Forgot_password.this, OTP_verification.class);
        startActivity(intent);
    }

}