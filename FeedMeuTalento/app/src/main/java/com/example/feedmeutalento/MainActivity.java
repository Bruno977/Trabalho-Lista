package com.example.feedmeutalento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[];
    int [] profileImage = {R.drawable.photo1, R.drawable.photo2, R.drawable.photo3};
    int [] feedImage = {R.drawable.photo1, R.drawable.photo2, R.drawable.photo3};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.profile_name);

        MyAdapter myAdapter = new MyAdapter(this, s1,profileImage, feedImage);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}