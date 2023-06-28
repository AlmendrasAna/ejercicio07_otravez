package com.example.ejercicio07;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextClock reloj = findViewById(R.id.textClock2);
    }
}