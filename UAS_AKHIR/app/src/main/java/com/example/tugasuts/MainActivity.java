package com.example.tugasuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void open(View view) {
        Intent intent = new Intent(MainActivity.this,home.class);
        startActivity(intent);
    }


    public void Jumlah(View view) {
    }

    public void prviouspage3(View view) {
    }

    public void prviouspage4(View view) {
    }
}