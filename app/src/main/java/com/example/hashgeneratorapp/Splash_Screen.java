package com.example.hashgeneratorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.hashgeneratorapp.utils.Utils;

public class Splash_Screen extends AppCompatActivity {
    int splash_time=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        Utils.blackiconstatusbarColor(Splash_Screen.this,R.color.dark_blue);
        Utils.changeNavigationbarColor(Splash_Screen.this,R.color.dark_blue);
        Utils.changeStatusbarColor(Splash_Screen.this,R.color.dark_blue);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash_Screen.this,MainActivity.class));
                finish();
            }
        },splash_time);
    }
}