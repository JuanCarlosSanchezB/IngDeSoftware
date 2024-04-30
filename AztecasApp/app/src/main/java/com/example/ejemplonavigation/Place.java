package com.example.ejemplonavigation;

import android.media.Image;

public class Place {
    private String name;
    private Image image;
    public Place(String name)
    {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
