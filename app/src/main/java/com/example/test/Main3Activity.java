package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

import java.util.Random;

public class Main3Activity extends AppCompatActivity {
WebView W1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        W1= findViewById(R.id.web);
        String w[]=new String[10];
        w[0]="https://www.arkadium.com/free-online-games/";
        w[1]="https://www.Wikipedia.org";
        w[2]="https://www.Unsplash.com";
        Random r2= new Random();
        int i;
        i= r2.nextInt(3);
        W1.getSettings().setJavaScriptEnabled(true);
        W1.loadUrl(w[i]);
        Toast.makeText(getApplicationContext(), "OPENING WEBSITE URL =="+w[i], Toast.LENGTH_LONG).show();


    }
}
