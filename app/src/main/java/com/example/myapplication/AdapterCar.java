package com.example.myapplication;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterCar extends RecyclerView.Adapter<CarViewHolder> {
    ArrayList<Car> arrayListName;
    OnItemClick onItemClick;

    public AdapterCar(ArrayList<Car> arrayListName, OnItemClick onItemClick) {
        this.arrayListName = arrayListName;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.onBind(arrayListName.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClick.onClick(arrayListName.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListName.size();
    }
}

class CarViewHolder extends RecyclerView.ViewHolder {
    ImageView imageViewCar;
    TextView name;
    TextView desk;


    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.txt_name);
        desk = itemView.findViewById(R.id.txt_name2);
        imageViewCar = itemView.findViewById(R.id.car_image);
    }

    void onBind(Car car) {
        name.setText(car.getName());
        imageViewCar.setImageResource(car.getImage());
        desk.setText(car.getDesk());
    }
};

