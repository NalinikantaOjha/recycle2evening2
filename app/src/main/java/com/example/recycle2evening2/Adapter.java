package com.example.recycle2evening2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<viewHolder> {
    private itemclicklistner itemclicklistner;

    private ArrayList<view>arrayList=new ArrayList<>();
    public Adapter(ArrayList<view>arrayList, itemclicklistner itemclicklistner){
        this.arrayList=arrayList;
        this.itemclicklistner=itemclicklistner;
    }
    @NonNull

    @Override
    public viewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new  viewHolder(view,itemclicklistner);
    }

    @Override
    public void onBindViewHolder(@NonNull  viewHolder holder, int position) {
        view view=arrayList.get(position);
        holder.setdata(view);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
