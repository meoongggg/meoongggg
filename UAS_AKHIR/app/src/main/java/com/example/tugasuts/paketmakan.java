package com.example.tugasuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class paketmakan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paketmakan);
    }

    public void previouspage2(View view) {
        Intent intent = new Intent(paketmakan.this,home.class);
        startActivity(intent);
    }
}