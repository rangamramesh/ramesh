package com.example.santhos.surya.Activites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.santhos.surya.MyClass;
import com.example.santhos.surya.R;

public class ItActivity extends AppCompatActivity {
  MyInterface myInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);
        MyClass myClass=new MyClass();

        myClass.setMyListener(new MyInterface() {
            @Override
            public void success(String msg) {
                Toast.makeText(ItActivity.this,msg, Toast.LENGTH_SHORT).show();
            }
            @Override
            public void falure(String msg) {
                Toast.makeText(ItActivity.this,msg, Toast.LENGTH_SHORT).show();
            }
        });

    }

}
