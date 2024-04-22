package com.example.exam;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Sign_up extends AppCompatActivity {

    private EditText editTextText, editTextText2, editTextText3, editTextText4, editTextText5;
    private CheckBox checkBox;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        editTextText = findViewById(R.id.editTextText);
        editTextText2 = findViewById(R.id.editTextText2);
        editTextText3 = findViewById(R.id.editTextText3);
        editTextText4 = findViewById(R.id.editTextText4);
        editTextText5 = findViewById(R.id.editTextText5);
        checkBox = findViewById(R.id.checkBox);
        button3 = findViewById(R.id.button3);
        button3.setEnabled(false);
        // Обработчик событий для всех полей ввода и чекбокса
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                checkButtonState();
            }
        };

        // Добавление обработчика событий для всех полей ввода
        editTextText.addTextChangedListener(textWatcher);
        editTextText2.addTextChangedListener(textWatcher);
        editTextText3.addTextChangedListener(textWatcher);
        editTextText4.addTextChangedListener(textWatcher);
        editTextText5.addTextChangedListener(textWatcher);

        // Обработчик событий для чекбокса
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> checkButtonState());

        // Инициализация состояния кнопки
        checkButtonState();
    }

    private void checkButtonState() {
        boolean isAllFieldsFilled = !editTextText.getText().toString().isEmpty() &&
                !editTextText2.getText().toString().isEmpty() &&
                !editTextText3.getText().toString().isEmpty() &&
                !editTextText4.getText().toString().isEmpty() &&
                !editTextText5.getText().toString().isEmpty();

        boolean isCheckBoxChecked = checkBox.isChecked();

        if (isAllFieldsFilled && isCheckBoxChecked) {
            button3.setBackgroundColor(Color.parseColor("#2F80ED"));
            button3.setEnabled(true);
        } else {
            button3.setBackgroundColor(Color.parseColor("#A7A7A7"));
            button3.setTextColor(Color.parseColor("#FFFFFF"));
            button3.setEnabled(false);
        }

    }

    public void log_in(View view) {
        Intent intent = new Intent(Sign_up.this, Log_in.class);
        startActivity(intent);
    }
}