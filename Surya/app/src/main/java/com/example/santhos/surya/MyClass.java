package com.example.santhos.surya;

import com.example.santhos.surya.Activites.MyInterface;

/**
 * Created by santhos on 6/10/17.
 */

public class MyClass {
    MyInterface myInterface;
    public MyClass() {
        this.myInterface = null;
    }

    public void setMyListener(MyInterface myInterface){
        this.myInterface=myInterface;
        myInterface.success("THis is Success");
    }
}
