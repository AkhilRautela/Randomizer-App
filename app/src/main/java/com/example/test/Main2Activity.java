package com.example.test;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    ImageView b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=findViewById(R.id.imageView16);
        t1 =  findViewById(R.id.textView);

    }
    public void select(View v)
    {int a[]=new int[7];
        a[0]=0;
        a[1]=72;
        a[2]=144;
        a[3]=216;
        a[4]=288;
        Random r = new Random();
        int e=r.nextInt(5);
        int c=a[e]+25920;
        RotateAnimation R2= new RotateAnimation(0,c,RotateAnimation.RELATIVE_TO_SELF
                ,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
        R2.setFillAfter(true);
        R2.setDuration(5000);
        R2.setInterpolator(new AccelerateDecelerateInterpolator());
        b1.startAnimation(R2);


        final int d = c%360 ;
        Handler h1= new Handler();
        h1.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(d==0)
                {t1.setText(" INTERNET ");
                    Intent in = new Intent(Main2Activity.this,Main3Activity.class);
                    startActivity(in);
                    overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);


                }
                else if(d==72){
                    t1.setText(" SOCIAL APP ");
                    Intent ola = new Intent(Main2Activity.this,Main4Activity.class);
                    startActivity(ola);
                    overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);

                }
                else if(d==144) {
                    t1.setText(" MESSAGING ");
                    Intent nola = new Intent(Main2Activity.this,Main5Activity.class);
                    startActivity(nola);
                    overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                    Toast.makeText(getApplicationContext(), "OPENING MESSAGING APP", Toast.LENGTH_LONG).show();


                }
                else if(d==216){
                    t1.setText(" MUSIC ");
                    Intent ganola = new Intent(Main2Activity.this,Main6Activity.class);
                    startActivity(ganola);
                    overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                    Toast.makeText(getApplicationContext(), "OPENING MUSIC APP", Toast.LENGTH_SHORT).show();


                }
                else {
                    t1.setText("CHAT-BOX");
                    Intent manola = new Intent(Main2Activity.this,Main7Activity.class);
                    startActivity(manola);
                    overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                    Toast.makeText(getApplicationContext(), "CHAT BOX", Toast.LENGTH_SHORT).show();
                }

            }
        }, 5000);


    }
}
