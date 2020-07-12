package com.promobility.io.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.promobility.io.fragment.fragments.FirstFragment;
import com.promobility.io.fragment.fragments.HomeFragment;
import com.promobility.io.fragment.fragments.SecondFragment;

public class FragmentActivity extends AppCompatActivity {

    private String strBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            strBundle = bundle.getString("FRAGMENT_NAV");
        }

        if (strBundle != null) {
            if (strBundle.equals("Login")) {
                FirstFragment firstFragment = new FirstFragment();
                loadFragment(firstFragment);
            } else if (strBundle.equals("SignUp")) {
                SecondFragment secondFragment = new SecondFragment();
                loadFragment(secondFragment);
            }
        }
    }

    private void loadFragment(Fragment fragment) {
        // Created a FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Creating Fragment Tranaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // Loading the fragments in to fragment transaction
        fragmentTransaction.replace(R.id.frag_container, fragment);
        // Commiting the fragment
        fragmentTransaction.commit();
    }

}
