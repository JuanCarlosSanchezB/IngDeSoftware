package com.example.ejemplonavigation;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.ArrayList;

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
        places.add(place1);

        // Si Subway usa la misma imagen, puedes reutilizar 'bitmap'
        Place place2 = new Place("Subway", bitmapsubway);
        places.add(place2);
    }
}
