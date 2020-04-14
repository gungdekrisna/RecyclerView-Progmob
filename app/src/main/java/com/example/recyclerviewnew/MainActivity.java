package com.example.recyclerviewnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private GuesthouseAdapter adapter;
    private ArrayList<Guesthouse> guesthouseArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new GuesthouseAdapter(guesthouseArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        guesthouseArrayList = new ArrayList<>();
        guesthouseArrayList.add(new Guesthouse("Soca Garden Guesthouse", "3 room 3 toilet", "Sanggingan Street, Ubud, Bali", R.drawable.gh1));
        guesthouseArrayList.add(new Guesthouse("Kamala Ubud Guesthouse", "4 room 2 toilet", "Monkey Forest Street, Ubud, Bali", R.drawable.gh2));
        guesthouseArrayList.add(new Guesthouse("The Village Guest House", "5 room 3 toilet", "Kajeng Street, Ubud, Bali", R.drawable.gh3));
        guesthouseArrayList.add(new Guesthouse("Manggis Sari Guesthouse", "3 room 2 toilet", "Suweta Street, Ubud, Bali", R.drawable.gh4));
        guesthouseArrayList.add(new Guesthouse("Nyoman Sandi Guesthouse", "4 room 3 toilet", "Hanoman Street, Ubud, Bali", R.drawable.gh5));
        guesthouseArrayList.add(new Guesthouse("Loka Sari Guest House", "4 room 2 toilet", "Kuwera Street, Ubud, Bali", R.drawable.gh6));
        guesthouseArrayList.add(new Guesthouse("Kudos Guesthouse Ubud", "3 room 3 toilet", "Arjuna Street, Ubud, Bali", R.drawable.gh7));
        guesthouseArrayList.add(new Guesthouse("Sandat Bali Ubud Guesthouse", "2 room 2 toilet", "Sambahan Street, Ubud, Bali", R.drawable.gh8));
        guesthouseArrayList.add(new Guesthouse("Putu's Paradise Guesthouse", "3 room 3 toilet", "Gotama Street, Ubud, Bali", R.drawable.gh9));
        guesthouseArrayList.add(new Guesthouse("Teba Homestay", "4 room 2 toilet", "Pengosekan, Ubud, Bali", R.drawable.gh10));
        guesthouseArrayList.add(new Guesthouse("Cito Guesthouse", "2 room 2 toilet", "Nyuh Kuning Street, Ubud, Bali", R.drawable.gh11));
        guesthouseArrayList.add(new Guesthouse("Sunari Guesthouse Ubud", "8 room 4 toilet", "Sanggingan Street, Ubud, Bali", R.drawable.gh12));
        guesthouseArrayList.add(new Guesthouse("Ujung Ubud Guest House", "3 room 3 toilet", "Sriwedari Street, Ubud, Bali", R.drawable.gh13));
    }
}
