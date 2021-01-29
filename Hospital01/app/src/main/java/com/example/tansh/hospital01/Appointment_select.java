package com.example.tansh.hospital01;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Appointment_select extends AppCompatActivity implements View.OnClickListener {

    private ImageView call, message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment_select);

        call=(ImageView)findViewById(R.id.phone_id);
        message=(ImageView)findViewById(R.id.message_id);

        call.setOnClickListener(this);
        message.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(v.getId()==call.getId())
        {
            Intent intent=new Intent(this, Phone_call.class);
            startActivity(intent);
        }
        if(v.getId()==message.getId())
        {
            Intent intent=new Intent(this, Appointment.class);
            startActivity(intent);
        }

    }
}
