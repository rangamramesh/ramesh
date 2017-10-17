package com.example.santhos.surya;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.value;

/**
 * Created by santhos on 20/9/17.
 */

public class MyView extends LinearLayout {
    private Context context;
    private View myView;
    private TextView valueTextView;
    private ImageView minusButton;
    private ImageView plusButton;
    private Valuecontrole valuecontrole;

    public MyView(Context context) {
        super(context);
        init(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
           myView = inflate(context, R.layout.my_view, this);
           valueTextView=(TextView)myView.findViewById(R.id.text_value);
          minusButton=(ImageView) myView.findViewById(R.id.minus_btn);
          plusButton=(ImageView)myView.findViewById(R.id.plus_btn);
          valueTextView.setText("0");
        plusButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                increnmentValue();
            }
        });
        minusButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                decrementValue();
            }
        });
        myView.setMinimumHeight(40);
        myView.setMinimumWidth(150);
    }

    public void setValueInLis(Valuecontrole listener){
        valuecontrole = listener;
    }
    private void decrementValue() {

        int k= Integer.parseInt(valueTextView.getText().toString());
        int p=0;
        if(k>0)
        {
            p=k-1;
        }
        valueTextView.setText(p+"");
        valuecontrole.textvalue(p);
    }
    private void increnmentValue() {
        int k= Integer.parseInt(valueTextView.getText().toString());
        int p=k+1;
        valueTextView.setText(p+"");
        valuecontrole.textvalue(p);

    }
    interface  Valuecontrole{
        void textvalue(int value);
    }
}

