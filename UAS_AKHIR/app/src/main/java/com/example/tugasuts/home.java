package com.example.tugasuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void backmain(View view) {
        Intent intent = new Intent(home.this,MainActivity.class);
        startActivity(intent);
    }

    public void menu(View view) {
        Intent intent = new Intent(home.this,paketmakan.class);
        startActivity(intent);
    }

    public void order(View view) {
        Intent intent = new Intent(home.this,Menu.class);
        startActivity(intent);
    }

    public void tntgkita(View view) {
        Intent intent = new Intent(home.this,tentangkita.class);
        startActivity(intent);
    }

    public void toastpaket(View view) {
        Toast.makeText(this, "ingin lihat katalog makanan? klik logo diatas", Toast.LENGTH_SHORT).show();
    }

    public void toastorder(View view) {
        Toast.makeText(this, "ingin Pesan? klik logo diatas", Toast.LENGTH_SHORT).show();
    }

    public void toasttntgkita(View view) {
        Toast.makeText(this, "ingin mengenal kita lebih dekat? klik logo diatas", Toast.LENGTH_SHORT).show();
    }

    public void detail(View view) {
        Intent intent = new Intent(home.this,detail.class);
        startActivity(intent);
    }

    public void toastdetail(View view) {Toast.makeText(this, "ingin tahu detail makanan? klik logo diatas", Toast.LENGTH_SHORT).show();
    }
}