package com.example.spotifyedmilson3ai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.GenericLifecycleObserver;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
ImageView img_ft;
MediaPlayer play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_ft.findViewById(R.id.foto);
        Glide.with(this).load("https://img.youtube.com/vi/CIFrr1dqj5M/0.jpg").into(img_ft);
        play=MediaPlayer.create(getApplicationContext(),R.raw.mobamba);
    }
    protected void onResume(){
        super.onResume();
    }
    public void play(View view){
        play.start();
    }
}