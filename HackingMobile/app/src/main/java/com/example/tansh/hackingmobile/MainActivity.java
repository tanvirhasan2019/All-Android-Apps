package com.example.tansh.hackingmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView android, ios, computer, tablet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android=(TextView)findViewById(R.id.android_id);
        ios=(TextView)findViewById(R.id.ios_id);
        computer=(TextView)findViewById(R.id.computer_id);
        tablet=(TextView)findViewById(R.id.tablet_id);

        android.getBackground().setAlpha(60);
        ios.getBackground().setAlpha(60);
        computer.getBackground().setAlpha(60);
        tablet.getBackground().setAlpha(60);


        android.setOnClickListener(this);
        ios.setOnClickListener(this);
        computer.setOnClickListener(this);
        tablet.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId()==android.getId())
        {
            Intent intent=new Intent(this, Android.class);
            startActivity(intent);
        }

        if(v.getId()==computer.getId())
        {
            Intent intent=new Intent(this, Computer.class);
            startActivity(intent);
        }


    }



}
