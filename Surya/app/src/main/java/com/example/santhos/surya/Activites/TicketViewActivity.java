package com.example.santhos.surya.Activites;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.santhos.surya.R;

public class TicketViewActivity extends AppCompatActivity {
      TextView ticket_fare;
    RelativeLayout relativeLayout;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_view);
        ticket_fare = (TextView) findViewById(R.id.ticket_fare_textviw);
        relativeLayout = (RelativeLayout) findViewById(R.id.relative);
        Animation a1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_in_left);
        relativeLayout.startAnimation(a1);
        a1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }
            @Override
            public void onAnimationEnd(Animation animation) {
                relativeLayout.startAnimation(animation);
            }
            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


    }

    private void delay() {
        for(int i=0;i<=15000;i++);
    }

}
