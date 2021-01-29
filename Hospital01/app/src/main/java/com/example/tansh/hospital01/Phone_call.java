package com.example.tansh.hospital01;

import android.content.Intent;
import android.net.Uri;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Phone_call extends AppCompatActivity implements View.OnClickListener {
    LinearLayout phone1, phone2, phone3, phone4, phone5, phone6,phone7;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_call);

        phone1=(LinearLayout) findViewById(R.id.Suger1ID);
        phone2=(LinearLayout) findViewById(R.id.burn1ID);
        phone3=(LinearLayout) findViewById(R.id.dental1ID);
        phone4=(LinearLayout) findViewById(R.id.heart1ID);
        phone5=(LinearLayout) findViewById(R.id.diabeticsID);
        phone6=(LinearLayout) findViewById(R.id.cardialogyID);
        phone7=(LinearLayout) findViewById(R.id.cardialogy2ID);



        phone1.setOnClickListener(this);
        phone2.setOnClickListener(this);
        phone3.setOnClickListener(this);
        phone4.setOnClickListener(this);
        phone5.setOnClickListener(this);
        phone6.setOnClickListener(this);
        phone7.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==phone1.getId())
        {

            Intent intent =new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+8801911141482"));
            startActivity(intent);


        }

        if(v.getId()==phone2.getId())
        {

           Intent intent =new Intent(Intent.ACTION_DIAL);
           intent.setData(Uri.parse("tel:+8801911141482"));
           startActivity(intent);

        }




        if(v.getId()==phone3.getId())
        {

            Intent intent =new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+8801911141482"));
            startActivity(intent);


        }

        if(v.getId()==phone4.getId())
        {

            Intent intent =new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+8801911141482"));
            startActivity(intent);

        }




        if(v.getId()==phone5.getId())
        {

            Intent intent =new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+8801911141482"));
            startActivity(intent);


        }

        if(v.getId()==phone6.getId())
        {

            Intent intent =new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+8801911141482"));
            startActivity(intent);

        }
        if(v.getId()==phone7.getId())
        {

            Intent intent =new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+8801911141482"));
            startActivity(intent);

        }

    }
}
