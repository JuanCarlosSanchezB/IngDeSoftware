package com.example.ejemplonavigation;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Places {
    public ArrayList<Place> places;

    public Places(Context context){
        places = new ArrayList<>();

        // Carga una imagen de los recursos
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.fasfru);
        // Carga una imagen de los recursos
        Bitmap bitmapsubway = BitmapFactory.decodeResource(context.getResources(), R.drawable.subway);

        // Crea objetos Place
        Place place1 = new Place("Fast Fruit", bitmap);
        place1.setDuration(10);
        ArrayList<String> menuList1 = new ArrayList<>();
        menuList1.add("Chapatas");
        menuList1.add("Smoothies");
        menuList1.add("Ensaladas");
        ArrayList<ArrayList<String>> submenuList1 = new ArrayList<ArrayList<String>>();
        submenuList1.add(new ArrayList<>(Arrays.asList("chapata 1", "chapata 2", "chapata 3")));
        submenuList1.add(new ArrayList<>(Arrays.asList("smoothie 1", "smoothie 2", "smoothie 3")));
        submenuList1.add(new ArrayList<>(Arrays.asList("ensaladas 1", "ensaladas 2", "ensaladas 3")));
        place1.setMenu(new Menu(menuList1, submenuList1));
        places.add(place1);

        // Si Subway usa la misma imagen, puedes reutilizar 'bitmap'
        Place place2 = new Place("Subway", bitmapsubway);
        place2.setDuration(17);
        ArrayList<String> menuList2 = new ArrayList<>();
        menuList2.add("Subways");
        ArrayList<ArrayList<String>> submenuList2 = new ArrayList<ArrayList<String>>();
        submenuList2.add(new ArrayList<>(Arrays.asList("Subway Italiano", "Subway Albondigas", "Subway jamon")));
        place2.setMenu(new Menu(menuList2, submenuList2));
        places.add(place2);
    }
}
