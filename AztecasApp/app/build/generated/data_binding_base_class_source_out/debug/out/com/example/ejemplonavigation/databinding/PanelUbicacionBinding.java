// Generated by view binder compiler. Do not edit!
package com.example.ejemplonavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.ejemplonavigation.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class PanelUbicacionBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout panelUbicacion;

  private PanelUbicacionBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout panelUbicacion) {
    this.rootView = rootView;
    this.panelUbicacion = panelUbicacion;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PanelUbicacionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PanelUbicacionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.panel_ubicacion, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PanelUbicacionBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    LinearLayout panelUbicacion = (LinearLayout) rootView;

    return new PanelUbicacionBinding((LinearLayout) rootView, panelUbicacion);
  }
}