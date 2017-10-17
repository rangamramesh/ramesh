package com.example.santhos.surya.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.santhos.surya.Adapters.StepOneDataAdapter;
import com.example.santhos.surya.R;
import com.example.santhos.surya.classes.ListData;
import com.example.santhos.surya.classes.UtilsClass;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Step_one_fragment extends Fragment {
       TextView welcome_head,item_head,item_data;
      ArrayList<ListData> dataList;
    RecyclerView recyclerview;
    TextView next_step;
    EditText fare_edit;
    public Step_one_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_step_one, container, false);
        initView(view);
        craeteList();
         next_step.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content,new Step_two_fragment()).commit();
             }
         });
        return view;
    }

    private void craeteList() {
        dataList=new ArrayList<>();
        dataList.add(new ListData("2 Ride","$ 3.00","Enter and value to your Card","$2.00"));
        dataList.add(new ListData("2 Ride","$ 3.00","Enter and value to your Card","$2.00"));
        dataList.add(new ListData("1 Ride","$ 3.00","Enter and value to your Card","$2.00"));
        dataList.add(new ListData(" Day Pass","$ 3.00","Enter and value to your Card","$2.00"));
        dataList.add(new ListData("31 Days Pass-Standered","$ 3.00","Enter and value to your Card","$2.00"));
        dataList.add(new ListData("7 Days Pass","$ 3.00","Enter and value to your Card","$2.00"));
        dataList.add(new ListData("2 Ride","$ 3.00","Enter and value to your Card","$2.00"));
        StepOneDataAdapter adapter=new StepOneDataAdapter(getContext(),dataList);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        recyclerview.setAdapter(adapter);
    }

    private void initView(View view) {
        welcome_head=(TextView)view.findViewById(R.id.welcome_head);
        item_head=(TextView)view.findViewById(R.id.item_head);
        item_data=(TextView)view.findViewById(R.id.item_data);
        recyclerview=(RecyclerView)view.findViewById(R.id.step_one_recycler);
        next_step=(TextView)view.findViewById(R.id.one_next_step_btn);
        fare_edit=(EditText)view.findViewById(R.id.rs_edittext);
        welcome_head.setTypeface(UtilsClass.getRoboto_Black(getContext()));
        welcome_head.setText("Welcome rangamramesh036@gmail.com");
    }

}
