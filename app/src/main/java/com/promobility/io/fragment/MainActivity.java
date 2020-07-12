package com.promobility.io.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_load_frag, btn_frag_nav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_load_frag = findViewById(R.id.btn_load_frag);
        btn_frag_nav = findViewById(R.id.btn_frag_nav);

        btn_load_frag.setOnClickListener(this);
        btn_frag_nav.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_load_frag:
                Intent fragContainer = new Intent(MainActivity.this, FragmentContainerActivity.class);
                startActivity(fragContainer);
                break;
            case R.id.btn_frag_nav:
                Intent fragActivity = new Intent(MainActivity.this, FragmentActivity.class);
                fragActivity.putExtra("FRAGMENT_NAV","Login");
                startActivity(fragActivity);
                break;
            default:
                Toast.makeText(this, "No View Found", Toast.LENGTH_SHORT).show();
        }
    }
}
