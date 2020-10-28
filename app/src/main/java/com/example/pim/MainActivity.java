package com.example.pim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Telahome(View view) {

        Intent intent1 = new Intent(getApplicationContext(), dm.class);
        startActivity(intent1);
    }

    public void Telacad(View view) {

        Intent intent2 = new Intent(getApplicationContext(), TelaCadastro.class);
        startActivity(intent2);

    }

}