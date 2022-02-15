package ru.geekbrains.eupos.android1.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

    //    if (savedInstanceState == null) {
    //        titleRecipe titlesRecipe = titleRecipe.newInstance();
    //        getSupportFragmentManager().beginTransaction().replace(R.id.titles, titlesRecipe).commit();
    //    }
    }


}