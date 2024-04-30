package com.example.ejemplonavigation;

import android.graphics.Bitmap;

public class Place {
    private String name;
    private Bitmap image;
    private Menu menu;
    private int duration;

    public Place(String name, Bitmap image)
    {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public Bitmap getImage() {
        return image;
    }
    public void setDuration(int duration)
    {
        this.duration = duration;
    }
    public int getDuration()
    {
        return this.duration;
    }
    public void setMenu(Menu menu)
    {
        this.menu = menu;
    }
    public Menu getMenu()
    {
        return this.menu;
    }
}
