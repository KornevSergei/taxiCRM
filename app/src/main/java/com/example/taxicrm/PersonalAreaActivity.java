package com.example.taxicrm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PersonalAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_area);
    }

    //описываем кнопку новости
    public void news(View view) {
        Intent intent = new Intent(PersonalAreaActivity.this, NewsActivity.class);
        startActivity(intent);
    }
}
