package com.example.pim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm);
    }

    public void dashboard(View view) {

        Intent intent3 = new Intent(getApplicationContext(), Dashboard.class);
        startActivity(intent3);
    }
}