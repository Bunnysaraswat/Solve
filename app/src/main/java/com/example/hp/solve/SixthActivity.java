package com.example.hp.solve;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SixthActivity extends AppCompatActivity {
    private FirebaseAuth.AuthStateListener authListener;
    private FirebaseAuth auth;
    private TextView email;
    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        name = (TextView) findViewById(R.id.name);
        email = (TextView) findViewById(R.id.email_field);
        auth = FirebaseAuth.getInstance();

        //get current user
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        authListener = new FirebaseAuth.AuthStateListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                Log.d("SixthActivity", "onAuthStateChanged");
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    setDataToView(user);


                } else {
                    //user auth state is not existed or closed, return to Login activity
                    startActivity(new Intent(SixthActivity.this, SecondActivity.class));
                    finish();
                }
            }
            @SuppressLint("SetTextI18n")

            private void setDataToView(FirebaseUser user) {
                email.setText("User Email: " + user.getEmail());
                name.setText("User name: " + user.getDisplayName());
            }
        };



    }




}
