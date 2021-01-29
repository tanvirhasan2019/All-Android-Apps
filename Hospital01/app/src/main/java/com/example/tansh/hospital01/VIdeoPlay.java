package com.example.tansh.hospital01;

import android.net.Uri;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class VIdeoPlay extends AppCompatActivity {
    private VideoView videov;
    android.widget.MediaController mediac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_play);

        videov=(VideoView)findViewById(R.id.videoplay);
        mediac=new android.widget.MediaController(this);

        String videopath="android.resource://com.example.tansh.hospital01/"+R.raw.vdeo1;
        Uri uri= Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediac);
        mediac.setAnchorView(videov);
        videov.start();


    }


}
