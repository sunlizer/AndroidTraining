package com.example.krimsonking.recycleview;

import java.util.ArrayList;

/**
 * Created by KrimsonKing on 8.06.2017.
 */

public class Widgets {

    private int imageId;
    private String header;
    private String info;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public static ArrayList<Widgets> getData(){
        ArrayList<Widgets> dataList = new  ArrayList<Widgets>();

        int[] pictures = {R.drawable.i11,R.drawable.i110,R.drawable.i111,R.drawable.i12,R.drawable.i13,
                R.drawable.i14,R.drawable.i15,R.drawable.i16,R.drawable.i17,R.drawable.i18,
                R.drawable.i19,R.drawable.i12,R.drawable.i120,R.drawable.i121,R.drawable.i122,
                R.drawable.i123,R.drawable.i124,R.drawable.i125,R.drawable.i126,R.drawable.i127,
                R.drawable.i128,R.drawable.i129,R.drawable.i13,R.drawable.i130,R.drawable.i131,
                R.drawable.i132,R.drawable.i133,R.drawable.i134,R.drawable.i135,R.drawable.i136,
                R.drawable.i137,R.drawable.i138,R.drawable.i139,R.drawable.i14,R.drawable.i140,
                R.drawable.i15,R.drawable.i16,R.drawable.i17,R.drawable.i18,R.drawable.i19};

        for (int i=0; i<pictures.length;i++){
            Widgets temp = new Widgets();
            temp.setImageId(pictures[i]);
            temp.setHeader("Header " + i);
            temp.setInfo("Info " + i);

            dataList.add(temp);
        }

        return dataList;
    }

}
