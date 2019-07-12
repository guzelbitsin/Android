package com.example.myapplication.Adapter;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.Model.Yemek;
import com.example.myapplication.R;

import java.util.ArrayList;

public class YemekAdapter extends BaseAdapter {
    Context context;
    ArrayList<Yemek> yemekler;
    LayoutInflater layoutInflater;

    public YemekAdapter() {
    }

    @SuppressLint("ServiceCast")
    public YemekAdapter(Context context, ArrayList<Yemek> yemekler, LayoutInflater layoutInflater) {
        this.context = context;
        this.yemekler = yemekler;
        this.layoutInflater = (LayoutInflater)context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return yemekler.size();
    }

    @Override
    public Yemek getItem(int i) {
        return yemekler.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = layoutInflater.inflate(R.layout.myrecipesactivity,null);

        ImageView yemekResim = (ImageView)view.findViewById(R.id.imageView);
        TextView baslik = (TextView)view.findViewById(R.id.tvBaslik);
        TextView desc = (TextView)view.findViewById(R.id.tvDescription);

        baslik.setText(yemekler.get(i).getYemekAdi());
        desc.setText(yemekler.get(i).getYemekAciklama());
        return  view1;
    }
}
