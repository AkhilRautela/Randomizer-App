package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main7Activity extends AppCompatActivity {
    WebView W1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        W1=findViewById(R.id.web);
        String url = "https://offhanded-shifts.000webhostapp.com";
        W1.getSettings().setJavaScriptEnabled(true);
        W1.loadUrl(url);

    }
}
