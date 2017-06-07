package com.example.krimsonking.ericssonemployees;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView liste;
    String[] employee = {"Kürşat", "Yasin", "Murat", "Olgun", "Arman", "Caner", "Dursun Ali", "Oğuzhan",
                        "Kürşat", "Yasin", "Murat", "Olgun", "Arman", "Caner", "Dursun Ali", "Oğuzhan",
                        "Kürşat", "Yasin", "Murat", "Olgun", "Arman", "Caner", "Dursun Ali", "Oğuzhan",
                        "Kürşat", "Yasin", "Murat", "Olgun", "Arman", "Caner", "Dursun Ali", "Oğuzhan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liste = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.one_view, R.id.textview,employee);
        liste.setAdapter(adapter);
    }
}
