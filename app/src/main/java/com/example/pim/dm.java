package com.example.pim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class dm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm);
    }

    public void dashboard(View view) {

        Intent intent1 = new Intent(getApplicationContext(), Dashboard.class);
        startActivity(intent1);
    }
    public void sobrenos(View view) {

        Intent intent2 = new Intent(getApplicationContext(), quemsomos.class);
        startActivity(intent2);
    }
    public void contato(View view) {

        Intent intent3 = new Intent(getApplicationContext(), contato.class);
        startActivity(intent3);
    }
    public void perfil(View view) {

        Intent intent4 = new Intent(getApplicationContext(), perfil.class);
        startActivity(intent4);
    }
    public void oquee(View view) {

        Intent intent5 = new Intent(getApplicationContext(), oquee.class);
        startActivity(intent5);
    }
    public void blog(View v) {
        String url = "http://gislaineprofessora.blogspot.com/";

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}