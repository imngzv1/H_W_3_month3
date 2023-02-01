package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetaillActivity extends AppCompatActivity {
    ImageView imageViewCar;
    TextView name;
    TextView desk;

    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaill);
        imageViewCar=findViewById(R.id.image);
        name=findViewById(R.id.text_1);
        desk=findViewById(R.id.text_2);
        getExtra();
    }
    private void getExtra() {
       car = (Car) getIntent().getSerializableExtra("car");

       name.setText(car.getName());
       desk.setText(car.getDesk());
       imageViewCar.setImageResource(car.getImage());
    }

}