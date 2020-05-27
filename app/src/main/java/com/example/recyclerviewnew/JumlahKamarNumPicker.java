package com.example.recyclerviewnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class JumlahKamarNumPicker extends AppCompatActivity {
    int num=1;
    ImageView imgMinus;
    ImageView imgPlus;
    TextView txtNumber;
    Button enterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumlah_kamar_num_picker);

        imgMinus = (ImageView) findViewById(R.id.imgMinus);
        imgMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num>1){
                    num--;
                }
                setText();
            }
        });

        imgPlus = (ImageView) findViewById(R.id.imgPlus);
        imgPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == 9){
                    num = 1;
                } else {
                    num++;
                }
                setText();
            }
        });

        enterBtn = (Button) findViewById(R.id.jumlahKamarBtn);
        enterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(JumlahKamarNumPicker.this, RentangHargaActivity.class);
                i.putExtra("JumlahKamar", num);
                startActivity(i);
            }
        });
    }

    public void setText(){
        txtNumber = (TextView) findViewById(R.id.txtNumbers);
        txtNumber.setText(num+"");
    }
}
