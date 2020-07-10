package com.promobility.io.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;


/*  Fragment Activtity
 *   Fragment
 *   Fragment Manager
 *   Fragment Transaction - add /replace*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Created a FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Creating Fragment Tranaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // replace the framelayout with new Fragment
        FirstFragment firstFragment = new FirstFragment();
        fragmentTransaction.replace(R.id.framelayout_first_frag, firstFragment);
        fragmentTransaction.commit();

    }
}
