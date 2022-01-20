package com.example.intents_ejercicio_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMap = findViewById(R.id.btnMap);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapa = new Intent(Intent.ACTION_VIEW);
                mapa.setData(Uri.parse("geo:0,0?q=Zaragoza"));
                //mapa.setData(Uri.parse("https://goo.gl/maps/kR1gKf3SUdEWytgi7"));

                startActivity(mapa);
            }
        });
    }
}