package com.example.ejemplonavigation.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
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
        // Obtener la ActionBar
        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (actionBar != null) {
            // Ocultar la ActionBar
            actionBar.hide();
        }

        // Obtén el contenedor del layout
        container = root.findViewById(R.id.layoutPrincipal); // Suponiendo que el contenedor tiene el id "text_container"


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}