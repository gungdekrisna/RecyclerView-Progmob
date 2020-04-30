package com.example.recyclerviewnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

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
                startActivity(intent);
            }
        };
    }

    private void addData() {
        guesthouseArrayList = new ArrayList<>();
        guesthouseArrayList.add(new Guesthouse("Soca Garden Guesthouse", "3 room 3 toilet", "Sanggingan Street, Ubud, Bali", R.drawable.gh1, "500000"));
        /*guesthouseArrayList.add(new Guesthouse("Kamala Ubud Guesthouse", "4 room 2 toilet", "Monkey Forest Street, Ubud, Bali", R.drawable.gh2, 600000));
        guesthouseArrayList.add(new Guesthouse("The Village Guest House", "5 room 3 toilet", "Kajeng Street, Ubud, Bali", R.drawable.gh3, 1000000));
        guesthouseArrayList.add(new Guesthouse("Manggis Sari Guesthouse", "3 room 2 toilet", "Suweta Street, Ubud, Bali", R.drawable.gh4, 900000));
        guesthouseArrayList.add(new Guesthouse("Nyoman Sandi Guesthouse", "4 room 3 toilet", "Hanoman Street, Ubud, Bali", R.drawable.gh5, 200000));
        guesthouseArrayList.add(new Guesthouse("Loka Sari Guest House", "4 room 2 toilet", "Kuwera Street, Ubud, Bali", R.drawable.gh6, 300000));
        guesthouseArrayList.add(new Guesthouse("Kudos Guesthouse Ubud", "3 room 3 toilet", "Arjuna Street, Ubud, Bali", R.drawable.gh7, 400000));
        guesthouseArrayList.add(new Guesthouse("Sandat Bali Ubud Guesthouse", "2 room 2 toilet", "Sambahan Street, Ubud, Bali", R.drawable.gh8, 500000));
        guesthouseArrayList.add(new Guesthouse("Putu's Paradise Guesthouse", "3 room 3 toilet", "Gotama Street, Ubud, Bali", R.drawable.gh9, 250000));
        guesthouseArrayList.add(new Guesthouse("Teba Homestay", "4 room 2 toilet", "Pengosekan, Ubud, Bali", R.drawable.gh10, 300000));
        guesthouseArrayList.add(new Guesthouse("Cito Guesthouse", "2 room 2 toilet", "Nyuh Kuning Street, Ubud, Bali", R.drawable.gh11, 700000));
        guesthouseArrayList.add(new Guesthouse("Sunari Guesthouse Ubud", "8 room 4 toilet", "Sanggingan Street, Ubud, Bali", R.drawable.gh12, 400000));
        guesthouseArrayList.add(new Guesthouse("Ujung Ubud Guest House", "3 room 3 toilet", "Sriwedari Street, Ubud, Bali", R.drawable.gh13, 300000));*/
    }


}
