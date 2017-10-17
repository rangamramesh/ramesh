package com.example.santhos.surya.classes;

/**
 * Created by santhos on 21/9/17.
 */

public class CartData {

    private  String cartFare;
    private  String cartQuanitity;

    public CartData(String cartFare, String cartQuanitity) {
        this.cartFare = cartFare;
        this.cartQuanitity = cartQuanitity;
    }


    public String getCartFare() {
        return cartFare;
    }

    public void setCartFare(String cartFare) {
        this.cartFare = cartFare;
    }

    public String getCartQuanitity() {
        return cartQuanitity;
    }

    public void setCartQuanitity(String cartQuanitity) {
        this.cartQuanitity = cartQuanitity;
    }
}
