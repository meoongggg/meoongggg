package com.example.tugasuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    ListView listView;
    Spinner combo1;

    int angka= 0;
    TextView angkakounter;

    EditText HargaLauk, JumlahLauk, NamaLauk;
    TextView tvLauk,tvHarga,tvJumlah,tvTotal;
    Button JumlahHarga;

    String nmLauk,hrgLauk,jmlLauk;
    double jmlhLauk,hrgaLauk,total;


    public String Menu_Makanan[] = {"Menu Makan", "Nasi Rendang Rp 15.000"
            ,"Nasi Ayam Goreng Rp 17.000", "Nasi Paru Rp 18.000", "Nasi Ayam Bakar Rp 18.000",
            "Nasi Ayam Pop Rp 18.000", " Nasi Kikil Rp 16.000"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        angkakounter=findViewById(R.id.kounter);

        listView = (ListView) findViewById(R.id.listMakanan);
        combo1 = (Spinner) findViewById(R.id.PaketCombo);
        ArrayAdapter adapter = new ArrayAdapter(Menu.this, R.layout.support_simple_spinner_dropdown_item, Menu_Makanan);

        listView.setAdapter(adapter);
        combo1.setAdapter(adapter);

        //edit
        NamaLauk = (EditText) findViewById(R.id.NamaLauk);
        HargaLauk = (EditText) findViewById(R.id.HargaLauk);
        JumlahLauk = (EditText) findViewById(R.id.JumlahLauk);


        //text
        tvLauk = findViewById(R.id.tvLauk);
        tvJumlah = findViewById(R.id.tvJumlah);
        tvHarga = findViewById(R.id.tvHarga);
        tvTotal = findViewById(R.id.tvTotal);


        JumlahHarga=findViewById(R.id.JumlahHarga);

        JumlahHarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nmLauk = NamaLauk.getText().toString().trim();
                hrgLauk = HargaLauk.getText().toString().trim();
                jmlLauk = JumlahLauk.getText().toString().trim();


                jmlhLauk = Double.parseDouble(jmlLauk);
                hrgaLauk = Double.parseDouble(hrgLauk);
                total = (jmlhLauk * hrgaLauk);

                tvLauk.setText("Nama Lauk  : " + nmLauk);
                tvHarga.setText("Harga Lauk : Rp." + hrgLauk);
                tvJumlah.setText("Jumlah Lauk : " + jmlLauk +" buah");
                tvTotal.setText("TOTAL : Rp." + total);

                angka = angka + 1;
                angkakounter.setText((Integer.toString(angka)));

            }
        });
    }

    public void backpage(View view) {
        Intent intent = new Intent(Menu.this,home.class);
        startActivity(intent);
    }


    public void nextpage(View view) {
        Intent intent = new Intent(Menu.this,Perhitungan.class);
        startActivity(intent);
    }

    public void TotalKslrhan(View view) {
        Toast.makeText(this, "Nota Pesanan Anda ", Toast.LENGTH_SHORT).show();
    }
}
