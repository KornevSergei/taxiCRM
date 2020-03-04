package com.example.taxicrm;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

//делаем заставку из АктивитиМейн
public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread() {
            //запускаем поток
            @Override
            public void run() {
                try {
                    sleep(3000);//время показа заставки
                } catch (Exception e) {
                    e.printStackTrace();
                } finally { //запускаем активити после заставки
                    startActivity(new Intent(
                            SplashScreenActivity.this,
                            LoginActivity.class));
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
