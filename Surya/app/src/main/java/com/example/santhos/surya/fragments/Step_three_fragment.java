package com.example.santhos.surya.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.santhos.surya.R;
import com.example.santhos.surya.classes.UtilsClass;

public class Step_three_fragment extends Fragment {
      TextView to_email_recipt,next_done_step,back_to_cart_review;
    CheckBox save_pament;
      public static  String Email="rangamramesh036@gmail.com";
    public Step_three_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_step_three, container, false);
        to_email_recipt=(TextView)view.findViewById(R.id.recipt_mail_textview);
        next_done_step=(TextView)view.findViewById(R.id.three_next_step_btn);
        back_to_cart_review=(TextView)view.findViewById(R.id.three_back_step_btn);
        save_pament=(CheckBox)view.findViewById(R.id.save_pament_checkbox);
       to_email_recipt.setText(Email);
        to_email_recipt.setTypeface(UtilsClass.getRoboto_Black(getContext()));
        next_done_step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content,new DoneFragment()).commit();
            }
        });
        back_to_cart_review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content,new Step_two_fragment()).commit();
            }
        });
        return view;
    }

}
