package com.example.pim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void BTC(View view) {

        Intent intent3 = new Intent(getApplicationContext(), BTC.class);
        startActivity(intent3);
    }
    public void BCH(View view) {

        Intent intent4 = new Intent(getApplicationContext(), BCH.class);
        startActivity(intent4);
    }
    public void ETH(View view) {

        Intent intent5 = new Intent(getApplicationContext(), ETC.class);
        startActivity(intent5);
    }
    public void ETC(View view) {

        Intent intent6 = new Intent(getApplicationContext(), ETH.class);
        startActivity(intent6);
    }
    public void XRP(View view) {

        Intent intent7= new Intent(getApplicationContext(), XRP.class);
        startActivity(intent7);
    }
    public void LTC(View view) {

        Intent intent8= new Intent(getApplicationContext(), LTC.class);
        startActivity(intent8);
    }
    public void YFI(View view) {

        Intent intent9= new Intent(getApplicationContext(), YFI.class);
        startActivity(intent9);
    }
    public void ZRX(View view) {

        Intent intent10= new Intent(getApplicationContext(), ZRX.class);
        startActivity(intent10);
    }

    public void DRC(View view) {

        Intent intent11= new Intent(getApplicationContext(), DRC.class);
        startActivity(intent11);
    }
    public void DASH(View view) {

        Intent intent12= new Intent(getApplicationContext(), DASH.class);
        startActivity(intent12);
    }
}