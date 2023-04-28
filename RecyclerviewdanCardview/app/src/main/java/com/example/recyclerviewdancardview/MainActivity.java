package com.example.recyclerviewdancardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ClubAdapter clubAdapter;
    private ArrayList<ClubModel> clubModel;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        clubAdapter = new ClubAdapter(clubModel);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(clubAdapter);
    }

    private void getData() {
        clubModel = new ArrayList<>();
        clubModel.add(new ClubModel("Real Madrid", R.drawable.realmadrid));
        clubModel.add(new ClubModel("Barcelona", R.drawable.barcelona));
        clubModel.add(new ClubModel("Borusia Dortmund", R.drawable.borussiadortmund));
        clubModel.add(new ClubModel("Juventus", R.drawable.juventus));
        clubModel.add(new ClubModel("Chelsea", R.drawable.chelsea));
        clubModel.add(new ClubModel("Munchen", R.drawable.munchen));
        clubModel.add(new ClubModel("Manchester United", R.drawable.manchesterunited));
        clubModel.add(new ClubModel("PSG", R.drawable.psg));
        clubModel.add(new ClubModel("Liverpol", R.drawable.liverpol));
    }
}