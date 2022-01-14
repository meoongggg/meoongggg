package com.example.tugasuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class detail extends AppCompatActivity {

    ListView listView;
    public String[] Menu_Makanan = {"Menu Makan", "Nasi + Rendang + Es Teh Rp 15.000",
            "Nasi + Ayam Goreng + Es Teh Rp 17.000", "Nasi + Paru Goreng + Es Teh Rp 18.000",
            "Nasi + Ayam Bakar + Es Teh Rp 18.000","Nasi + Ayam Pop + Es Teh Rp 18.000",
            "Nasi + Sayur Kikil +Es Teh Rp 16.000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        listView = (ListView) findViewById(R.id.listMakanan);
        ArrayAdapter adapter = new ArrayAdapter(detail.this, R.layout.support_simple_spinner_dropdown_item, Menu_Makanan);

        listView.setAdapter(adapter);
    }

    public void backpage4(View view) {
        Intent intent = new Intent(detail.this,home.class);
        startActivity(intent);
    }
}