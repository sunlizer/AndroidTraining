package com.example.krimsonking.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by KrimsonKing on 8.06.2017.
 */

public class AdapterWidgets extends RecyclerView.Adapter<AdapterWidgets.MyViewHolder>{
    ArrayList<Widgets> mDatalist = new ArrayList<Widgets>();
    LayoutInflater inflater ;

    public AdapterWidgets(Context context, ArrayList<Widgets> data) {
        inflater = LayoutInflater.from(context);
        this.mDatalist = data;
    }

    /*
    * Ekranda görünen elemanlar için inflater işlemleri yapılacak.
    * Bu işlem maliyetli olacağından tekrar kullanılmayacak.
    */
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.list_item, parent, false);
        MyViewHolder holder = new MyViewHolder(v);

        return holder;
    }

    // Holderlarımızın içlerinin doldurulduğu yer
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Widgets clickPictures = mDatalist.get(position);
        holder.setData(clickPictures, position);


    }

    @Override
    public int getItemCount() {
        return mDatalist.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView mPicture, mDelete, mCoppy;
        TextView mHeader, mInfo;
        int clickPosition = 0;

        public MyViewHolder(View itemView) {
            super(itemView);
            mHeader = (TextView) itemView.findViewById(R.id.header);
            mInfo = (TextView) itemView.findViewById(R.id.info);
            mPicture = (ImageView) itemView.findViewById(R.id.pictures);
            mCoppy = (ImageView) itemView.findViewById(R.id.add);
            mDelete = (ImageView) itemView.findViewById(R.id.delete);

        }

        public void setData(Widgets clickPictures, int position){
            this.mHeader.setText(clickPictures.getHeader());
            this.mInfo.setText(clickPictures.getInfo());
            this.mPicture.setImageResource(clickPictures.getImageId());
            this.clickPosition = position;

        }

    }


}
