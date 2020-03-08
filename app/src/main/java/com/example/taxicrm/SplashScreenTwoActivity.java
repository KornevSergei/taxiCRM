package com.example.taxicrm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreenTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_two);

        Thread thread = new Thread() {
            //запускаем поток
            @Override
            public void run() {
                try {
                    sleep(1000);//время показа заставки
                } catch (Exception e) {
                    e.printStackTrace();
                } finally { //запускаем активити после заставки
                    startActivity(new Intent(
                            SplashScreenTwoActivity.this,
                            PersonalAreaActivity.class));
                }
            }
        };
        //после страта переключаемся в новую активти
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}