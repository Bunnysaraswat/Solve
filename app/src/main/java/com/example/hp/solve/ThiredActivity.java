package com.example.hp.solve;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class ThiredActivity extends AppCompatActivity {
    private EditText txtEmailAddress;
    private EditText txtPassword;
    private EditText name;
    private EditText phoneno;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thired);
        txtEmailAddress = (EditText) findViewById(R.id.editText15);
        txtPassword = (EditText) findViewById(R.id.editText13);
        name = (EditText) findViewById(R.id.editText11);
        phoneno = (EditText) findViewById(R.id.editText14);
        firebaseAuth = FirebaseAuth.getInstance();

    }
    public void btnRegistrationUser_Click(View v) {

        final ProgressDialog progressDialog = ProgressDialog.show(ThiredActivity.this, "Please wait...", "Processing...", true);
        (firebaseAuth.createUserWithEmailAndPassword(txtEmailAddress.getText().toString(), txtPassword.getText().toString()))
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();

                        if (task.isSuccessful()) {
                            Toast.makeText(ThiredActivity.this, "Registration successful", Toast.LENGTH_LONG).show();
                            Intent i = new Intent(ThiredActivity.this, SecondActivity.class);
                            startActivity(i);
                        }
                        else
                        {
                            Log.e("ERROR", task.getException().toString());
                            Toast.makeText(ThiredActivity.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                        }
                   }
                });
    }
    }

