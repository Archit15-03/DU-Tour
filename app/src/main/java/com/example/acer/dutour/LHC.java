package com.example.acer.dutour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LHC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lhc);
        getIntent().getExtras();
    }
}
