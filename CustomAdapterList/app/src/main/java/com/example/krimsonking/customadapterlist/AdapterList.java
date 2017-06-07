package com.example.krimsonking.customadapterlist;

import android.content.Context;
import android.media.Image;
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

    class ViewYerTutucu{
        ImageView resim;
        TextView isim;
        TextView tanim;

        ViewYerTutucu(View v){
            resim = (ImageView) v.findViewById(R.id.imageView);
            isim = (TextView) v.findViewById(R.id.textView);
            tanim = (TextView) v.findViewById(R.id.textView3);

        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View single_row = convertView;
        ViewYerTutucu tutucu;

        if(single_row == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            single_row = inflater.inflate(R.layout.one_row_layout, parent, false);
            tutucu = new ViewYerTutucu(single_row);
            single_row.setTag(tutucu);
        }
        else{
            tutucu = (ViewYerTutucu) single_row.getTag();
        }


        tutucu.isim.setText(nameSocial[position]);
        tutucu.tanim.setText(aboutSocial[position]);
        tutucu.resim.setImageResource(flagSocial[position]);

        /*LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View viewRow = inflater.inflate(R.layout.one_row_layout, parent, false);
        ImageView im_single_row = (ImageView) viewRow.findViewById(R.id.imageView);
        TextView nameSocial_single_row = (TextView) viewRow.findViewById(R.id.textView);
        TextView aboutSocial_single_row = (TextView) viewRow.findViewById(R.id.textView3);*/

        /*im_single_row.setImageResource(flagSocial[position]);
        nameSocial_single_row.setText(nameSocial[position]);
        aboutSocial_single_row.setText(aboutSocial[position]);*/

        return single_row;
    }
}
