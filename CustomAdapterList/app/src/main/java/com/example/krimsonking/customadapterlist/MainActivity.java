package com.example.krimsonking.customadapterlist;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView socialMediaList;

    String[] nameSocial;
    String[] aboutSocial;
    int[] flagSocial = { R.drawable.im1,
            R.drawable.im2,
            R.drawable.im3,
            R.drawable.im4,
            R.drawable.im5,
            R.drawable.im6,
            R.drawable.im7,
            R.drawable.im8,
            R.drawable.im9,
            R.drawable.im10,
            R.drawable.im11, };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources sourceData = getResources();
        nameSocial = sourceData.getStringArray(R.array.socialMedia);
        aboutSocial = sourceData.getStringArray(R.array.about);

        socialMediaList = (ListView) findViewById(R.id.social_media_listView);

        AdapterList adapterList = new AdapterList(this, nameSocial, aboutSocial, flagSocial);
        socialMediaList.setAdapter(adapterList);

    }
}
