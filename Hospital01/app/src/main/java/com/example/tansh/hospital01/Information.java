package com.example.tansh.hospital01;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;

public class Information extends AppCompatActivity implements View.OnClickListener {

    private CardView video;
    private CardView surgery, location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        video=(CardView) findViewById(R.id.video1ID);
        location=(CardView) findViewById(R.id.LocationID);


        video.setOnClickListener(this);
        location.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
       if(v.getId()==video.getId())
        {
            Intent intent=new Intent(Information.this, VIdeoPlay.class);
            startActivity(intent);
        }

        if(v.getId()==location.getId())
        {
            Intent intent=new Intent(Information.this, MapsActivity.class);
            startActivity(intent);
        }
    }
}
