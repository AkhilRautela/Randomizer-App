package com.example.test;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    MediaPlayer mediaPlayer = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.love);

        mediaPlayer.start();



    }
    public void stop(View view){
        mediaPlayer.reset();
    }

    public void pause(View view){

        mediaPlayer.pause();
}

public void play(View view)
{
    mediaPlayer.start();
}
}
