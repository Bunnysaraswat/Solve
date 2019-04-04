package com.example.hp.solve;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SeventhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
    }

    public void onedrive(View view) {
        Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/0B9786J6CQCMgT2RPUGk3RUF5UnM/view"));
        startActivity(i1);
    }
}
