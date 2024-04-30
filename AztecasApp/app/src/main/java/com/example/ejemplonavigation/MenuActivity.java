package com.example.ejemplonavigation;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ejemplonavigation.ui.home.HomeFragment;

import java.util.zip.Inflater;

public class MenuActivity extends AppCompatActivity {
    LinearLayout layoutPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        layoutPrincipal = findViewById(R.id.layoutPrincipal);
        LinearLayout linearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, // width
                LinearLayout.LayoutParams.WRAP_CONTENT  // height
        );
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        LayoutInflater inflater = LayoutInflater.from(this);
        View userView = inflater.inflate(R.layout.panel_place, layoutPrincipal, false);
        Intent intent = getIntent();
        int panel = intent.getIntExtra("PANEL", 0);
        LinearLayout layoutPanel = userView.findViewById(R.id.panelPlace);
        ImageButton imageButton = userView.findViewById(R.id.imagePanel);
        imageButton.setImageBitmap(HomeFragment.places.places.get(panel).getImage());
        Button button = userView.findViewById(R.id.textPanel);
        button.setText(HomeFragment.places.places.get(panel).getName());
        TextView textView = userView.findViewById(R.id.placeDuration);
        textView.setText(HomeFragment.places.places.get(panel).getDuration()+" min");
        layoutPrincipal.addView(layoutPanel);

        for (int i = 0; i < HomeFragment.places.places.get(panel).getMenu().menuList.size(); i++)
        {
            TextView temp = new TextView(this);
            temp.setText(HomeFragment.places.places.get(panel).getMenu().menuList.get(i));  // Usa 'temp', no 'textView'
            temp.setTextSize(25); // Aumenté el tamaño para que sea más legible
            temp.setTextColor(getResources().getColor(android.R.color.black)); // Configurar el color del texto
            layoutPrincipal.addView(temp);
            for(int j = 0; j < HomeFragment.places.places.get(panel).getMenu().subMenuList.size();j++)
            {
                Button buttonJ = new Button(this);
                buttonJ.setText(HomeFragment.places.places.get(panel).getMenu().subMenuList.get(i).get(j));
                // Establece el color de fondo del botón
                buttonJ.setBackgroundColor(Color.parseColor("#49A078"));

                layoutPrincipal.addView(buttonJ);
            }

        }
    }

    public void goBack(View view) {
        finish();
    }
}