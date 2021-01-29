package com.example.tansh.hospital01;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Emergency extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout ambulance1, ambulance2, ambulance3, ambulance4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        ambulance1=(LinearLayout)findViewById(R.id.ambulance1ID);
        ambulance2=(LinearLayout)findViewById(R.id.ambulance2ID);
        ambulance3=(LinearLayout)findViewById(R.id.ambulance3ID);
        ambulance4=(LinearLayout)findViewById(R.id.ambulance4ID);

        ambulance1.setOnClickListener(this);
        ambulance2.setOnClickListener(this);
        ambulance3.setOnClickListener(this);
        ambulance4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v)
    {
        if(v.getId()==ambulance1.getId())
        {

            Intent intent =new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+8801911141482"));
            startActivity(intent);

        }
        if(v.getId()==ambulance2.getId())
        {

            Intent intent =new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+8801911141482"));
            startActivity(intent);

        }
        if(v.getId()==ambulance3.getId())
        {

            Intent intent =new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+8801911141482"));
            startActivity(intent);

        }

        if(v.getId()==ambulance4.getId())
        {

            Intent intent =new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+8801911141482"));
            startActivity(intent);

        }


    }
}
