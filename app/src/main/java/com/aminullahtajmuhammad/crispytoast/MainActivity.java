package com.aminullahtajmuhammad.crispytoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CrispyToast crispyToast = new CrispyToast(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crispyToast.makeCrispyToast(this, "This is toast", CrispyToast.ERROR, CrispyToast.LENGTH_SHORT);
    }
}
