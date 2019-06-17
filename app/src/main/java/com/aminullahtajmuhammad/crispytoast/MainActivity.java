package com.aminullahtajmuhammad.crispytoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnDefault, btnSuccess, btnError, btnWarning, btnConnectLost, btnConfuse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDefault = findViewById(R.id.btnDefault);
        btnConfuse = findViewById(R.id.btnConfuse);
        btnConnectLost = findViewById(R.id.btnConnectLost);
        btnError = findViewById(R.id.btnError);
        btnSuccess = findViewById(R.id.btnSuccess);
        btnWarning = findViewById(R.id.btnWarning);

        btnDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CrispyToast.makeCrispyToast(
                        MainActivity.this,
                        "This is Default Toast",
                        CrispyToast.DEFAULT_STATE,
                        CrispyToast.LENGTH_SHORT
                ).show();
            }
        });
        btnConfuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CrispyToast.makeCrispyToast(
                        MainActivity.this,
                        "This is Confuse Toast",
                        CrispyToast.CONFUSE_STATE,
                        CrispyToast.LENGTH_SHORT
                ).show();
            }
        });
        btnConnectLost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CrispyToast.makeCrispyToast(
                        MainActivity.this,
                        "This is Connection Lost Toast",
                        CrispyToast.CONNECTION_LOST_STATE,
                        CrispyToast.LENGTH_SHORT
                ).show();
            }
        });
        btnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CrispyToast.makeCrispyToast(
                        MainActivity.this,
                        "This is Error Toast",
                        CrispyToast.ERROR_STATE,
                        CrispyToast.LENGTH_SHORT
                ).show();
            }
        });
        btnSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CrispyToast.makeCrispyToast(
                        MainActivity.this,
                        "This is Success Toast",
                        CrispyToast.SUCCESS_STATE,
                        CrispyToast.LENGTH_SHORT
                ).show();
            }
        });
        btnWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CrispyToast.makeCrispyToast(
                        MainActivity.this,
                        "This is Warning Toast",
                        CrispyToast.WARNING_STATE,
                        CrispyToast.LENGTH_SHORT
                ).show();
            }
        });
    }
}
