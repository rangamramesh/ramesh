package com.example.santhos.surya.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.santhos.surya.Adapters.CartAdapter;
import com.example.santhos.surya.R;
import com.example.santhos.surya.classes.CartData;
import com.example.santhos.surya.classes.UtilsClass;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Step_two_fragment extends Fragment {

    TextView item_haed2,cart_fare_textview,total_ride_fare;
    TextView next_step,previus_step;
    ArrayList<CartData> cartList;
    RecyclerView cart_recycler_view;
    public static double total_fare=15.00;

    public Step_two_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_step_two, container, false);
        initView(view);
        createCartList();
        previus_step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content,new Step_one_fragment()).commit();
            }
        });
        next_step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content,new Step_three_fragment()).commit();
            }
        });
        item_haed2.setText("Review Your Cart Before Continuing");
        item_haed2.setTypeface(UtilsClass.getRoboto_condenced_bold(getContext()));
        cart_fare_textview.setText("You will be Charged "+" for "+cartList.size()+" Rides :");
        cart_fare_textview.setTypeface(UtilsClass.getRoboto_condenced_Regular(getContext()));
        total_ride_fare.setText("$ "+total_fare);
        return view;
    }

    private void createCartList() {
        cartList=new ArrayList<>();
        cartList.add(new CartData("$3.00","1"));
        cartList.add(new CartData("$2.00","1"));
        cartList.add(new CartData("$6.00","2"));
        cartList.add(new CartData("$4.00","2"));
        CartAdapter cartAdapter=new CartAdapter(getContext(),cartList);
        cart_recycler_view.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        cart_recycler_view.setLayoutManager(new LinearLayoutManager(getContext()));
        cart_recycler_view.setAdapter(cartAdapter);
    }

    private void initView(View view) {
        item_haed2=(TextView)view.findViewById(R.id.welcome_head2);
        cart_fare_textview=(TextView)view.findViewById(R.id.charge_textview);
        previus_step=(TextView)view.findViewById(R.id.back_step_btn);
        next_step=(TextView)view.findViewById(R.id.two_next_step_btn);
        cart_recycler_view=(RecyclerView)view.findViewById(R.id.carts_recycler_view);
        total_ride_fare=(TextView)view.findViewById(R.id.total_fare);
    }

}
