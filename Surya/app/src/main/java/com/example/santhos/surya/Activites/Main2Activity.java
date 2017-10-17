package com.example.santhos.surya.Activites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.santhos.surya.R;
import com.example.santhos.surya.fragments.Step_one_fragment;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportFragmentManager().beginTransaction().replace(R.id.content,new Step_one_fragment()).commit();
    }
}
