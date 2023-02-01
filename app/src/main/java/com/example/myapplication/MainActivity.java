package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterCar adapterCar;
    ArrayList<Car> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycleview);
        fillOurList();
        initRecycler();
    }

    private void initRecycler() {
        adapterCar= new AdapterCar(arrayList);
        recyclerView.setAdapter(adapterCar);
    }

    private void fillOurList() {
        arrayList=new ArrayList<>();
        arrayList.add(new Car("BMW","Year:2022",R.drawable.bmw));
        arrayList.add(new Car("Mercedes AMG","Year2019",R.drawable.amg));
        arrayList.add(new Car("KIA","Year:2022",R.drawable.kia));
        arrayList.add(new Car("Mercedes S class","Year:2020",R.drawable.mercedes));
        arrayList.add(new Car("Rolls Royce","Year:2021",R.drawable.rolls));
        arrayList.add(new Car("Lamborghini","Year:2021",R.drawable.lambo));
        arrayList.add(new Car("Jiguli","Year:1999",R.drawable.jiga));
        arrayList.add(new Car("Bicycle","Year:2020",R.drawable.velic));
        arrayList.add(new Car("Kamaz","Year:2015",R.drawable.kamaz));
        arrayList.add(new Car("Fire Engine","Year:2015",R.drawable.pojar));

    }



}