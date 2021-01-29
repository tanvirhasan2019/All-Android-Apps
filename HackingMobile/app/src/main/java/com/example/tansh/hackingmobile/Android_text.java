package com.example.tansh.hackingmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Android_text extends AppCompatActivity {

  //  private LinearLayout layaout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        Bundle bundle=getIntent().getExtras();
        int value=bundle.getInt("key");


        if(value==0)
        {
            setContentView(R.layout.unlock_bypass);

        }

        if(value==1)
        {
            setContentView(R.layout.android_hack_wifi);

        }

        if(value==2)
        {
            setContentView(R.layout.android_finger);

        }
        if(value==3)
        {
            setContentView(R.layout.android_kali_linux);

        }
        if(value==4)
        {
            setContentView(R.layout.android_shoutdownpc);

        }
        if(value==5)
        {
            setContentView(R.layout.android_recyclebin);

        }

        if(value==6)
        {
            setContentView(R.layout.android_guest_mode);

        }

        if(value==7)
        {
            setContentView(R.layout.android_particular_app_block);

        }

        if(value==8)
        {
            setContentView(R.layout.android_hack_game);

        }

    }
}
