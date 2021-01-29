package com.example.tansh.hackingmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class pc_text extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle=getIntent().getExtras();
        int value=bundle.getInt("key");


        if(value==0)
        {

            setContentView(R.layout.activity_pc_text);


        }

        if(value==1)
        {
            setContentView(R.layout.pc_harddisk);

        }


        if(value==2)
        {
            setContentView(R.layout.pc_stealing_wifi);

        }
        if(value==3)
        {
            setContentView(R.layout.pc_lock_unlock_pendrive);

        }
        if(value==4)
        {
            setContentView(R.layout.pc_transfer_bywifi);

        }
        if(value==5)
        {
            setContentView(R.layout.pc_hidefile);

        }
        if(value==6)
        {
            setContentView(R.layout.pc_hideip);

        }



    }
}
