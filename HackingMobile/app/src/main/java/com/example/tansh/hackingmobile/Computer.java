package com.example.tansh.hackingmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Computer extends AppCompatActivity implements View.OnClickListener {

    private Button change_password, harddisk, steal_wifi, lock_pc, two_lapt, hidefile, hideip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        change_password=(Button)findViewById(R.id.change_password_id);
        harddisk=(Button)findViewById(R.id.harddisk_id);
        steal_wifi=(Button)findViewById(R.id.stealinh_wifi_id);
        lock_pc=(Button)findViewById(R.id.lock_pc_id);
        two_lapt=(Button)findViewById(R.id.twolaptop_id);
        hidefile=(Button)findViewById(R.id.hide_file_id);
        hideip=(Button)findViewById(R.id.hideip_id);


        change_password.setOnClickListener(this);
        harddisk.setOnClickListener(this);
        steal_wifi.setOnClickListener(this);
        lock_pc.setOnClickListener(this);
        two_lapt.setOnClickListener(this);
        hidefile.setOnClickListener(this);
        hideip.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        if(v.getId()==change_password.getId())
            {
                Intent intent=new Intent(this, pc_text.class);
                intent.putExtra("key", 0);
                startActivity(intent);
            }

        if(v.getId()==harddisk.getId())
        {
            Intent intent=new Intent(this, pc_text.class);
            intent.putExtra("key", 1);
            startActivity(intent);
        }

        if(v.getId()==steal_wifi.getId())
        {
            Intent intent=new Intent(this, pc_text.class);
            intent.putExtra("key", 2);
            startActivity(intent);
        }
        if(v.getId()==lock_pc.getId())
        {
            Intent intent=new Intent(this, pc_text.class);
            intent.putExtra("key", 3);
            startActivity(intent);
        }

        if(v.getId()==two_lapt.getId())
        {
            Intent intent=new Intent(this, pc_text.class);
            intent.putExtra("key", 4);
            startActivity(intent);
        }

        if(v.getId()==hidefile.getId())
        {
            Intent intent=new Intent(this, pc_text.class);
            intent.putExtra("key", 5);
            startActivity(intent);
        }
        if(v.getId()==hideip.getId())
        {
            Intent intent=new Intent(this, pc_text.class);
            intent.putExtra("key", 6);
            startActivity(intent);
        }



    }
}
