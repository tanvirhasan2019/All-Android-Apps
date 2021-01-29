package com.example.tansh.hackingmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Android extends AppCompatActivity implements View.OnClickListener {

    private Button unlock, hack, finger, linux, shoutdown, recyclebin, guest, particular, hack_game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

        unlock=(Button)findViewById(R.id.unlock_bypass_id);
        hack=(Button)findViewById(R.id.hackwifi_id);
        finger=(Button)findViewById(R.id.finger_id);
        linux=(Button)findViewById(R.id.kali_linux_id);
        shoutdown=(Button)findViewById(R.id.shoutdown_id);
        recyclebin=(Button)findViewById(R.id.recycle_id);
        guest=(Button)findViewById(R.id.guest_id);
        particular=(Button)findViewById(R.id.particular_id);
        hack_game=(Button)findViewById(R.id.hack_game_id);

        unlock.setOnClickListener(this);
        hack.setOnClickListener(this);
        finger.setOnClickListener(this);
        linux.setOnClickListener(this);
        shoutdown.setOnClickListener(this);
        recyclebin.setOnClickListener(this);
        guest.setOnClickListener(this);
        particular.setOnClickListener(this);
        hack_game.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==unlock.getId())
        {
            Intent intent=new Intent(this, Android_text.class);
            intent.putExtra("key", 0);
            startActivity(intent);
        }

        if(v.getId()==hack.getId())
        {
            Intent intent=new Intent(this, Android_text.class);
            intent.putExtra("key", 1);
            startActivity(intent);
        }

        if(v.getId()==finger.getId())
        {
            Intent intent=new Intent(this, Android_text.class);
            intent.putExtra("key", 2);
            startActivity(intent);
        }

        if(v.getId()==linux.getId())
        {
            Intent intent=new Intent(this, Android_text.class);
            intent.putExtra("key", 3);
            startActivity(intent);
        }


        if(v.getId()==shoutdown.getId())
        {
            Intent intent=new Intent(this, Android_text.class);
            intent.putExtra("key", 4);
            startActivity(intent);
        }


        if(v.getId()==recyclebin.getId())
        {
            Intent intent=new Intent(this, Android_text.class);
            intent.putExtra("key", 5);
            startActivity(intent);
        }

        if(v.getId()==guest.getId())
        {
            Intent intent=new Intent(this, Android_text.class);
            intent.putExtra("key", 6);
            startActivity(intent);
        }
        if(v.getId()==particular.getId())
        {
            Intent intent=new Intent(this, Android_text.class);
            intent.putExtra("key", 7);
            startActivity(intent);
        }
        if(v.getId()==hack_game.getId())
        {
            Intent intent=new Intent(this, Android_text.class);
            intent.putExtra("key", 8);
            startActivity(intent);
        }



    }
}
