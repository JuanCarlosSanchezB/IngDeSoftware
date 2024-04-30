package com.example.ejemplonavigation.ui.home;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ejemplonavigation.AfterLogin;
import com.example.ejemplonavigation.Places;
import com.example.ejemplonavigation.R;
import com.example.ejemplonavigation.databinding.FragmentHomeBinding;
import com.example.ejemplonavigation.databinding.FragmentNotificationsBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    Places places;
    private LinearLayout container; // El contenedor donde agregarás los TextView

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

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

        // Infla el layout XML "user.xml"
        View userView = inflater.inflate(R.layout.panel_ubicacion, container, false);

        container.addView(userView);

        places = new Places(getContext());

        for(int i = 0; i < places.places.size();i++){
            // Infla el layout XML "user.xml"
            View temp = inflater.inflate(R.layout.panel_place, container, false);
            ImageButton imageButton = temp.findViewById(R.id.imagePanel);
            imageButton.setImageBitmap(places.places.get(i).getImage());
            Button button = temp.findViewById(R.id.textPanel);
            button.setText(places.places.get(i).getName());
            container.addView(temp);
        }

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}