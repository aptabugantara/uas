package com.example.mobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import static com.example.mobil.MainActivity.EXTRA_HARGA;
import static com.example.mobil.MainActivity.EXTRA_IMG;
import static com.example.mobil.MainActivity.EXTRA_NAMA;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent =getIntent();
        String gambar = intent.getStringExtra(EXTRA_IMG);
        String nama = intent.getStringExtra(EXTRA_NAMA);
        String harga = intent.getStringExtra(EXTRA_HARGA);

        ImageView imgambar = findViewById(R.id.img_detail);
        TextView tvnama = findViewById(R.id.nama_det);
        TextView tvharga = findViewById(R.id.harga_det);

        Glide
                .with(this)
                .load(gambar)
                .into(imgambar);

        tvnama.setText(nama);
        tvharga.setText(harga);

    }
}
