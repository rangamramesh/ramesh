package com.example.santhos.surya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
  Button getvalue;
    TextView coutText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getvalue=(Button)findViewById(R.id.get_value);
        coutText=(TextView)findViewById(R.id.text_value);
        final MyView myView=(MyView)findViewById(R.id.view1);
        myView.setValueInLis(new MyView.Valuecontrole() {
            @Override
            public void textvalue(int value) {
                Toast.makeText(MainActivity.this,""+value, Toast.LENGTH_SHORT).show();
            }
        });
        getvalue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,myView.getContentDescription(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
