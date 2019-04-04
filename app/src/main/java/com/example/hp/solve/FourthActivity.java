package com.example.hp.solve;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FourthActivity extends AppCompatActivity {
    private FirebaseAuth fAuth;
    private DatabaseReference fNotesDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        fAuth = FirebaseAuth.getInstance();

        if (fAuth.getCurrentUser() != null) {
            fNotesDatabase = FirebaseDatabase.getInstance().getReference().child("Notes").child(fAuth.getCurrentUser().getUid());
        }

        updateUI();
    }
    @Override
    public void onStart() {
        super.onStart();

    }
    private void updateUI(){

        if (fAuth.getCurrentUser() != null){
            Log.i("FourthActivity", "fAuth != null");
        } else {
            Intent startIntent = new Intent(FourthActivity.this, FirstActivity.class);
            startActivity(startIntent);
            finish();
            Log.i("MainActivity", "fAuth == null");
        }

    }


    public void fifth(View view) {
        Intent i3= new Intent(this, T10thActivity.class);
        startActivity(i3);
    }
}
