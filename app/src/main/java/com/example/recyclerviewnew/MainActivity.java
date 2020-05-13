package com.example.recyclerviewnew;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private GuesthouseAdapter adapter;
    private ArrayList<Guesthouse> guesthouseArrayList;
    private GuesthouseAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        setOnClickListener();

        adapter = new GuesthouseAdapter(guesthouseArrayList, listener);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void setOnClickListener() {
        listener = new GuesthouseAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("Nama", guesthouseArrayList.get(position).getNama());
                intent.putExtra("Image", guesthouseArrayList.get(position).getIcon());
                intent.putExtra("JumlahKamar", guesthouseArrayList.get(position).getJumlahKamar());
                intent.putExtra("Harga", guesthouseArrayList.get(position).getHarga());
                intent.putExtra("Lokasi", guesthouseArrayList.get(position).getLokasi());
                intent.putExtra("Facility1", guesthouseArrayList.get(position).getFacility1());
                intent.putExtra("Facility2", guesthouseArrayList.get(position).getFacility2());
                intent.putExtra("Facility3", guesthouseArrayList.get(position).getFacility3());
                intent.putExtra("Facility4", guesthouseArrayList.get(position).getFacility4());
                intent.putExtra("Wisata1", guesthouseArrayList.get(position).getWisata1());
                intent.putExtra("Wisata2", guesthouseArrayList.get(position).getWisata2());
                intent.putExtra("Wisata3", guesthouseArrayList.get(position).getWisata3());
                intent.putExtra("Wisata4", guesthouseArrayList.get(position).getWisata4());
                startActivity(intent);
            }
        };
    }

    private void addData() {
        /*Menerima Data Lokasi*/
        String jumlahKamar;
        String rentangHarga;
        String lokasi;

        Bundle extras = getIntent().getExtras();
        jumlahKamar = extras.getString("jumlahKamar");
        rentangHarga = extras.getString("rentangHarga");
        lokasi = extras.getString("lokasi");

        guesthouseArrayList = new ArrayList<>();

        Guesthouse p1 = new Guesthouse("Soca Garden Guesthouse", "3 Room", "Sanggingan Street, Ubud, Bali", R.drawable.gh1, "500000", 500000, "Ubud", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p2 = new Guesthouse("Umalas Guesthouse", "3 Room", "Bima Street, Canggu, Bali", R.drawable.gh1, "500000", 500000, "Canggu",3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Ubud Palace", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p3 = new Guesthouse("Kamala Ubud Guesthouse", "4 Room", "Monkey Forest Street, Ubud, Bali", R.drawable.gh2, "600000", 600000, "Ubud", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p4 = new Guesthouse("The Village Guest House", "5 Room", "Kajeng Street, Kuta, Bali", R.drawable.gh3, "1000000", 1000000, "Kuta", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p5 = new Guesthouse("Manggis Sari Guesthouse", "3 room", "Suweta Street, Uluwatu, Bali", R.drawable.gh4, "900000", 900000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p6 = new Guesthouse("Nyoman Sandi Guesthouse", "4 Room", "Hanoman Street, Canggu, Bali", R.drawable.gh5, "200000", 200000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p7 = new Guesthouse("Loka Sari Guest House", "4 Room", "Kuwera Street, Kuta, Bali", R.drawable.gh6, "300000", 300000, "Kuta", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p8 = new Guesthouse("Kudos Guesthouse Ubud", "3 Room", "Arjuna Street, Ubud, Bali", R.drawable.gh7, "400000", 400000, "Ubud", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p9 = new Guesthouse("Sandat Bali Ubud Guesthouse", "2 Room", "Sambahan Street, Ubud, Bali", R.drawable.gh8, "500000", 500000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p10 = new Guesthouse("Putu's Paradise Guesthouse", "3 Room", "Gotama Street, Uluwatu, Bali", R.drawable.gh9, "250000", 250000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p11 = new Guesthouse("Teba Homestay", "4 Room", "Berawa Street, Canggu, Bali", R.drawable.gh10, "300000", 300000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p12 = new Guesthouse("Cito Guesthouse", "2 Room", "Nyuh Kuning Street, Kuta, Bali", R.drawable.gh11, "700000", 700000, "Kuta", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p13 = new Guesthouse("Sunari Guesthouse Ubud", "8 Room", "Sanggingan Street, Ubud, Bali", R.drawable.gh12, "400000", 400000, "Ubud", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p14 = new Guesthouse("Ujung Ubud Guest House", "3 Room", "Sriwedari Street, Ubud, Bali", R.drawable.gh13, "300000", 300000, "Ubud", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        //tambahan mega
        Guesthouse p15 = new Guesthouse("Nurada Cottage", "1 Room", "Sriwedari Street, Ubud, Bali", R.drawable.gh13, "300000", 300000, "Ubud", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");

        List<Guesthouse> guesthouse = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14);

        if (jumlahKamar.equals("1 Room")){
            if (rentangHarga.equals("IDR 100K - 200K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 100000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 100000 && guesthouse1.getHargaInt() < 200000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 200K - 300K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 200000 && guesthouse1.getHargaInt() < 300000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 300K - 400K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 300000 && guesthouse1.getHargaInt() < 400000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 400K - 500K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 400000 && guesthouse1.getHargaInt() < 500000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 500K - 600K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 500000 && guesthouse1.getHargaInt() < 600000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 600K - 700K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 600000 && guesthouse1.getHargaInt() < 700000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 700K - 800K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 700000 && guesthouse1.getHargaInt() < 800000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 800K - 900K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 900000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 800000 && guesthouse1.getHargaInt() < 900000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else {
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getHargaInt() > 900000 && guesthouse1.getKecamatan().equals(lokasi)) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            }
        } else if (jumlahKamar.equals("2 Room")){
            if (rentangHarga.equals("IDR 100K - 200K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 100000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 100000 && guesthouse1.getHargaInt() < 200000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 200K - 300K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 200000 && guesthouse1.getHargaInt() < 300000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 300K - 400K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 300000 && guesthouse1.getHargaInt() < 400000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 400K - 500K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 400000 && guesthouse1.getHargaInt() < 500000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 500K - 600K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 500000 && guesthouse1.getHargaInt() < 600000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 600K - 700K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 600000 && guesthouse1.getHargaInt() < 700000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 700K - 800K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 700000 && guesthouse1.getHargaInt() < 800000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 800K - 900K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 900000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 800000 && guesthouse1.getHargaInt() < 900000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else {
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getHargaInt() > 900000 && guesthouse1.getKecamatan().equals(lokasi)) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            }
        } else if (jumlahKamar.equals("3 Room")){
            if (rentangHarga.equals("IDR 100K - 200K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 100000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 100000 && guesthouse1.getHargaInt() < 200000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 200K - 300K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 200000 && guesthouse1.getHargaInt() < 300000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 300K - 400K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 300000 && guesthouse1.getHargaInt() < 400000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 400K - 500K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 400000 && guesthouse1.getHargaInt() < 500000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 500K - 600K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 500000 && guesthouse1.getHargaInt() < 600000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 600K - 700K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 600000 && guesthouse1.getHargaInt() < 700000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 700K - 800K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 700000 && guesthouse1.getHargaInt() < 800000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 800K - 900K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 900000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 800000 && guesthouse1.getHargaInt() < 900000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else {
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getHargaInt() > 900000 && guesthouse1.getKecamatan().equals(lokasi)) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            }
        } else if (jumlahKamar.equals("4 Room")){
            if (rentangHarga.equals("IDR 100K - 200K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 100000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 100000 && guesthouse1.getHargaInt() < 200000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 200K - 300K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 200000 && guesthouse1.getHargaInt() < 300000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 300K - 400K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 300000 && guesthouse1.getHargaInt() < 400000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 400K - 500K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 400000 && guesthouse1.getHargaInt() < 500000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 500K - 600K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 500000 && guesthouse1.getHargaInt() < 600000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 600K - 700K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 600000 && guesthouse1.getHargaInt() < 700000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 700K - 800K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 700000 && guesthouse1.getHargaInt() < 800000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 800K - 900K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 900000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 800000 && guesthouse1.getHargaInt() < 900000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else {
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getHargaInt() > 900000 && guesthouse1.getKecamatan().equals(lokasi)) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            }
        } else if (jumlahKamar.equals("5 Room")){
            if (rentangHarga.equals("IDR 100K - 200K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 100000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 100000 && guesthouse1.getHargaInt() < 200000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 200K - 300K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 200000 && guesthouse1.getHargaInt() < 300000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 300K - 400K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 300000 && guesthouse1.getHargaInt() < 400000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 400K - 500K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 400000 && guesthouse1.getHargaInt() < 500000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 500K - 600K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 500000 && guesthouse1.getHargaInt() < 600000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 600K - 700K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 600000 && guesthouse1.getHargaInt() < 700000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 700K - 800K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 700000 && guesthouse1.getHargaInt() < 800000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 800K - 900K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 900000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 800000 && guesthouse1.getHargaInt() < 900000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else {
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getHargaInt() > 900000 && guesthouse1.getKecamatan().equals(lokasi)) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            }
        } else if (jumlahKamar.equals("6 Room")){
            if (rentangHarga.equals("IDR 100K - 200K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 100000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 100000 && guesthouse1.getHargaInt() < 200000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 200K - 300K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 200000 && guesthouse1.getHargaInt() < 300000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 300K - 400K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 300000 && guesthouse1.getHargaInt() < 400000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 400K - 500K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 400000 && guesthouse1.getHargaInt() < 500000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 500K - 600K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 500000 && guesthouse1.getHargaInt() < 600000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 600K - 700K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 600000 && guesthouse1.getHargaInt() < 700000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 700K - 800K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 700000 && guesthouse1.getHargaInt() < 800000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 800K - 900K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 900000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 800000 && guesthouse1.getHargaInt() < 900000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else {
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getHargaInt() > 900000 && guesthouse1.getKecamatan().equals(lokasi)) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            }
        } else {
            if (rentangHarga.equals("IDR 100K - 200K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 100000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 100000 && guesthouse1.getHargaInt() < 200000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 200K - 300K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 200000 && guesthouse1.getHargaInt() < 300000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 300K - 400K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 300000 && guesthouse1.getHargaInt() < 400000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 400K - 500K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 400000 && guesthouse1.getHargaInt() < 500000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 500K - 600K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 500000 && guesthouse1.getHargaInt() < 600000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 600K - 700K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 600000 && guesthouse1.getHargaInt() < 700000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 700K - 800K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 700000 && guesthouse1.getHargaInt() < 800000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 800K - 900K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 900000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 800000 && guesthouse1.getHargaInt() < 900000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else {
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getHargaInt() > 900000 && guesthouse1.getKecamatan().equals(lokasi)) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            }
        }

        /*if (rentangHarga.equals("IDR 100K - 200K / Night")){
            for (Guesthouse guesthouse1 : guesthouse) {
                if (guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 100000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 100000 && guesthouse1.getHargaInt() < 200000) {
                    guesthouseArrayList.add(guesthouse1);
                }
            }
        } else if (rentangHarga.equals("IDR 200K - 300K / Night")){
            for (Guesthouse guesthouse1 : guesthouse) {
                if (guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 200000 && guesthouse1.getHargaInt() < 300000) {
                    guesthouseArrayList.add(guesthouse1);
                }
            }
        } else if (rentangHarga.equals("IDR 300K - 400K / Night")){
            for (Guesthouse guesthouse1 : guesthouse) {
                if (guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 300000 && guesthouse1.getHargaInt() < 400000) {
                    guesthouseArrayList.add(guesthouse1);
                }
            }
        } else if (rentangHarga.equals("IDR 400K - 500K / Night")){
            for (Guesthouse guesthouse1 : guesthouse) {
                if (guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 400000 && guesthouse1.getHargaInt() < 500000) {
                    guesthouseArrayList.add(guesthouse1);
                }
            }
        } else if (rentangHarga.equals("IDR 500K - 600K / Night")){
            for (Guesthouse guesthouse1 : guesthouse) {
                if (guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 500000 && guesthouse1.getHargaInt() < 600000) {
                    guesthouseArrayList.add(guesthouse1);
                }
            }
        } else if (rentangHarga.equals("IDR 600K - 700K / Night")){
            for (Guesthouse guesthouse1 : guesthouse) {
                if (guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 600000 && guesthouse1.getHargaInt() < 700000) {
                    guesthouseArrayList.add(guesthouse1);
                }
            }
        } else if (rentangHarga.equals("IDR 700K - 800K / Night")){
            for (Guesthouse guesthouse1 : guesthouse) {
                if (guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 700000 && guesthouse1.getHargaInt() < 800000) {
                    guesthouseArrayList.add(guesthouse1);
                }
            }
        } else if (rentangHarga.equals("IDR 800K - 900K / Night")){
            for (Guesthouse guesthouse1 : guesthouse) {
                if (guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 900000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 800000 && guesthouse1.getHargaInt() < 900000) {
                    guesthouseArrayList.add(guesthouse1);
                }
            }
        } else {
            for (Guesthouse guesthouse1 : guesthouse) {
                if (guesthouse1.getHargaInt() > 900000 && guesthouse1.getKecamatan().equals(lokasi)) {
                    guesthouseArrayList.add(guesthouse1);
                }
            }
        }*/

        /*guesthouseArrayList.add(new Guesthouse("Soca Garden Guesthouse", "3 room 3 toilet", "Sanggingan Street, Ubud, Bali", R.drawable.gh1, "500000", 500000));
        guesthouseArrayList.add(new Guesthouse("Kamala Ubud Guesthouse", "4 room 2 toilet", "Monkey Forest Street, Ubud, Bali", R.drawable.gh2, "600000", 600000));
        guesthouseArrayList.add(new Guesthouse("The Village Guest House", "5 room 3 toilet", "Kajeng Street, Ubud, Bali", R.drawable.gh3, "1000000", 1000000));
        guesthouseArrayList.add(new Guesthouse("Manggis Sari Guesthouse", "3 room 2 toilet", "Suweta Street, Ubud, Bali", R.drawable.gh4, "900000", 900000));
        guesthouseArrayList.add(new Guesthouse("Nyoman Sandi Guesthouse", "4 room 3 toilet", "Hanoman Street, Ubud, Bali", R.drawable.gh5, "200000", 200000));
        guesthouseArrayList.add(new Guesthouse("Loka Sari Guest House", "4 room 2 toilet", "Kuwera Street, Ubud, Bali", R.drawable.gh6, "300000", 300000));
        guesthouseArrayList.add(new Guesthouse("Kudos Guesthouse Ubud", "3 room 3 toilet", "Arjuna Street, Ubud, Bali", R.drawable.gh7, "400000", 400000));
        guesthouseArrayList.add(new Guesthouse("Sandat Bali Ubud Guesthouse", "2 room 2 toilet", "Sambahan Street, Ubud, Bali", R.drawable.gh8, "500000", 500000));
        guesthouseArrayList.add(new Guesthouse("Putu's Paradise Guesthouse", "3 room 3 toilet", "Gotama Street, Ubud, Bali", R.drawable.gh9, "250000", 250000));
        guesthouseArrayList.add(new Guesthouse("Teba Homestay", "4 room 2 toilet", "Pengosekan, Ubud, Bali", R.drawable.gh10, "300000", 300000));
        guesthouseArrayList.add(new Guesthouse("Cito Guesthouse", "2 room 2 toilet", "Nyuh Kuning Street, Ubud, Bali", R.drawable.gh11, "700000", 700000));
        guesthouseArrayList.add(new Guesthouse("Sunari Guesthouse Ubud", "8 room 4 toilet", "Sanggingan Street, Ubud, Bali", R.drawable.gh12, "400000", 400000));
        guesthouseArrayList.add(new Guesthouse("Ujung Ubud Guest House", "3 room 3 toilet", "Sriwedari Street, Ubud, Bali", R.drawable.gh13, "300000", 300000));
        */
    }


}
