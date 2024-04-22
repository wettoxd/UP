package com.example.exam;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class OTP_verification extends AppCompatActivity {

    private EditText[] otpEditTexts = new EditText[6];
    private Button setNewPasswordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);

        TextView textView4 = findViewById(R.id.textView4);

        new CountDownTimer(60000, 1000) {
            public void onTick(long millisUntilFinished) {
                textView4.setText("" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                textView4.setText("0");
            }
        }.start();

        otpEditTexts[0] = findViewById(R.id.editTextText3);
        otpEditTexts[1] = findViewById(R.id.editTextText4);
        otpEditTexts[2] = findViewById(R.id.editTextText5);
        otpEditTexts[3] = findViewById(R.id.editTextText6);
        otpEditTexts[4] = findViewById(R.id.editTextText7);
        otpEditTexts[5] = findViewById(R.id.editTextText8);
        setNewPasswordButton = findViewById(R.id.button3);
        setNewPasswordButton.setEnabled(false);
        // Установите слушателей на поля ввода
        for (EditText editText : otpEditTexts) {
            editText.addTextChangedListener(textWatcher);
        }

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
            boolean allFieldsFilled = true;
            for (EditText editText : otpEditTexts) {
                if (editText.getText().toString().trim().length() == 0) {
                    allFieldsFilled = false;
                    break;
                }
            }

            if (allFieldsFilled) {
                // Если все поля заполнены, делаем кнопку кликабельной и меняем её цвет на синий
                setNewPasswordButton.setEnabled(true);
                setNewPasswordButton.setBackgroundColor(Color.parseColor("#2F80ED"));
            } else {
                // Если не все поля заполнены, делаем кнопку некликабельной и возвращаем её цвет в исходное состояние
                setNewPasswordButton.setEnabled(false);
                setNewPasswordButton.setBackgroundColor(Color.parseColor("#A7A7A7"));
                setNewPasswordButton.setTextColor(Color.parseColor("#FFFFFF"));
            }
        }
    };

    public void new_password(View view) {
        Intent intent = new Intent(OTP_verification.this, NewPassword.class);
        startActivity(intent);
    }
}