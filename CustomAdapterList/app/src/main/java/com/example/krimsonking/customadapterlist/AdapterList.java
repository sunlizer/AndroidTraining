package com.example.krimsonking.customadapterlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by KrimsonKing on 7.06.2017.
 */
public class AdapterList extends ArrayAdapter<String> {
    Context context;
    String[] nameSocial;
    String[] aboutSocial;
    int[] flagSocial;
    public AdapterList(Context context, String[] nameSocial, String[] aboutSocial, int[] flagSocial) {
        super(context,R.layout.one_row_layout, R.id.textView, nameSocial);
        this.context = context;
        this.nameSocial = nameSocial;
        this.aboutSocial = aboutSocial;
        this.flagSocial = flagSocial;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View viewRow = inflater.inflate(R.layout.one_row_layout, parent, false);
        ImageView im_single_row = (ImageView) viewRow.findViewById(R.id.imageView);
        TextView nameSocial_single_row = (TextView) viewRow.findViewById(R.id.textView);
        TextView aboutSocial_single_row = (TextView) viewRow.findViewById(R.id.textView3);

        im_single_row.setImageResource(flagSocial[position]);
        nameSocial_single_row.setText(nameSocial[position]);
        aboutSocial_single_row.setText(aboutSocial[position]);

        return viewRow;
    }
}
