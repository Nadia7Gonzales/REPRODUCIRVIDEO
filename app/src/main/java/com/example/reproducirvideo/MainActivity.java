package com.example.reproducirvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView mivdeo=findViewById(R.id.video1);

        String videop= "android.resource://" + getPackageName() + "/" + R.raw.natural;
        mivdeo.setVideoURI(Uri.parse(videop));

        MediaController mediaController=new MediaController(this);
        mivdeo.setMediaController(mediaController);
        mediaController.setAnchorView(mivdeo);
    }
}