package com.soap.mynavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.orhanobut.logger.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NavHostFragment navHostFragment = (NavHostFragment)getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
        NavController navController = navHostFragment.getNavController();
        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        NavigationUI.setupWithNavController(bottomNav, navController);

        /*
        bottomNav.setOnNavigationItemSelectedListener( item ->
                NavigationUI.onNavDestinationSelected(item, navController));
        */


        navController.addOnDestinationChangedListener( (controller,destination,arguments) ->{
            Logger.i( "DestinationChanged:%s",destination.getDisplayName());
            switch (destination.getId() ) {
                case R.id.homeFragment:
                    Logger.i("go to home");
                    bottomNav.setVisibility(View.VISIBLE);
                    break;
                case R.id.spaceFragment:
                    Logger.i("go to space");
                    bottomNav.setVisibility(View.GONE);
                    break;
                case R.id.myFragment:
                    Logger.i("go to my");
                    bottomNav.setVisibility(View.VISIBLE);
                    break;
                default:
                    Logger.i("other...");
            }
        });

    }
}