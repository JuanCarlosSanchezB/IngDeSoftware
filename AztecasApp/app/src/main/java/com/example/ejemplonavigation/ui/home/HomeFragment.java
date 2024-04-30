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
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ejemplonavigation.AfterLogin;
import com.example.ejemplonavigation.Places;
import com.example.ejemplonavigation.R;
import com.example.ejemplonavigation.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private LinearLayout container; // El contenedor donde agregarás los TextView

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.setPadding(25, 100, 0, 0);

        ImageButton imageButton1 = new ImageButton(requireContext());
        imageButton1.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        imageButton1.setBackground(ContextCompat.getDrawable(requireContext(), android.R.color.transparent));
        imageButton1.setImageResource(R.drawable.iconubi);
        LinearLayout.LayoutParams params1 = (LinearLayout.LayoutParams) imageButton1.getLayoutParams();
        params1.setMarginEnd(20);
        imageButton1.setLayoutParams(params1);

        TextView textView = new TextView(requireContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.black));
        textView.setTextSize(16);
        textView.setPadding(0, 20, 0, 0);
        textView.setText("Universidad de las Americas Puebla");

        ImageButton imageButton2 = new ImageButton(requireContext());
        imageButton2.setId(View.generateViewId());
        imageButton2.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));
        imageButton2.setBackground(ContextCompat.getDrawable(requireContext(), android.R.color.transparent));
        imageButton2.setImageResource(R.drawable.botoncarrito);
        LinearLayout.LayoutParams params2 = (LinearLayout.LayoutParams) imageButton2.getLayoutParams();
        params2.setMarginStart(25);
        imageButton2.setLayoutParams(params2);

        linearLayout.addView(imageButton1);
        linearLayout.addView(textView);
        linearLayout.addView(imageButton2);


        container = root.findViewById(R.id.layoutPrincipal);

        container.addView(linearLayout);

        for (int i = 0; i < AfterLogin.places.size(); i++) {
            Button button = new Button(requireContext());
            button.setTextSize(40);
            button.setGravity(Gravity.CENTER);
            button.setText(AfterLogin.places.get(i).getName());
            container.addView(button);
        }

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}