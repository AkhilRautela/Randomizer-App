package com.example.test;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;


import java.util.Random;

import javax.crypto.spec.RC2ParameterSpec;

public class MainActivity extends AppCompatActivity {
    ImageButton b1;
    ImageView B2;
    ImageView b3;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= findViewById(R.id.imageButton);
        B2= findViewById(R.id.imageView4);


        RotateAnimation R1= new RotateAnimation(0,7000000,RotateAnimation.RELATIVE_TO_SELF
                ,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
        R1.setFillAfter(true);
        R1.setDuration(100000);
        R1.setInterpolator(new AccelerateDecelerateInterpolator());
        B2.startAnimation(R1);
        b3= findViewById(R.id.imageView5);
        RotateAnimation R2= new RotateAnimation(0,720000,RotateAnimation.RELATIVE_TO_SELF
                ,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
        R2.setFillAfter(true);
        R2.setDuration(100000);
        R2.setInterpolator(new AccelerateDecelerateInterpolator());
        b3.startAnimation(R2);


    }
    public void boss(View view)
    {
        Intent yo;
        yo = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(yo);
        overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);



    }}

