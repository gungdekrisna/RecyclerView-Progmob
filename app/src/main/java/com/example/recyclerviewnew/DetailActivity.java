package com.example.recyclerviewnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView namaText = findViewById(R.id.detail_title);
        /*TextView nama2Text = findViewById(R.id.detail_title2);
        TextView nama3Text = findViewById(R.id.detail_title3);*/

        String nama = "Username not set";
        /*String nama2 = "Username 2 not set";
        String nama3 = "username 3 not set";*/

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            nama = extras.getString("Nama");
            /*nama2 = extras.getString("rentangHarga");
            nama3 = extras.getString("lokasi");*/
        }

        namaText.setText(nama);
        /*nama2Text.setText(nama2);
        nama3Text.setText(nama3);*/
    }
}
