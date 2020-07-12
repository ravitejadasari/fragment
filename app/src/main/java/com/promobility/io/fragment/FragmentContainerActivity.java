package com.promobility.io.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.promobility.io.fragment.fragments.HomeFragment;

/*  Fragment Activtity
 *   Fragment
 *   Fragment Manager
 *   Fragment Transaction - add /replace
 * */


public class FragmentContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_container);


        // Created a FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Creating Fragment Tranaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // Intializing the
        HomeFragment homeFragment = new HomeFragment();
        // Loading the fragments in to fragment transaction
        fragmentTransaction.replace(R.id.layout_container, homeFragment);
        fragmentTransaction.commit();


    }


}
