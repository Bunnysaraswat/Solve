package com.example.hp.solve;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }
    public void next4page(View view) {
        Intent i4= new Intent(this, SeventhActivity.class);
        startActivity(i4);
    }
    public void next8page(View view) {
        Intent i4= new Intent(this, E8thActivity.class);
        startActivity(i4);
    }
    public void next9page(View view) {
        Intent i4= new Intent(this, N9thActivity.class);
        startActivity(i4);
    }
}
