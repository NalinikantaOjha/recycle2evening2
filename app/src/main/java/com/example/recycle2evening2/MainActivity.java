package com.example.recycle2evening2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements itemclicklistner{
    private RecyclerView recyclerView;
    private ArrayList<view>arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildData();
        setRecycleview();
    }

    private void setRecycleview() {
        Adapter view =new Adapter(arrayList,this);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(view);
    }

    private void buildData() {
        for (int i = 0; i < 50; i++) {
            arrayList.add(new view("Business", "64", "Microsoft", R.drawable.billgatesnow));
            arrayList.add(new view("Business", "56", "Amazon", R.drawable.feffbezosnow));
            arrayList.add(new view("Business", "31", "Masai School", R.drawable.prateeksuklanow));
        }
    }
    private void initView() {
        recyclerView=findViewById(R.id.recycleview);
    }

    @Override
    public void onitemckicked(view view) {
        new AlertDialog.Builder(this).setTitle("HEY THIS IS THE DATA")
                .setMessage(view.getCompny()+"\n"
                        +view.getAge()+"\n"
                        +view.getProffesion()).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        })
                .show();

    }
}