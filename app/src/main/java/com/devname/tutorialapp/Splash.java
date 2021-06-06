package com.devname.tutorialapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        SharedPreferences sharedPreferences=getSharedPreferences("tutorial",MODE_PRIVATE);
        if (sharedPreferences.getBoolean("is_logged_in",false)){
            startActivity(new Intent(this,MainActivity.class));
            finish();
        }

    }

    @Override
    public void onClick(View v) {
        SharedPreferences sharedPreferences=getSharedPreferences("tutorial",MODE_PRIVATE);
        sharedPreferences.edit().putBoolean("is_logged_in",true)
                .apply();
    }
}