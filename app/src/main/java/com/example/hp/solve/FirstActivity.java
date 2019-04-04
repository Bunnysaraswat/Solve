package com.example.hp.solve;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class FirstActivity extends AppCompatActivity {
    private Button btnReg, btnLog;

    private FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btnReg = (Button) findViewById(R.id.button6);
        btnLog = (Button) findViewById(R.id.button5);

        fAuth = FirebaseAuth.getInstance();

        updateUI();

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextpage();
            }
        });

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondpage();
            }
        });

    }


    public void nextpage() {
        Intent i1 = new Intent(this, SecondActivity.class);
        startActivity(i1);
    }

    public void secondpage() {
        Intent i2 = new Intent(this, ThiredActivity.class);
        startActivity(i2);
    }
    private void updateUI(){
        if (fAuth.getCurrentUser() != null){
            Log.i("StartActivity", "fAuth != null");
            Intent startIntent = new Intent(FirstActivity.this, FourthActivity.class);
            startActivity(startIntent);
            finish();
        } else {

            Log.i("StartActivity", "fAuth == null");
        }
    }

}


