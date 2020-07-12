package com.promobility.io.fragment.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.promobility.io.fragment.FragmentActivity;
import com.promobility.io.fragment.FragmentContainerActivity;
import com.promobility.io.fragment.R;

public class FirstFragment extends Fragment {

    TextView tv_login_signup;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        tv_login_signup=view.findViewById(R.id.tv_login_signup);
        tv_login_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(), FragmentActivity.class);
                intent.putExtra("FRAGMENT_NAV","SignUp");
                startActivity(intent);
            }
        });

        return view;
    }
}
