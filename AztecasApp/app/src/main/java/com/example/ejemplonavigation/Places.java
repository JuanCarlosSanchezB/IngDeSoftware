package com.example.ejemplonavigation;

import java.util.ArrayList;
import java.util.List;

public class Places {
    public ArrayList<Place> places;
    public Places(){
        places = new ArrayList<>();
        places.add(new Place("Fast Fruit"));
        places.add(new Place("Subway"));

    }
}
