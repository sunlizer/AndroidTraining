package com.example.krimsonking.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        AdapterWidgets adapterWidgets = new AdapterWidgets(this, Widgets.getData());
        recyclerView.setAdapter(adapterWidgets);

        LinearLayoutManager ln = new LinearLayoutManager(this);
        ln.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(ln);


    }
}
