package com.example.krimsonking.ericssonemployeelist;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout ll;
    RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater lif = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = lif.inflate(R.layout.sub_layout, null);

       // ll = (LinearLayout) findViewById(R.id.my_linear_layout);
       // ll.addView(v);

        rl = (RelativeLayout) findViewById(R.id.activity_main);
        rl.addView(v);


    }
}
