package com.example.tansh.hospital01;

import android.content.Intent;

import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout appoint, doctor, info, emergency;
    private ImageView actionButton ;
    String number;
    //private  FloatingActionButton actionMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appoint = (LinearLayout) findViewById(R.id.AppointmentID);
        doctor = (LinearLayout) findViewById(R.id.DoctorID);
        info = (LinearLayout) findViewById(R.id.InformationID);
        emergency = (LinearLayout) findViewById(R.id.EmergencyID);

        ImageView icon = new ImageView(this); // Create an icon
        icon.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_floatmenu_center_black_24dp));

        FloatingActionButton actionButton = new FloatingActionButton.Builder(this)
                .setContentView(icon)
                .setPosition(FloatingActionButton.POSITION_BOTTOM_RIGHT)
                .build();



        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);
// repeat many times:
        ImageView itemIcon1 = new ImageView(this);
        ImageView itemIcon2 = new ImageView(this);
        ImageView itemIcon3 = new ImageView(this);
        ImageView itemIcon4 = new ImageView(this);

        itemIcon1.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_info_black_24dp));
        itemIcon2.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_ambulance_shuttle_black_24dp));
        itemIcon3.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_doctor_account_black_24dp));
        itemIcon4.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_phone_iphone_black_24dp));

       // SubActionButton button1 = itemBuilder.setContentView(itemIcon1).build();
        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(itemBuilder.setContentView(itemIcon1).build())
                .addSubActionView(itemBuilder.setContentView(itemIcon2).build())
                .addSubActionView(itemBuilder.setContentView(itemIcon3).build())
                .addSubActionView(itemBuilder.setContentView(itemIcon4).build())

                .attachTo(actionButton)
                .build();




        appoint.setOnClickListener(this);
        doctor.setOnClickListener(this);
        info.setOnClickListener(this);
        emergency.setOnClickListener(this);

        itemIcon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Information.class);
                startActivity(intent);
            }
        });

        itemIcon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Emergency.class);
                startActivity(intent);
            }
        });


        itemIcon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Doctor.class);
                startActivity(intent);
            }
        });

        itemIcon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Phone_call.class);
                startActivity(intent);
            }
        });





    }

    @Override
    public void onClick(View v) {

        if(v.getId()==appoint.getId())
        {
            Intent intent=new Intent(MainActivity.this, Appointment_select.class);
            startActivity(intent);
        }
        if(v.getId()==doctor.getId())
        {
            Intent intent=new Intent(MainActivity.this, Doctor.class);
            startActivity(intent);
        }

        if(v.getId()==info.getId())
        {
            Intent intent=new Intent(MainActivity.this, Information.class);
            startActivity(intent);
        }
        if(v.getId()==emergency.getId())
        {
            Intent intent=new Intent(MainActivity.this, Emergency.class);
            startActivity(intent);
        }

    }


}
