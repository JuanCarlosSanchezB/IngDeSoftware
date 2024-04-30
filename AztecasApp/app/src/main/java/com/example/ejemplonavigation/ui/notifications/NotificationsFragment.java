package com.example.ejemplonavigation.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.ejemplonavigation.R;
import com.example.ejemplonavigation.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;

    private LinearLayout container; // El contenedor donde agregarás el layout XML

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Obtén el contenedor del layout
        container = root.findViewById(R.id.layoutPrincipal); // Suponiendo que el contenedor tiene el id "text_container"

        // Infla el layout XML "user.xml"
        View userView = inflater.inflate(R.layout.user, container, false);

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
