package com.example.santhos.surya.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.santhos.surya.R;
import com.example.santhos.surya.classes.CartData;
import com.example.santhos.surya.classes.UtilsClass;

import java.util.ArrayList;

/**
 * Created by santhos on 21/9/17.
 */

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.MyViewHolder>{
    Context context;
    ArrayList<CartData> cartDataList;

    public CartAdapter(Context context, ArrayList<CartData> cartDataList) {
        this.context = context;
        this.cartDataList = cartDataList;
    }

    @Override
    public CartAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.carts_item_view,parent,false);

        return new CartAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CartAdapter.MyViewHolder holder, int position) {
        CartData data=cartDataList.get(position);
            holder.cart_head.setText("Full Fare - Standered Route - "+position+" Ride");
            holder.cart_fare.setText(data.getCartFare().toString());
            holder.cart_Quantity.setText("Quantity: "+data.getCartQuanitity().toString());
    }

    @Override
    public int getItemCount() {
        return cartDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView cart_head,cart_fare,cart_Quantity;
        ImageView delete_image;
        public MyViewHolder(View itemView) {
            super(itemView);
            cart_head=(TextView)itemView.findViewById(R.id.cart_head);
            cart_fare=(TextView)itemView.findViewById(R.id.cart_fare);
            cart_Quantity=(TextView)itemView.findViewById(R.id.cart_quantity);
            delete_image=(ImageView)itemView.findViewById(R.id.delete_btn);
            cart_head.setTypeface(UtilsClass.getRoboto_Black(context));
        }
    }
}
