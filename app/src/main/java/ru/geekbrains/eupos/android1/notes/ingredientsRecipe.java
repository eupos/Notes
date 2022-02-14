package ru.geekbrains.eupos.android1.notes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ingredientsRecipe extends Fragment {


    public static ingredientsRecipe newInstance() {
        ingredientsRecipe fragment = new ingredientsRecipe();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ingredients_recipe, container, false);
    }
}