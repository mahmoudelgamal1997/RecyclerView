package com.example2017.android.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define recyclerView
        recyclerView = (RecyclerView) findViewById(R.id.view);

        //data in list which we want to view in recyclerView
        String[] titles = {"Action", "Funny", "Comedy", "Romantic"};
        int[] images = {R.drawable.act, R.drawable.funny, R.drawable.rom, R.drawable.com};
        //define alist but have class to put images and text in array
        List<MoviesModel> Movies = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Movies.add(new MoviesModel(images[i], titles[i]));
        }



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MoviesAdapter moviesAdapter = new MoviesAdapter(Movies);
        recyclerView.setAdapter(moviesAdapter);

    }

}
