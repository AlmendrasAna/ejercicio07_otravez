package com.example.ejercicio07;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextClock reloj = findViewById(R.id.textClock2);
        Switch switchNight = findViewById(R.id.switchTheme);
        Toast.makeText(getBaseContext(), "Bienvenido (/o____o)/", Toast.LENGTH_LONG).show();

        switchNight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switchNight.isChecked()) {
                    getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);

                } else {
                    getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);

                }
            }
        });
    }


}