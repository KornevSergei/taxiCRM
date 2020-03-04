package com.example.taxicrm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //обьявляем переменные
    private EditText username;
    private EditText password;
//    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //связываем
        username = findViewById(R.id.login);
        password = findViewById(R.id.password);
//        login = findViewById(R.id.buttonLogin);
    }

    //описываем кнопку Войти
    public void login(View view) {
        //делаем проверку на логин и пароль, если всё ок - выводим линный Тост и открываем новую активити
        if (username.getText().toString().equals("Sergei") &&
                password.getText().toString().equals("0000")) {
            Toast.makeText(getApplicationContext(), "Вход выполнен", Toast.LENGTH_SHORT).show();

            //выполняем переход на другой экран
            Intent intent = new Intent(LoginActivity.this, PersonalAreaActivity.class);
            startActivity(intent);

            //если данные введены неверное - выводим длинный тост с уведовмлением
        } else {
            Toast.makeText(getApplicationContext(), "Неверные данные!", Toast.LENGTH_SHORT).show();
        }
    }
}