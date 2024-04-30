package com.example.ejemplonavigation.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ejemplonavigation.R;
import com.example.ejemplonavigation.databinding.FragmentDashboardBinding;
import com.example.ejemplonavigation.databinding.FragmentHomeBinding;
import com.example.ejemplonavigation.ui.home.HomeViewModel;

public class DashboardFragment extends Fragment {

    private FragmentHomeBinding binding;
    private LinearLayout container; // El contenedor donde agregarás los TextView

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Obtén el contenedor del layout
        container = root.findViewById(R.id.layoutPrincipal); // Suponiendo que el contenedor tiene el id "text_container"

        // Itera para agregar TextView
        for (int i = 0; i < 3; i++) { // Por ejemplo, agregaremos 5 TextView
            TextView textView = new TextView(requireContext());
            textView.setText("TextView " + i);
            container.addView(textView); // Agrega el TextView al contenedor
        }

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}