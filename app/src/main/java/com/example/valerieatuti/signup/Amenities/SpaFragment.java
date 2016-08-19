package com.example.valerieatuti.signup.Amenities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.valerieatuti.signup.R;

/**
 * Created by valerieatuti on 6/30/16.
 */
public class SpaFragment extends Fragment {
    public SpaFragment () {
        // Required empty public constructor

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.spa_fragment, container, false);


        return rootView;


    }
}
