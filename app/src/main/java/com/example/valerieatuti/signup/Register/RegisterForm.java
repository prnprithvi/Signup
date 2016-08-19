package com.example.valerieatuti.signup.Register;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.valerieatuti.signup.R;

public class RegisterForm extends Fragment {
    EditText username, phonenumber, email, password, rpassword;
    Button register;



    public RegisterForm() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.registerform_fragment, container, false);


        username = (EditText) rootView.findViewById(R.id.TVusername);
        password = (EditText) rootView.findViewById(R.id.TVpassword);
        phonenumber = (EditText) rootView.findViewById(R.id.TVphonenumber);
        email = (EditText) rootView.findViewById(R.id.TVemail);
        username = (EditText) rootView.findViewById(R.id.TVusername);
        rpassword = (EditText) rootView.findViewById(R.id.TVrpassword);
        register = (Button) rootView.findViewById(R.id.Bregister);
        return rootView;


    }

}
