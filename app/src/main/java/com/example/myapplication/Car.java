package com.example.myapplication;

import java.io.Serializable;

public class Car implements Serializable {
    public String name;
    public String desk;
    public int image;

    public Car(String name, String desk, int image) {
        this.name = name;
        this.desk = desk;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesk() {
        return desk;
    }

    public void setDesk(String desk) {
        this.desk = desk;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
