package com.example.aztecas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class AfterLogin extends AppCompatActivity {

    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.main_panel);


        // Obtener datos del Intent
        Intent intent = getIntent();
        if (intent != null) {
            //String message = intent.getStringExtra("clave");

        }
    }
}
