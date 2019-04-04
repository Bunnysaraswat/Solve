package com.example.hp.solve;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent i1=new Intent(StartActivity.this,FirstActivity.class);
                startActivity(i1);
                finish();

            }
        } ,SPLASH_TIME_OUT);

    }
}
