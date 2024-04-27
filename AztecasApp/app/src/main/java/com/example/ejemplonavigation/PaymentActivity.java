package com.example.ejemplonavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_forms);
    }

    public void goBack(View view) {
        // Crear un Intent para abrir la nueva actividad
        Intent intent = new Intent(this, AfterLogin.class);

        // Iniciar la nueva actividad
        startActivity(intent);
    }
}
