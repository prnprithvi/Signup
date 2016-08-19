package com.example.valerieatuti.signup.Amenities;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.valerieatuti.signup.R;


public class SwimmingFragment extends Fragment {


    public SwimmingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  rootView = inflater.inflate(R.layout.swimming_fragment, container, false);


        return  rootView;
    }


}

