package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main4Activity extends AppCompatActivity {
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        String a[]=new String[10];
        a[0]="com.whatsapp";
        a[1]="com.google.android.youtube";
        a[2]="com.netflix.mediaclient";
        a[3]="com.facebook.katana";
        a[4]="com.instagram.android";
        t1=findViewById(R.id.textView2);
        Random r1 = new Random();
        int i;
        i= r1.nextInt(5);
        Intent a1 = getPackageManager().getLaunchIntentForPackage(a[i]);
        if( a1 != null)
        {
            startActivity(a1);
            Toast.makeText(getApplicationContext(), "OPENING APP PACKAGE == "+a[i], Toast.LENGTH_LONG).show();

            t1.setText("CLICK HERE TO GO BACK");
        }
        else{
t1.setText(a[i]+" PACKAGE IS NOT AVAILABLE ON YOUR DEVICE ");

        }

    }
   public void yoyo(View view)
    {
        Intent tent=new Intent(Main4Activity.this,Main2Activity.class);
        startActivity(tent);

    }
}
