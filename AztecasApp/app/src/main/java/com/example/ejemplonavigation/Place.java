package com.example.ejemplonavigation;

import android.graphics.Bitmap;

public class Place {
    private String name;
    private Bitmap image;

    public Place(String name, Bitmap image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public Bitmap getImage() {
        return image;
    }
}
