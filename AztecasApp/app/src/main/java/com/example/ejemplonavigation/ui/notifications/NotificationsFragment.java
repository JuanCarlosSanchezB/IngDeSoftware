package com.example.ejemplonavigation.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.ejemplonavigation.PaymentActivity;
import com.example.ejemplonavigation.R;
import com.example.ejemplonavigation.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;

    private LinearLayout container; // El contenedor donde agregarás el layout XML

    Button payment;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Obtener la ActionBar
        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (actionBar != null) {
            // Ocultar la ActionBar
            actionBar.hide();
        }

        // Obtén el contenedor del layout
        container = root.findViewById(R.id.layoutPrincipal); // Suponiendo que el contenedor tiene el id "text_container"

        // Infla el layout XML "user.xml"
        View userView = inflater.inflate(R.layout.user, container, false);

        payment = userView.findViewById(R.id.payment);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getActivity() != null) {
                    Intent intent = new Intent(getActivity(), PaymentActivity.class);
                    startActivity(intent);
                }
            }
        });


        // Agrega el layout inflado al contenedor
        container.addView(userView);


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
