package com.example.hp.solve;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class E11thActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e11th);
    }
    public void query1(View view) {
        Intent i2 = new Intent(this, T12thActivity.class);
        startActivity(i2);
    }

}
