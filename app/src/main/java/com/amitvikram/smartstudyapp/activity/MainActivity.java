package com.amitvikram.smartstudyapp.activity;

import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amitvikram.smartstudyapp.R;
import com.amitvikram.smartstudyapp.adapter.CardAdapter;
import com.amitvikram.smartstudyapp.model.Planet;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private CardAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        initView();
    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CardAdapter();
        recyclerView.setAdapter(adapter);

       // recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        createListData();
    }

    private void createListData() {
        List<Planet> planets = new ArrayList<>();
        planets.add(new Planet(
            "Earth",
            150,
            10,
            12750,
                1
        ));
        planets.add(new Planet(
            "Jupiter",
            778,
            26,
            143000,
                2
        ));
        planets.add(new Planet(
            "Mars",
            228,
            4,
            6800,
                3
        ));
        planets.add(new Planet(
            "Pluto",
            5900,
            1,
            2320,
                4
        ));
        planets.add(new Planet(
            "Venus",
            108,
            9,
            12750,
                5
        ));
        planets.add(new Planet(
            "Saturn",
            1429,
            11,
            120000,
                6
        ));
        planets.add(new Planet(
            "Mercury",
            58,
            4,
            4900,
                7
        ));
        planets.add(new Planet(
            "Neptune",
            4500,
            12,
            50500,
                8
        ));
        planets.add(new Planet(
            "Uranus",
            2870,
            9,
            52400,
                9
        ));
        
        adapter.updateData(planets, getApplicationContext());
    }
}
