package com.example.feedmeutalento;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigation {
    public static void enableNavigation(final Context context, final Activity callingActivity, BottomNavigationView view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.ic_home:
                        Intent intent1 = new Intent(context, MainActivity.class);
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_search:
                        Intent intent2 = new Intent(context, MainActivity.class);
                        context.startActivity(intent2);
                        break;

                    case  R.id.ic_add:
                        Intent intent3 = new Intent(context, MainActivity.class);
                        context.startActivity(intent3);
                        break;

                    case  R.id.ic_profile:
                        Intent intent4 = new Intent(context, MainActivity.class);
                        context.startActivity(intent4);
                        break;
                }

                return false;
            }
        });
    }
}
