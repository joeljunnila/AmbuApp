package com.example.ambuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SynnytyksenJalkeen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synnytyksen_jalkeen);
    }

    public void returnHome(View view) {
        Intent intent = new Intent(this, Home.class);
        setResult(RESULT_OK, intent);
        startActivity(intent);
    }
}