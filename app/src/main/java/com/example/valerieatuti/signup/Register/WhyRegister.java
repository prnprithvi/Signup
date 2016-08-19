package com.example.valerieatuti.signup.Register;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.valerieatuti.signup.R;
import com.example.valerieatuti.signup.Register.registerfields.RegisterItems;

import java.util.List;


public class WhyRegister extends Fragment {
    private List<RegisterItems> data;


    public WhyRegister() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView =inflater.inflate(R.layout.why_register_fragment, container, false);



        return rootView;
    }

}
