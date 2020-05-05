package com.example.recyclerviewnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView namaText = findViewById(R.id.detail_title);
        ImageView iconImg = findViewById(R.id.detail_icon);
        TextView jumlahKamarText = findViewById(R.id.detail_jumlah_kamar);
        TextView hargaText = findViewById(R.id.detail_harga);
        TextView lokasiText = findViewById(R.id.detail_lokasi);

        String nama = "Guesthouse name not set";
        int icon = R.drawable.gh1;
        String jumlahkamar = "Jumlah kamar not set";
        String harga = "Harga not set";
        String lokasi = "Lokasi not set";

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            nama = extras.getString("Nama");
            icon = extras.getInt("Image");
            jumlahkamar = extras.getString("JumlahKamar");
            harga = extras.getString("Harga");
            lokasi = extras.getString("Lokasi");
        }

        namaText.setText(nama);
        iconImg.setImageResource(icon);
        jumlahKamarText.setText(jumlahkamar);
        hargaText.setText(harga);
        lokasiText.setText(lokasi);
    }
}
